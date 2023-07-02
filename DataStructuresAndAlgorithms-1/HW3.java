package ödev3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW3 {

}


// Node class representing each product in the BST
class Node {
    // Fields for each product: ID, name, and quantity
    int id;
    String name;
    int piece;
    // Pointers to left and right child nodes
    Node left;
    Node right;

    // Constructor for creating a new product
    public Node(int id, String name, int piece) {
        this.id = id;
        this.name = name;
        this.piece = piece;
    }
}

// Binary search tree (BST) class representing the overall inventory
class BinarySearchTree {
    // Root node of the BST
    Node root;

    // Method for inserting a new product into the BST
    public void insert(int id, String name, int piece) {
        // Recursive helper method is called with root node as starting point
        root = insertRecursive(root, id, name, piece);
    }

    // Recursive helper method for inserting a new product into the BST
    private Node insertRecursive(Node current, int id, String name, int piece) {
        // If the current node is null, create a new product node and return it
        if (current == null) {
            return new Node(id, name, piece);
        }

        // If the ID of the new product is less than the ID of the current node,
        // insert the new product in the left subtree
        if (id < current.id) {
            current.left = insertRecursive(current.left, id, name, piece);
        }
        // If the ID of the new product is greater than the ID of the current node,
        // insert the new product in the right subtree
        else if (id > current.id) {
            current.right = insertRecursive(current.right, id, name, piece);
        }

        // Return the current node
        return current;
    }

    // Method for searching for a product in the BST
    public boolean isProductAvailable(int id) {
        // Call recursive helper method with root node as starting point
        Node found = searchRecursive(root, id);
        // If the product is not found, print a message and return false
        if (found == null) {
            System.out.println("The product is out of stock!!!");
            return false;
        }
        // If the product is found, print the quantity and return true
        else {
            System.out.println("Product is available. Quantity: " + found.piece);
            return true;
        }
    }
    // Recursive helper method for searching for a product in the BST
    private Node searchRecursive(Node current, int id) {
        // If the current node is null, return null (product not found)
        if (current == null) {
            return null;
        }

        // If the ID of the current node matches the search ID, return the node
        if (id == current.id) {
            return current;
        }

        // If the search ID is less than the ID of the current node,
        // search the left subtree
        if (id < current.id) {
            return searchRecursive(current.left, id);
        }
        // If the search ID is greater than the ID of the current node,
        // search the right subtree
        else {
            return searchRecursive(current.right, id);
        }
    }
}
