//ALEYNA ALEMDAR- AŞKIN GÜNDÜZ
import java.io.*;
import java.util.*;


class Customer implements Comparable<Customer> {
    int id;
    int ry;
    int at;
    int dt;

   // Constructor for a customer, taking in their id, registration year, arrival time, and delivery time as parameters
public Customer(int id, int ry, int at, int dt) {
    // Initializing them
    this.id = id;
    this.ry = ry;
    this.at = at;
    this.dt = dt;
}

// Override the compareTo method to compare customers 
@Override
public int compareTo(Customer other) {
    // Compare based on registration year, with longer-standing customers having higher priority
    int yearDiff = other.ry - ry;
    if (yearDiff != 0) {
        return yearDiff;
    }

    return at - other.at;
}

}