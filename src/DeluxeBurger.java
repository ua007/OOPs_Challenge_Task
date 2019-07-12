public class DeluxeBurger {
    
    public DeluxeBurger(double price, String meat, String bun) {
        super(price, meat, bun);
        this.setName("Deluxe Burger");


        this.addTopping(new Additional("Chips",0.0));
        this.addTopping(new Additional("Drink",0.0));

        // no additional to be added.
        this.setMaxToppings(2);
    }

    private void setName(String deluxe_burger) {
    }

}
