package Soru1;

import java.util.*;

public class Taxi_Rides {
    public static void main(String[] args) {
        
        Scanner kulak = new Scanner(System.in);

        System.out.println("Enter the number of taxi pickups:");
        int picks_numbers,numbers;
        picks_numbers= kulak.nextInt();
        kulak.nextLine();

        System.out.println("Enter the number of taxi rides:");
        numbers  = kulak.nextInt();
        kulak.nextLine();

        System.out.println("Enter the taxi rides:");
        List<String> taxi_rides_list = new ArrayList<>();
        
        int i = 0;
        // Loop through input values for add them to list
        while (i < numbers){
             String t_ride= kulak.nextLine();
            taxi_rides_list.add(t_ride);
            i++;
        }

        Map<String, List<String>> rides_network_ = new LinkedHashMap<>(); 
        // for storing rides network
        
        for (String t_ride : taxi_rides_list) {
            String[] split_p = t_ride.split(" ");
            
            String from,to ;
            from= split_p[0];
            to = split_p[1];
            
             // adding vertex if it is not currenlty there
            if (!rides_network_.containsKey(from)) {
                rides_network_.put(from, new ArrayList<>());
            }
            
            // adding edge
            rides_network_.get(from).add(to);
            
            if (!rides_network_.containsKey(to)) {
                rides_network_.put(to, new ArrayList<>());
            }
        }
        for (String str : rides_network_.keySet()) { // for printing purposes
            
            List<String> list = rides_network_.get(str);
            System.out.print(str + ": ");
            Collections.reverse(list);
            
            for (String to : list) {
                System.out.print(to + " ");
            }
            System.out.println();
        }
        boolean value = directedTree(rides_network_); // i am looking for ride network could be helded in a tree  
        
        int intValue = value ? 1 : 0;
        
       switch (intValue) {
    case 1:
        System.out.println("This ride network can be kept in a tree structure.");
        break;
    case 0:
        System.out.println("This ride network cannot be kept in a tree structure.");
        break;
}
    }

    public static boolean directedTree(Map<String, List<String>> rides_network_) {
        // i am checking in this method if rides network could be represented as a tree
        int vert_,edg_;
        vert_= rides_network_.size();
        edg_ = 0;
        
        Set<String> already = new HashSet<>();

        for (String str : rides_network_.keySet()) { 
            //using dfs
            if (!already.contains(str)) {
                boolean cycle_detect = cycle_detect(rides_network_, str, already, new HashSet<>());
                if (cycle_detect) {
                    // detecting cycles
                    return false;
                }
            }
        }

       
        for (List<String> list : rides_network_.values()) {
            edg_ += list.size();
        }

        // checking for the condition
        return edg_ == vert_ - 1;
    }

    public static boolean cycle_detect(Map<String, List<String>> rides_network_, String str, Set<String> already , Set<String> currently) {
        already.add(str);
       currently.add(str);
// recursive
// !!!!
        List<String> list = rides_network_.get(str);
        
        if (list != null) {
            for (String to : list) {
                if (!already.contains(to)) {
                    boolean cycle_detect = cycle_detect(rides_network_, to, already, currently);
                    if (cycle_detect) {
                        return true;
                    }
                } else if (currently.contains(to)) {
                    return true;
                    // returning true if cycle detected, returning false is not.
                }
            }
        }

        currently.remove(str);
        return false;
    }
}