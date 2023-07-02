package ödev3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InventoryTrackingSystem {
    public static void main(String[] args) {
        // Create a new BST object to represent the inventory
        BinarySearchTree bst = new BinarySearchTree();
        // Print a welcome message
        System.out.println("--------------- WELCOME TO ITS ---------------");

        // Read input from the input file
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/berx/Desktop/input_Q1.txt"));
            String line = reader.readLine();
            while (line != null) {
                // Split the input line into operation and arguments
                String[] parts = line.split(" ");
                String operation = parts[0];
                // Check which operation is being requested
                if (operation.equals("create")) {
                    // Read the ID, name, and quantity of the new product
                    int id = Integer.parseInt(parts[1]);
                    String name = parts[2];
                    int piece = Integer.parseInt(parts[3]);
                    // Insert the new product into the BST
                    bst.insert(id, name, piece);
                    // Print a message indicating that the product was created
                    System.out.println("Create Product:");
                    System.out.println(" ID: " + id);
                    System.out.println(" Name: " + name);
                    System.out.println(" Piece: " + piece);
                } else if (operation.equals("available")) {
                    // Read the ID of the product being searched for
                    int id = Integer.parseInt(parts[1]);
                    // Search for the product in the BST
                    bst.isProductAvailable(id);
                } else if (operation.equals("quit")) {
                    // Exit the program
                    break;
                }
                // Read the next line of input
                line = reader.readLine();
            }
            // Close the input file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print a goodbye message
        System.out.println("Thank you for using ITS, Good Bye!");
    }
}