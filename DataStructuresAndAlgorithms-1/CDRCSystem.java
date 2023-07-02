package ödev3_soru2;

import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

class CDRCSystem {
    Captain captainBST;

    public CDRCSystem() {
        this.captainBST = new Captain();
    }

    public void addCaptain(int id, String name) {
        captainBST.insert(id, name);
        System.out.println("Add Captain: Add a new captain record in the System");
        System.out.println("       ID: " + id);
        System.out.println("       Name: " + name);
        System.out.println("       Available: True");
        System.out.println("       Rating star: 0");
        System.out.println("----------------------------------------------------------------");
    }

    public void deleteCaptain(int id) {
        Node captain = captainBST.search(id);
        if (captain != null) {
            captainBST.delete(id);
            System.out.println("The captain left CDRC");
        } else {
            System.out.println("Couldn't find any captain with ID number " + id);
        }
    }

    public void updateCaptainAvailability(int id, boolean availability) {
        Node captain = captainBST.search(id);
        if (captain != null) {
            captain.available = availability;
            if (availability) {
                System.out.println("Finish: Finish ride with captain " + id);
                System.out.println("       ID: " + id);
                System.out.println("       Name: " + captain.name);
                System.out.println("       Available: " + captain.available);
                System.out.println("       Rating star: " + captain.rating);
            }}
            }
public void printCaptainInfo(int id) {
    Node captain = captainBST.search(id);
    if (captain != null) {
        System.out.println("Display Captain:");
        System.out.println("       ID: " + id);
        System.out.println("       Name: " + captain.name);
        System.out.println("       Available: " + captain.available);
        System.out.println("       Rating star: " + captain.rating);
    } else {
        System.out.println("Display Captain: Couldn't find any captain with ID number " + id);
    }
}


    public void printAllCaptains() {
        printAllCaptainsRecursive(captainBST.root);
    }

    private void printAllCaptainsRecursive(Node current) {
        if (current != null) {
            printAllCaptainsRecursive(current.left);
            System.out.println("--CAPTAIN:");
            System.out.println("       ID: " + current.id);
            System.out.println("       Name: " + current.name);
            System.out.println("       Available: " + current.available);
            System.out.println("       Rating star: " + current.rating);
            printAllCaptainsRecursive(current.right);
        }
    }
}