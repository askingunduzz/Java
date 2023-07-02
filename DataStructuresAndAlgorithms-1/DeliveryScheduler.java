//ALEYNA ALEMDAR- AŞKIN GÜNDÜZ
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


//    C:\\Users\\askin\\OneDrive\\Masaüstü\\HW4\\sampleinput1.txt
//   /Users/Berx/Desktop/sampleinput1.txt

public class DeliveryScheduler {
    public static void main(String[] args) {
        // Read the input data from the file
        System.out.println("Enter the input filename:");
        Scanner inputScanner = new Scanner(System.in);
        String inputFilename = inputScanner.nextLine();
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File(inputFilename));
        } catch (FileNotFoundException e) {
            System.out.println("Error: input file not found");
            return;
        }
        System.out.println("Enter the maximum average waiting time:");
        int maxAverageWaitTime = inputScanner.nextInt();
        int numCustomers = 0;

        if (fileScanner.hasNextInt()) {
            numCustomers = fileScanner.nextInt();
        }

        // Initialize the priority queue and list of couriers
        PriorityQueue queue = new PriorityQueue(numCustomers);
        List<Courier> couriers = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        // Initialize the running total of waiting times and the number of customers
        int totalWaitTime = 0;
        int numCustomersProcessed = 0;

        // Process each customer
        while (fileScanner.hasNext()) {
            int id = fileScanner.nextInt();
            int registrationYear = fileScanner.nextInt();
            int arrivalTime = fileScanner.nextInt();
            int deliveryTime = fileScanner.nextInt();

            // Add the customer to the priority queue
            queue.add(new Customer(id, registrationYear, arrivalTime, deliveryTime));

            // Find the courier with the shortest wait time
            Courier shortestWaitCourier = null;
            for (Courier courier : couriers) {
                if (shortestWaitCourier == null || courier.waitTime < shortestWaitCourier.waitTime) {
                    shortestWaitCourier = courier;
                }
            }

            // If no couriers are available or the wait time for the customer
            // with the shortest wait time is longer than the maximum allowed,
            // add a new courier
            if (shortestWaitCourier == null || shortestWaitCourier.waitTime > maxAverageWaitTime) {
                couriers.add(new Courier(couriers.size()));
                shortestWaitCourier = couriers.get(couriers.size() - 1);
            }

            // Assign the customer to the courier with the shortest wait time
            Customer c = queue.poll();
            shortestWaitCourier.processCustomer(c);
            totalWaitTime += shortestWaitCourier.currentTime - c.at;
            numCustomersProcessed++;
        }

        // Calculate and output the average waiting time
        double averageWaitTime = (double) totalWaitTime / numCustomersProcessed;
        System.out.println("Average waiting time: " + averageWaitTime + " mins");

        // Output the minimum number of couriers needed to meet the maximum average waiting time requirement
        int minNumCouriers = (int) Math.ceil(averageWaitTime / maxAverageWaitTime);
        System.out.println("Minimum number of couriers required: " + minNumCouriers);
        System.out.println("Simulation with " + minNumCouriers + " Couriers:");

        // Reset the priority queue and list of couriers
        queue = new PriorityQueue(numCustomers);
        couriers = new ArrayList<>();
        for (int i = 0; i < minNumCouriers; i++) {
            couriers.add(new Courier(i));
        }


    }
}