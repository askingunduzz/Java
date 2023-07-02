package ödev3_soru2;
import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

import java.util.InputMismatchException;

class Captain {
	  int id;
	  String name;
	  boolean available;
	  int rating;

	  public Captain(int id, String name) {
	    this.id = id;
	    this.name = name;
	    this.available = true;
	    this.rating = 0;
	  }
	}

	class CaptainBST {
	  Captain root;

	  public void addCaptain(int id, String name) {
	    root = addCaptainRecursive(root, id, name);
	  }

	  private Captain addCaptainRecursive(Captain current, int id, String name) {
	    if (current == null) {
	      return new Captain(id, name);
	    }
	    if (id < current.id) {
	      current.left = addCaptainRecursive(current.left, id, name);
	    } else if (id > current.id) {
	      current.right = addCaptainRecursive(current.right, id, name);
	    } else {
	      // id already exists, cannot add new captain
	      return current;
	    }

	    return current;
	  }

	  public boolean deleteCaptain(int id) {
	    root = deleteCaptainRecursive(root, id);
	    return deleted;
	  }

	  private Captain deleteCaptainRecursive(Captain current, int id) {
	    if (current == null) {
	      deleted = false;
	      return null;
	    }

	    if (id == current.id) {
	      // captain found, delete the node
	      if (current.left == null && current.right == null) {
	        return null;
	      }
	      if (current.right == null) {
	        return current.left;
	      }
	      if (current.left == null) {
	        return current.right;
	      }
	      int smallestValue = findSmallestValue(current.right);
	      current.id = smallestValue;
	      current.right = deleteCaptainRecursive(current.right, smallestValue);
	      return current;
	    }
	    if (id < current.id) {
	      current.left = deleteCaptainRecursive(current.left, id);
	      return current;
	    }
	    current.right = deleteCaptainRecursive(current.right, id);
	    return current;
	  }

	  private int findSmallestValue(Captain root) {
	    return root.left == null ? root.id : findSmallestValue(root.left);
	  }

	  public Captain getCaptain(int id) {
	    return getCaptainRecursive(root, id);
	  }

	  private Captain getCaptainRecursive(Captain current, int id) {
	    if (current == null) {
	      return null;
	    }
	    if (id == current.id) {
	      return current;
	    }
	    return id < current.id
	      ? getCaptainRecursive(current.left, id)
	      : getCaptainRecursive(current.right, id);
	  }

	  public void printCaptains() {
	    printCaptainsRecursive(root);
	  }

	  private void printCaptainsRecursive(Captain current) {
	    if (current != null) {
	      printCaptainsRecursive(current.left);
	      System.out.println(current.id + " " + current.name + " " + current.available + " " + current.rating);
	      printCaptainsRecursive(current.right);
	    }
	    }
	  public void rentCar(int id) {
		  Captain captain = getCaptain(id);
		  if (captain == null) {
		  System.out.println("Couldn't find any captain with ID number " + id);
		  return;
		  }
		  if (!captain.available) {
		  System.out.println("The captain is not available. He is on another ride!");
		  return;
		  }
		  captain.available = false;
		  }

		  public void finishRide(int id, int rating) {
		  Captain captain = getCaptain(id);
		  if (captain == null) {
		  System.out.println("Couldn't find any captain with ID number " + id);
		  return;
		  }
		  if (captain.available) {
		  System.out.println("The captain is not in a ride!");
		  return;
		  }
		  captain.available = true;
		  captain.rating += rating == 1 ? 1 : -1;
		  captain.rating = Math.max(0, captain.rating);
		  captain.rating = Math.min(5, captain.rating);
		  }
		  }