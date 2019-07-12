public class HealthyBurger {

    // up to 6 toppings
    private Additional additional5;
    private Additional additional6;

    public HealthyBurger(double price, String meat) {
        super(price, meat, "brown rye");
        this.setName("Healthy Burger");
        this.setMaxToppings(6);
    }

    @Override
    public void addTopping(Additional additional) {
        if (this.getToppings() < this.getMaxToppings()) {
            switch (this.getToppings()) {
                case 0:
                    this.setAdditional1(additional);
                    break;
                case 1:
                    this.setAdditional2(additional);
                    break;
                case 2:
                    this.setAdditional3(additional);
                    break;
                case 3:
                    this.setAdditional4(additional);
                    break;
                case 4:
                    this.additional5 = additional;
                    break;
                case 5:
                    this.additional6 = additional;
                    break;
                default:
                    System.out.println("error in method addTopping");
            }
            // add additional to total count
            incrementToppings();
            // let user know additional was added
            System.out.println(additional.getName() + " has been added to your order.");
        } else {
            System.out.println("You have exceeded your additional limit.");
            System.out.println(additional.getName() + " cannot be added.");
        }
    }

    @Override
    public void displayPrice() {
        System.out.println("\nPrinting receipt...");
        // base price
        System.out.println(this.getName() +
                ", " + this.getMeat() +
                ", " + this.getBun() + " bun: " +
                String.format("$%.2f", this.getPrice()));

        // topping price(s)
        if (this.getAdditional1()!= null) System.out.println(getAdditional1().getName() + " : " + getAdditional1().displayPrice());
        if (this.getAdditional2()!= null) System.out.println(getAdditional2().getName() + " : " + getAdditional2().displayPrice());
        if (this.getAdditional3()!= null) System.out.println(getAdditional3().getName() + " : " + getAdditional3().displayPrice());
        if (this.getAdditional4()!= null) System.out.println(getAdditional4().getName() + " : " + getAdditional4().displayPrice());
        if (this.additional5 != null) System.out.println(additional5.getName() + " : " + additional5.displayPrice());
        if (this.additional6 != null) System.out.println(additional6.getName() + " : " + additional6.displayPrice());
        // total price
        System.out.println("---------------");
        System.out.println("Total: " + String.format("$%.2f", calculatePrice()));
        System.out.println();
    }

    // calculatePrice
    public double calculatePrice() {
        double total = super.calculatePrice();
        if (this.additional5 != null) total += additional5.getPrice();
        if (this.additional6 != null) total += additional6.getPrice();
        return total;
    }

}
