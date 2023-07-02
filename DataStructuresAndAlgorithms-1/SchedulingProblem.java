import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SchedulingProblem {
	
	
	 public static void main(String[] args) throws IOException {
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter input filename:");
	        String a=scan.nextLine();
	        //    C:\\Users\\askin\\OneDrive\\Masaüstü\\HW4\\sampleinput1.txt
	        //   /Users/Berx/Desktop/sampleinput1.txt
	        Scanner input = new Scanner(new BufferedReader(new FileReader(a)));
	        SchedulingProblem sp = new SchedulingProblem(input);
	        sp.queue = new PriorityQueue<Customer>(sp.numCustomers);
	        System.out.println("Enter the maximum average waiting time:");
	        int maxAverageWaitingTime = scan.nextInt();
	        int numCustomersServed = numCustomers - queue.size();
	        System.out.println("aaa"+numCustomersServed);
	        System.out.println("bbb"+queue.size());
	        System.out.println("ccccc"+maxAverageWaitingTime);
	        double averageWaitingTime = sp.simulate(maxAverageWaitingTime);
	        System.out.println("averageWaitingTime"+ averageWaitingTime);
	      //  double averageWaitingTime = (double) totalWaitingTime / numCustomersServed;

	        System.out.println("Minimum number of couriers: " + sp.numCouriers);
	        System.out.println("Average waiting time: " + averageWaitingTime);
	    }
	
	
    private static final int MAX_CUSTOMERS = 200;
    private static final int MIN_YEARS_REGISTERED = 50;

    private Customer[] customers;
    private static  int numCustomers;
    private int numCouriers;
    private static PriorityQueue<Customer> queue;
    private static int totalWaitingTime;
    private int currentTime;
    private Courier[] couriers;
    private int numcus;

    public SchedulingProblem(Scanner input) {
        numCustomers = input.nextInt();
        numcus=numCustomers;
        customers = new Customer[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            int id = input.nextInt();
            int yearRegistered = input.nextInt();
            int arrivalTime = input.nextInt();
            int serviceTime = input.nextInt(); //sure ne kadar surede hazırlanı gereklı olan requiredtime
            customers[i] = new Customer(id, yearRegistered, arrivalTime, serviceTime);
        }
    }

    public double simulate(int maxAverageWaitingTime) {
        queue = new PriorityQueue(numCustomers);
        totalWaitingTime = 0;
        currentTime = 1;
        numCouriers = 0;
        couriers = new Courier[numCustomers];

        // Keep simulating until all customers have been served
     //   while (numCustomers > 0) {
      //  while(queue.size()>0) {
        	while(numCustomers > queue.size()+1) {
        		 System.out.println("qqqqqq"+queue);
            // Add any new customers to the queue
            for (int i = 0; i < numCustomers; i++) {
                Customer c = customers[i];
                System.out.println("currenttime"+currentTime);
                if (c.getArrivalTime() == currentTime) {
                    queue.add(c);
                    
                }
            }

            // Assign customers to available couriers
            for (int i = 0; i < numCouriers; i++) {
                Courier courier = couriers[i];
                if (courier.isAvailable() && !queue.isEmpty()) {
                    Customer c = queue.poll();
                    totalWaitingTime += (currentTime - c.getArrivalTime());
                    courier.assignCustomer(c);
                    removeCustomer(c);
                }
            }
        
            System.out.println("queuesize"+queue.size());
            
         
            // Add new couriers if necessary
       //     if(numCustomers-queue.size()!=0) {
            System.out.println("aaaaaaaaaaaa "+(numCustomers-queue.size()));
            System.out.println("totalwaitingtime"+totalWaitingTime);
            	if (!queue.isEmpty() && (totalWaitingTime / (numCustomers) < maxAverageWaitingTime)) { //numCustomers-queue.size()
                couriers[numCouriers] = new Courier(numCouriers);
                System.out.println("hmmm");
                numCouriers++;
            	}
         //    }
            // Advance time and update courier availability
            currentTime++;
            for (int i = 0; i < numCouriers; i++) {
                couriers[i].updateAvailability();
                System.out.println("aaaaa");
            }
        
        
                 
              System.out.println("tttt"+totalWaitingTime+"aaaaa"+numcus);
        		System.out.println("return"+totalWaitingTime/numcus);
        	}
        return totalWaitingTime / numcus; //numCustomers
    }

    private void removeCustomer(Customer c) {
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i].getId() == c.getId()) {
                customers[i] = customers[numCustomers - 1];
                numCustomers--;
                break;
            }
        }
    }
   

}