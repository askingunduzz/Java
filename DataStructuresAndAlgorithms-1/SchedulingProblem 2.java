package nehir;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

//   C:\\Users\\askin\\OneDrive\\Masaüstü\\HW4\\sampleinput1.txt

public class SchedulingProblem {
    private static final int MAX_CUSTOMERS = 200;

    private Customer[] customers;
    private static int numCustomers;
    private int numCouriers = 1;
    private static PriorityQueue<Customer> queue;
    private static int totalWaitingTime = 0;
    public static int currentTime = 0;
    private Courier[] couriers;


    public SchedulingProblem(Scanner input) {
        numCustomers = input.nextInt();
        customers = new Customer[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            int id = input.nextInt();
            int yearRegistered = input.nextInt();
            int arrivalTime = input.nextInt();
            int serviceTime = input.nextInt();
            customers[i] = new Customer(id, yearRegistered, arrivalTime, serviceTime);
        }
    }

    public int simulate(int maxAverageWaitingTime) {
        queue = new PriorityQueue(numCustomers);
        couriers = new Courier[numCustomers];
        // couriers[0]=new Courier(0);
        int numCustomersServed = 0;

        // Add a condition to terminate the loop when all the customers have been served
        while (numCustomersServed < numCustomers) {
            for (int i = 0; i < numCustomers; i++) {
                Customer c = customers[i];
                if (c.getArrivalTime() <= currentTime) {
                    queue.add(c);
                    numCustomersServed++;
                }
            }

            for (int i = 0; i < numCouriers; i++) {
                Courier courier = couriers[i];

                if (courier != null && courier.isAvailable() && !queue.isEmpty()) {
                    System.out.println("for loop and if");
                    Customer c = queue.poll();
                    totalWaitingTime += (currentTime - c.getArrivalTime());
                    courier.assignCustomer(c);
                    removeCustomer(c);
                    currentTime += c.getServiceTime();
                    numCustomersServed++;

                    if (queue.size() > 0 && totalWaitingTime / queue.size() > maxAverageWaitingTime) {
                        System.out.println("evet");
                        couriers[numCouriers] = new Courier(numCouriers);
                        numCouriers++;
                    }
                }

                for (int j = 0; j < numCouriers; j++) {
                    // Add a check to make sure that couriers[j] is not null
                    if (couriers[j] != null) {
                        couriers[j].updateAvailability();
                    }
               //     couriers[j].updateAvailability();
                }

            }
            currentTime++;
        }

        int averageWaitingTime = numCustomersServed == 0 ? -1 : totalWaitingTime / numCustomersServed;
        return averageWaitingTime;
    }

    private void removeCustomer(Customer c) {
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i] == c) {
                customers[i] = null;
                break;
            }
        }
    }

    public void printCourierAssignments() {
        for (int i = 0; i < couriers.length; i++) {
            Courier courier = couriers[i];
            if (courier == null || courier.getAssignedCustomer() == null) continue;
            System.out.println("Courier " + courier.getId() + " takes customer " +
                    courier.getAssignedCustomer().getId() + " at minute " +
                    courier.getAssignedTime() + " (wait: " + (courier.getAssignedTime()
                    - courier.getAssignedCustomer().getArrivalTime()) + " mins)");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input filename: ");
        String filename = scan.next();
                                         /*
        scan = new Scanner(new BufferedReader(new FileReader(filename)));

        SchedulingProblem sp = new SchedulingProblem(scan);

                                          */

        SchedulingProblem sp = null;
        try {
            sp = new SchedulingProblem(new Scanner(new BufferedReader(new FileReader(filename))));
        } catch (IOException e) {
            System.out.println("Error reading from file " + filename + ": " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Enter the maximum  average waiting time: ");
        int maxAverageWaitingTime = scan.nextInt();

        int minCouriers = sp.getMinCouriers(maxAverageWaitingTime);

        System.out.println("Minimum number of couriers required: " + minCouriers);
        System.out.println("Simulation with " + minCouriers + " Couriers:");
        sp.simulate(maxAverageWaitingTime);
        sp.printCourierAssignments();
        //  System.out.println("Average waiting time: " + avgWaitTime + " minutes");


        //    int numCouriers = 1;

        //     System.out.println("yes");


        //  System.out.println("no");
        /*
        while (averageWaitingTime > maxAverageWaitingTime) {
            numCouriers++;
            System.out.println("Simulation with " + numCouriers + " Couriers:");
                averageWaitingTime = sp.simulate(maxAverageWaitingTime);
        }

         */

        //  System.out.println("Minimum number of couriers required: " + numCouriers);
        sp.simulate(maxAverageWaitingTime);

        System.out.println("Minimum number of couriers: " + sp.numCouriers);
        System.out.println("Simulation with " + sp.numCouriers + " Couriers: ");
        //  System.out.println("Average waiting time: " + sp.averageWaitingTime);
        System.out.println("Average waiting time: " + sp.simulate(maxAverageWaitingTime));


    }

    public int getMinCouriers(int maxAverageWaitingTime) {
        int minCouriers = 1;
        while (simulate(maxAverageWaitingTime) > maxAverageWaitingTime) {
            minCouriers++;
        }
        return minCouriers;
    }
}