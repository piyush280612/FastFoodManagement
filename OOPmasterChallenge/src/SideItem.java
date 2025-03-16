public class SideItem {
    private String itemType;
    private double price;

    //  Constructor
    public SideItem(String itemType, double price) {
        this.itemType = itemType;
        this.price = price; //  Corrected: Assigning price properly
    }

    //  Getters
    public String getItemType() {
        return itemType;
    }

    public double getPrice() {
        return price; // returns the correct price
    }

    //  Method to Calculate Final Price Based on Item Type
    public void foodItemType() {
        if (itemType.equalsIgnoreCase("FRENCH FRIES")) {
            price += 0;
        } else if (itemType.equalsIgnoreCase("GARLIC BREAD")) {
            price += 0;
        } else if (itemType.equalsIgnoreCase("CHOCO LAVA CAKE")) {
            price += 0;
        }
        System.out.println("🍟 The food item chosen is: " + getItemType() + " costing $" + price);
    }

}
