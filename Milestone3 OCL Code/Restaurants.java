import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Menu> menus;
    private List<ServerForFood> serverForFoods;
    private List<FoodOrder> foodOrders;
    private String operationalStatus; // Assume the possible values are "open" or "closed"

    public Restaurant() {
        this.menus = new ArrayList<>();
        this.serverForFoods = new ArrayList<>();
        this.foodOrders = new ArrayList<>();
        this.operationalStatus = "closed";
    }

    // Constraint 1: A Restaurant must have at least one Menu.
    public void addMenu(Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Menu cannot be null.");
        }
        this.menus.add(menu);
        if (this.menus.isEmpty()) {
            throw new IllegalStateException("Restaurant must have at least one menu.");
        }
    }

    // Constraint 4: A Restaurant should have at least one ServerForFood who is currently available.
    public void addServerForFood(ServerForFood server) {
        if (server == null) {
            throw new IllegalArgumentException("Server for food cannot be null.");
        }
        this.serverForFoods.add(server);
        boolean atLeastOneAvailable = this.serverForFoods.stream().anyMatch(ServerForFood::isAvailable);
        if (!atLeastOneAvailable) {
            throw new IllegalStateException("Restaurant should have at least one available server for food.");
        }
    }

    // Assume the FoodOrder class has a getStatus method and an itemsOrdered attribute.
    // Constraint 3: If a Restaurant is 'closed', there should be no active FoodOrders.
    // Constraint 5: A restaurant must have all its food orders linked to the menu items it offers.
    public void addFoodOrder(FoodOrder order) {
        if (order == null) {
            throw new IllegalArgumentException("Food order cannot be null.");
        }
        if ("closed".equals(this.operationalStatus) && "active".equals(order.getStatus())) {
            throw new IllegalStateException("Cannot add active orders to a closed restaurant.");
        }
        if (!this.menus.stream().flatMap(menu -> menu.getItems().stream()).collect(Collectors.toList()).containsAll(order.getItemsOrdered())) {
            throw new IllegalStateException("Food order contains items not in the restaurant's menus.");
        }
        this.foodOrders.add(order);
    }

    // Constraint 2: Restaurants with 'open' operationalStatus should have at least one 'available' ServerForFood.
    public boolean checkOperationalStatus() {
        if ("open".equals(this.operationalStatus)) {
            return this.serverForFoods.stream().anyMatch(ServerForFood::isAvailable);
        }
        return true; // If the restaurant is not open, the constraint does not apply.
    }

    // Getters and Setters
    public String getOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    // Other necessary methods and attributes...
}

class ServerForFood {
    private boolean available;

    // Constructors, getters, setters, and other methods...

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class FoodOrder {
    private String status;
    private List<MenuItem> itemsOrdered;

    // Constructors, getters, setters, and other methods...

    public String getStatus() {
        return status;
    }

    public List<MenuItem> getItemsOrdered() {
        return itemsOrdered;
    }
}

class Menu {
    private List<MenuItem> items;

    // Constructors, getters, setters, and other methods...

    public List<MenuItem> getItems() {
        return items;
    }
}

class MenuItem {
    // Implement the MenuItem class
}
