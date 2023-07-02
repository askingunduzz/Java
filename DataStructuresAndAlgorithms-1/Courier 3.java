package nehir;
class Courier {
    private int id;
    private int availableTime,arrivalTime;
    private boolean available;
    private int serviceTimeRemaining;
    private Customer currentCustomer;
    private int startTime;

    public Courier(int id) {
        this.id = id;
        this.availableTime = 0;
        this.available = true;
        serviceTimeRemaining = 0;
        currentCustomer = null;
        startTime = 0;
    }
    public void assignCustomer(Customer c) {
        currentCustomer = c;
        serviceTimeRemaining = c.getServiceTime();
        startTime = SchedulingProblem.currentTime;
    }

    public int getId() {
        return id;
    }
    public int getStartTime() {
        return startTime;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public int getAssignedTime() {
        return SchedulingProblem.currentTime - startTime;
    }

    public Customer getAssignedCustomer() {
        return currentCustomer;
    }



    public int getAvailableTime() {
        return availableTime;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void updateAvailability() {
        if (!isAvailable()) {
            setAvailableTime(getAvailableTime() - 1);
            if (getAvailableTime() == 0) {
                setAvailable(true);
            }
        }
    }
}