public class Customer {

    public String name;
    public int height;
    public double wallet;

    public Customer(String name, int height, double wallet) {
        this.name = name;
        this.height = height;
        this.wallet = 25.50;
    }

    public double getWallet() {
        return this.wallet;
    }

}