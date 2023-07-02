package ödev3_soru2;

public class BinarySearchTree {
    public Node root;

    public void addCaptain(Captain captain) {
        root = addCaptain(root, captain);
    }

    public Node addCaptain(Node node, Captain captain) {
        if (node == null) {
            return new Node(captain);
        }
        if (captain.getId() < node.captain.getId()) {
            node.left = addCaptain(node.left, captain);
        } else {
            node.right = addCaptain(node.right, captain);
        }
        return node;
    }

    public void deleteCaptain(int id) {
        root = deleteCaptain(root, id);
    }

    public Node deleteCaptain(Node node, int id) {
        if (node == null) {
            return null;
        }
        if (id < node.captain.getId()) {
            node.left = deleteCaptain(node.left, id);
        } else if (id > node.captain.getId()) {
            node.right = deleteCaptain(node.right, id);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.captain = findMin(node.right).captain;
                node.right = deleteCaptain(node.right, node.captain.getId());
            }
        }
        return node;
    }

public Node findMin(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }


    public Captain findCaptain(int id) {
        Node node = findCaptain(root, id);
        if (node == null) {
            return null;
        }
        return node.captain;
    }

    public Node findCaptain(Node node, int id) {
    if (node == null || node.captain.getId() == id) {
        return node;
    }
    if (id < node.captain.getId()) {
        return findCaptain(node.left, id);
    } else {
        return findCaptain(node.right, id);
    }
} 
public void displayCaptain(int id) {
    Captain captain = findCaptain(id);
    if (captain == null) {
        System.out.println("Couldn't find any captain with ID number " + id);
    } else {
        System.out.println("Captain " + captain.getName() + " has a rating of " + captain.getRating() + " stars.");
    }
}

public void displayAllCaptains() {
    displayAllCaptains(root);
}

public void displayAllCaptains(Node node) {
    if (node != null) {
        displayAllCaptains(node.left);
        System.out.println("ID: " + node.captain.getId() + ", Name: " + node.captain.getName() + ", Available: " + node.captain.isAvailable() + ", Rating: " + node.captain.getRating() + " stars");
        displayAllCaptains(node.right);
    }
}

public void rentCar(int id) {
    Captain captain = findCaptain(id);
    if (captain == null) {
        System.out.println("Couldn't find any captain with ID number " + id);
    } else if (captain.isAvailable()) {
        captain.setAvailable(false);
        System.out.println("The car has been rented by Captain " + captain.getName() + " with ID " + captain.getId());
    } else {
        System.out.println("The captain is not available. He is on another ride!");
    }
}

public void finishRide(int id, int satisfaction) {
    Captain captain = findCaptain(id);
    if (captain == null) {
        System.out.println("Couldn't find any captain with ID number " + id);
    } else if (!captain.isAvailable()) {
        captain.setAvailable(true);
        if (satisfaction == 1) {
            captain.setRating(Math.min(captain.getRating() + 1, 5));
        } else {
            captain.setRating(Math.max(captain.getRating() - 1, 0));
        }
    } else {
        System.out.println("The captain is not in a ride!");
    }
}
}
