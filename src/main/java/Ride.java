public abstract class Ride {
    private String ride_name;
    private double price;
    private int min_age;
    private int max_height;


    public Ride(String ride_name, double price, int max_height, int min_age) {
        this.ride_name = ride_name;
        this.price = price;
        this.max_height = max_height;
        this.min_age = min_age;
    }

    public String getName() {
        return ride_name;
    }

    public double getPrice() {
        return price;
    }

    public int getMin_age() {
        return min_age;
    }

    public int getMax_height() {
        return max_height;
    }

    public double getPrice() {
        return this.price;
    }

    public double getMaxHeight() {
        return this.max_height;
    }
}
