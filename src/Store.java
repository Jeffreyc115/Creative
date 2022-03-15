public class Store {
    private boolean open;
    private String name;
    private double rating;
    private String hours;
    private int workers;

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void enterStore()
    {
        System.out.println("I have entered the store!");
    }
    public void leaveStore()
    {
        System.out.println("I have left the store!");
    }
}
