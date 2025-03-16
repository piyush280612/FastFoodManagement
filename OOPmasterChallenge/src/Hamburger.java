public class Hamburger {
    private String burgerType;
    private int numberOfBurger;
    private double burgerPrice;
    private String topping1;
    private String topping2;
    private String topping3;
    private double toppingPrice; // New field for additional topping cost

    //  Constructor
    public Hamburger(String burgerType, int numberOfBurger,
                     double burgerPrice, String topping1, String topping2, String topping3, double toppingPrice) {
        this.burgerType = burgerType;
        this.numberOfBurger = numberOfBurger;
        this.burgerPrice = burgerPrice;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.toppingPrice = toppingPrice; // Assigning topping price
    }

    //  Getters
    public int getNumberOfBurger() {
        return numberOfBurger;
    }

    public String getBurgerType() {
        return burgerType;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    //  Method to Calculate Total Price
    public double calculatePrice() {
        double totalPrice = numberOfBurger * burgerPrice;

        // Extra charge for toppings (if they are not null)
        if (topping1 != null && !topping1.isEmpty()) totalPrice += toppingPrice;
        if (topping2 != null && !topping2.isEmpty()) totalPrice += toppingPrice;
        if (topping3 != null && !topping3.isEmpty()) totalPrice += toppingPrice;

        return totalPrice;
    }

    //  Order Summary Method
    public void orderHamburger() {
        if (numberOfBurger <= 0) {
            System.out.println("❌ Please select a valid number of burgers.");
        } else {
            System.out.println("\n✅ Order Summary:");
            System.out.println("🍔 Burger Type: " + burgerType);
            System.out.println("🔢 Quantity: " + numberOfBurger);
            System.out.print("🥗 Toppings: ");

            boolean hasToppings = false;
            if (topping1 != null && !topping1.isEmpty()) { System.out.print(topping1 + " "); hasToppings = true; }
            if (topping2 != null && !topping2.isEmpty()) { System.out.print(topping2 + " "); hasToppings = true; }
            if (topping3 != null && !topping3.isEmpty()) { System.out.print(topping3); hasToppings = true; }

            if (!hasToppings) System.out.print("No extra toppings");

            System.out.println("\n💰 Price: $" + calculatePrice());
        }
    }
}
