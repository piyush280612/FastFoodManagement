public class Main {
    public static void main(String[] args) {
        // Custom Order Example
        Hamburger myBurger = new Hamburger("Cheese Burger", 2, 8, "Lettuce", "Onion", "Bacon", 2.0);
        Drink myDrink = new Drink("Pepsi", 500, 12);
        SideItem mySide = new SideItem("Garlic Bread", 15);

        MealOrder customOrder = new MealOrder(myBurger, myDrink, mySide);
        customOrder.displayMealOrder();

        System.out.println("\n========================\n");

        // Default Order Example
        MealOrder defaultOrder = new MealOrder();
        defaultOrder.displayMealOrder();
    }
}

