//ALEYNA ALEMDAR - AŞKIN GUNDUZ


class Courier {
    int id;
    int waitTime;
    int currentTime;


public Courier(int id) {
    // Initialize the id, wait time, and current time instance variables
    this.id = id;
    this.waitTime = 0;
    this.currentTime = 0;
}

//  processing a customer and update the courier's wait time and current time
public void processCustomer(Customer c) {
    // Add the difference between the current time and the customer's arrival time to the wait time
    waitTime += currentTime - c.at;
    // Add the delivery time to the current time
    currentTime += c.dt;
    // Print a message to the console indicating that the courier has taken a customer, with the current time and the wait time
    System.out.println("Courier " + id + " takes customer " + c.id + " at minute " + currentTime + " (wait: " + (currentTime - c.at) + " mins)");
}

}