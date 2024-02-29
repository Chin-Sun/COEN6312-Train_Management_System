package Class;
// Nested MenuItem class
public class MenuItem {
    private String itemId;
    private String name;
    private double price;

    // Constructor
    public MenuItem(String itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    // Getter for itemId
    public String getItemId() {
        return itemId;
    }

    // Additional getters and setters as needed

    @Override
    public String toString() {
        // A simple toString implementation for demonstration
        return itemId + ": " + name + " - $" + price;
    }
    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}
