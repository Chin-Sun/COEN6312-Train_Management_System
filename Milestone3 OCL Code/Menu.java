import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String menuID;
    private List<MenuItem> items;
    private Restaurant restaurant;

    public Menu(String menuID, Restaurant restaurant) {
        this.menuID = menuID;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        // Constraint 3: Every Menu must only list items that its Restaurant serves
        if (!restaurant.getItems().containsAll(items)) {
            throw new IllegalArgumentException("Menu contains items not served by the restaurant.");
        }

        // Constraint 2: A Menu must have at least one MenuItem.
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Menu must have at least one MenuItem.");
        }

        // Constraint 5: Each item in the Menu must have a specified price greater than zero.
        for (MenuItem item : items) {
            if (item.getPrice() <= 0) {
                throw new IllegalArgumentException("Each MenuItem must have a price greater than zero.");
            }
        }

        this.items = items;
    }

    public void addItem(MenuItem item) {
        // Constraint 5: Item price must be greater than zero.
        if (item.getPrice() <= 0) {
            throw new IllegalArgumentException("Item price must be greater than zero.");
        }

        // Constraint 3: Item must be served by the restaurant.
        if (!restaurant.getItems().contains(item)) {
            throw new IllegalArgumentException("The item is not served by the restaurant.");
        }

        // Adding the item to the menu.
        this.items.add(item);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    // Call this method to ensure that the Menu has a unique ID within a Restaurant
    public static boolean checkUniqueMenuID(List<Menu> menus) {
        for (int i = 0; i < menus.size(); i++) {
            for (int j = i + 1; j < menus.size(); j++) {
                Menu m1 = menus.get(i);
                Menu m2 = menus.get(j);
                // Constraint 4: Ensure each Menu has a unique ID within a Restaurant
                if (!m1.equals(m2) && m1.getRestaurant().equals(m2.getRestaurant()) && m1.getMenuID().equals(m2.getMenuID())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Additional methods like removeItem, updateItem, etc. could be implemented here.
}

// Assuming a MenuItem class with at least a getPrice() method.
class MenuItem {
    private double price;
    // Other attributes and methods...

    public double getPrice() {
        return price;
    }
    
    // Other getters and setters...
}

// Assuming a Restaurant class with a method getItems() that returns the items it serves.
class Restaurant {
    private List<MenuItem> items;
    // Other attributes and methods...

    public List<MenuItem> getItems() {
        return items;
    }
    
    // Other getters and setters...
}
