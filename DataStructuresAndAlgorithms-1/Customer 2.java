class Customer implements Comparable<Customer> {
    int id;
    int priority;
    int arrivalTime;
    int serviceTime;
    int waitingTime;
    int finishTime;

    public Customer(int id, int priority, int arrivalTime, int serviceTime) {
        this.id = id;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.waitingTime = 0;
        this.finishTime = 0;
    }
    public int getArrivalTime() {
        return arrivalTime;
    }
    public int getServiceTime() {
        return serviceTime;
    }
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Customer other) {
        // Compare based on priority
        if (this.priority != other.priority) {
            return other.priority - this.priority;
        }

        // If priorities are equal, compare based on waiting time
        return this.waitingTime - other.waitingTime;
    }
}
