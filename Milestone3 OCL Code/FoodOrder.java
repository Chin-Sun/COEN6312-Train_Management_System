import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FoodOrder {
    private static final Set<String> existingOrderIDs = new HashSet<>();

    private String orderID;
    private List<MenuItem> items;
    private double totalPrice;

    public FoodOrder(String orderID, List<MenuItem> items) {
        // Constraint 2: A FoodOrder must have a unique orderID
        if (existingOrderIDs.contains(orderID)) {
            throw new IllegalArgumentException("Order ID must be unique.");
        }
        existingOrderIDs.add(orderID);

        this.orderID = orderID;
        setItems(items); // This will also calculate the total price
    }

    public String getOrderID() {
        return orderID;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to set items and calculate total price
    public void setItems(List<MenuItem> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Items list cannot be null or empty.");
        }
        this.items = items;
        calculateTotalPrice();
    }

    // Method to calculate the total price based on the items
    private void calculateTotalPrice() {
        // Constraint 3: Each FoodOrder’s total price should be the sum of the prices of its menu items.
        this.totalPrice = items.stream()
                               .mapToDouble(MenuItem::getPrice)
                               .sum();
    }
    
    // Additional methods like addItem, removeItem, etc. could be implemented here.
}

class MenuItem {
    private String name;
    private double price;
    // Other attributes and methods...

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    // Other getters and setters...
}
