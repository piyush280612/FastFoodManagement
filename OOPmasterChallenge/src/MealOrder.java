public class MealOrder {
    private Hamburger burger;
    private Drink drink;
    private SideItem sideItem;

    //  Default Constructor (Most Common Order)
    public MealOrder() {
        this.burger = new Hamburger("Regular Burger", 1, 7, "Lettuce", "Tomato", "Cheese", 1.5); // Added default toppingPrice
        this.drink = new Drink("Coke", 300, 10); // Added default base price for drink
        this.sideItem = new SideItem("Fries", 10);
    }

    //  Custom Meal Order Constructor
    public MealOrder(Hamburger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    //  Calculate Total Cost
    public double calculateTotalCost() {
        return burger.calculatePrice() + drink.calculateDrinkCost() + sideItem.getPrice();
    }

    //  Display Order Details
    public void displayMealOrder() {
        System.out.println("🍔 Meal Order Details:");
        burger.orderHamburger();
        sideItem.foodItemType();
        System.out.println("🥤 Drink: " + drink.getDrinkType() + " (" + drink.getDrinkSize() + "ml) - $" + drink.calculateDrinkCost());
        System.out.println("💰 Total Cost: $" + calculateTotalCost());
    }
}

