public class Drink {
    private String drinkType;
    private int drinkSize; // In milliliters (ml)
    private double basePrice;

    //  Constants for Drink Sizes
    private static final int SMALL = 300;
    private static final int MEDIUM = 500;
    private static final int LARGE = 700;

    //  Constructor
    public Drink(String drinkType, int drinkSize, double basePrice) {
        this.drinkType = drinkType;
        if (drinkSize != SMALL && drinkSize != MEDIUM && drinkSize != LARGE) {
            System.out.println("⚠ Invalid drink size! Setting to default (Small).");
            this.drinkSize = SMALL;
        } else {
            this.drinkSize = drinkSize;
        }
        this.basePrice = basePrice;
    }


    //  Getters
    public String getDrinkType() {
        return drinkType;
    }

    public int getDrinkSize() {
        return drinkSize;
    }

    public double getBasePrice() {
        return basePrice;
    }

    //  Calculate Total Drink Price
    public double calculateDrinkCost() {
        double totalCost = basePrice; // Start with base price

        if (drinkSize == SMALL) {
            return totalCost; // No extra charge for small size
        } else if (drinkSize > SMALL && drinkSize <= MEDIUM) {
            return totalCost + 8; // Medium size extra charge
        } else {
            return totalCost + 13; // Large size extra charge
        }
    }

    //  Print Drink Details
    public void printDrinkDetails() {
        System.out.println("🥤 Drink: " + drinkType + " (" + drinkSize + "ml)");
        System.out.println("💰 Price: $" + calculateDrinkCost());
    }
}
