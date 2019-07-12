public class Additional {

    private String name;
    private double price;

    public Additional(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String displayPrice() {
        return Double.toString(this.price);
    }
}
