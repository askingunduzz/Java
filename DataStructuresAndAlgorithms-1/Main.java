package ödev3_soru2;
import java.util.Scanner;
import java.io.*;

public class Main{
public static void main(String[] args) {
    // Create a new binary search tree
    BinarySearchTree bst = new BinarySearchTree();

    // Read commands from the input file
    Scanner sc = null;
	try {
		 sc = new Scanner(new File("input.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    while (sc.hasNextLine()) {
        String line = sc.nextLine();
        String[] parts = line.split(" ");
        String command = parts[0];
        switch (command) {
            case "Add_Captain":
                int id = Integer.parseInt(parts[1]);
                String name = parts[2];
                Captain captain = new Captain(id, name);
                bst.addCaptain(captain);
                break;
            case "Delete_Captain":
                id = Integer.parseInt(parts[1]);
                bst.deleteCaptain(id);
                break;
            case "Is_Available":
                id = Integer.parseInt(parts[1]);
                Captain c = bst.findCaptain(id);
                if (c == null) {
                    System.out.println("Couldn't find any captain with ID number " + id);
                } else if (c.isAvailable()) {
                    System.out.println("The captain is available.");
                } else {
                    System.out.println("The captain is not available. He is on another ride!");
                }
                break;
            case "Display_Captain":
                id = Integer.parseInt(parts[1]);
                bst.displayCaptain(id);
                break;
            case "Display_All_Captains":
                bst.displayAllCaptains();
                break;
            case "Rent_Car":
    id = Integer.parseInt(parts[1]);
    Captain cc = bst.findCaptain(id);
    if (cc == null) {
        System.out.println("Couldn't find any captain with ID number " + id);
    } else if (cc.isAvailable()) {
        cc.setAvailable(false);
        System.out.println("The car has been rented by Captain " + cc.getName() + " with ID " + cc.getId());
    } else {
        System.out.println("The captain is not available. He is on another ride!");
    }
    break;
case "Finish":
id = Integer.parseInt(parts[1]);
int satisfaction = Integer.parseInt(parts[2]);
bst.finishRide(id, satisfaction);
break;
case "Quit":
return;
default:
System.out.println("Invalid command: " + command);
break;
}
}
}}

