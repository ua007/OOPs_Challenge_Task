public class Main {

    public static void main(String[] args) {

        String maida = "maida";
        String sunflowerseed = "sunflowerseed";
        String wheat = "whole wheat";


        Additional cheese   = new Additional("Cheese", 14.50f);
        Additional lettuce  = new Additional("Lettuce", 13.80f);
        Additional tomato   = new Additional("Tomato", 21.30f);
        Additional onion    = new Additional("Onion", 7.0f);
        Additional chips    = new Additional("Chips", 29.5f);
        Additional drink    = new Additional("Drink", 50.0f);


        System.out.println("Ordering a Bill's burger...");
        BillsBurger maxBurger = new BillsBurger(89.00f, "chicken", maida);
        maxBurger.addTopping(tomato);
        maxBurger.addTopping(chips);
        maxBurger.addTopping(drink);
        maxBurger.displayPrice();


        System.out.println("Ordering a Bill's burger...");
        BillsBurger overBurger = new BillsBurger(79.00f, "veggie", wheat);
        overBurger.addTopping(tomato);
        overBurger.addTopping(drink);
        overBurger.addTopping(new Additional("Should not be able to add",42.0f));
        overBurger.displayPrice();



        System.out.println("Ordering a Healthy burger...");
        HealthyBurger healthyBurger = new HealthyBurger(99.00f,"chicken");
        healthyBurger.addTopping(lettuce);
        healthyBurger.addTopping(tomato);
        healthyBurger.addTopping(onion);
        healthyBurger.addTopping(drink);
        healthyBurger.addTopping(new Additional("Should not be able to add",42.0f));
        healthyBurger.displayPrice();


        System.out.println("Ordering a Deluxe burger...");
        DeluxeBurger deluxeBurger = new DeluxeBurger(109.00f,"chicken", sunflowerseed);
        deluxeBurger.addTopping(new Additional("Should not be able to add",42.0f));
        deluxeBurger.displayPrice();
    }

}
