public class BillsBurger {

    private String name;
    private double price;
    private String meat;
    private String bun;

    // up to 4 toppings
    private int toppings;
    private int maxToppings;
    private Additional additional1;
    private Additional additional2;
    private Additional additional3;
    private Additional additional4;

    public BillsBurger(double price, String meat, String bun) {
        this.price = price;
        this.meat = meat;
        this.bun = bun;

        this.name = "Bill's Burger";
        this.toppings = 0;
        this.maxToppings = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }

    public String getBun() {
        return bun;
    }

    public int getToppings() {
        return toppings;
    }

    public void incrementToppings() {
        this.toppings += 1;
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    public Additional getAdditional1() {
        return additional1;
    }

    public void setAdditional1(Additional additional1) {
        this.additional1 = additional1;
    }

    public Additional getAdditional2() {
        return additional2;
    }

    public void setAdditional2(Additional additional2) {
        this.additional2 = additional2;
    }

    public Additional getAdditional3() {
        return additional3;
    }

    public void setAdditional3(Additional additional3) {
        this.additional3 = additional3;
    }

    public Additional getAdditional4() {
        return additional4;
    }

    public void setAdditional4(Additional additional4) {
        this.additional4 = additional4;
    }

    public void addTopping(Additional additional) {
        if (this.toppings < this.maxToppings) {
            switch (this.toppings) {
                case 0:
                    this.additional1 = additional;
                    break;
                case 1:
                    this.additional2 = additional;
                    break;
                case 2:
                    this.additional3 = additional;
                    break;
                case 3:
                    this.additional4 = additional;
                    break;
                default:
                    System.out.println("error in method addTopping");
            }
            // add additional to total count
            toppings += 1;
            // let user know additional was added
            System.out.println(additional.getName() + " has been added to your order.");
        } else {
            System.out.println("You have exceeded your additional limit.");
            System.out.println(additional.getName() + " cannot be added.");
        }
    }

    // displayPrice: show itemized and total
    public void displayPrice() {
        System.out.println("\nPrinting receipt...");
        // base price
        System.out.println(this.getName() +
                ", " + this.meat +
                ", " + this.bun + " bun: " +
                String.format("$%.2f", this.price));
        // topping price(s)
        if (this.additional1 != null) System.out.println(additional1.getName() + " : " + additional1.displayPrice());
        if (this.additional2 != null) System.out.println(additional2.getName() + " : " + additional2.displayPrice());
        if (this.additional3 != null) System.out.println(additional3.getName() + " : " + additional3.displayPrice());
        if (this.additional4 != null) System.out.println(additional4.getName() + " : " + additional4.displayPrice());
        // total price
        System.out.println("---------------");
        System.out.println("Total: " + String.format("$%.2f", calculatePrice()));
        System.out.println();
    }

    // calculatePrice
    public double calculatePrice() {
        double total = this.price;

        // add the topping prices
        if (this.additional1 != null) total += additional1.getPrice();
        if (this.additional2 != null) total += additional2.getPrice();
        if (this.additional3 != null) total += additional3.getPrice();
        if (this.additional4 != null) total += additional4.getPrice();

        return total;
    }

}
