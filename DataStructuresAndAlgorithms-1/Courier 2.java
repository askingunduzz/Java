class Courier {
    private int id;
    private int availableTime,arrivalTime;
    private boolean available;

    public Courier(int id) {
        this.id = id;
        this.availableTime = 0;
        this.available = true;
    }

    public int getId() {
        return id;
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

    public void assignCustomer(Customer c) {
        this.available = false;
        this.availableTime = c.getArrivalTime() + c.getServiceTime();
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
