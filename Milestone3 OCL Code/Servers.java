import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ServerForFood {
    private static HashMap<Restaurant, Set<String>> restaurantServerIDs = new HashMap<>();

    private String serverID;
    private boolean availability;
    private List<FoodOrder> foodOrders;
    private Restaurant restaurant;

    public ServerForFood(String serverID, Restaurant restaurant) {
        // Constraint 1 and 3: A ServerForFood must have a unique identifier within a restaurant.
        if (restaurantServerIDs.containsKey(restaurant) && restaurantServerIDs.get(restaurant).contains(serverID)) {
            throw new IllegalArgumentException("Server ID must be unique within a restaurant.");
        }

        // Add the serverID to the restaurant's set of serverIDs
        restaurantServerIDs.computeIfAbsent(restaurant, k -> new HashSet<>()).add(serverID);

        this.serverID = serverID;
        this.restaurant = restaurant;
        this.foodOrders = new ArrayList<>();
        this.availability = true; // Assuming server is available upon creation
    }

    public String getServerID() {
        return serverID;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;

        // Constraint 2: Servers who are unavailable must not have any FoodOrders in progress
        if (!availability) {
            for (FoodOrder order : foodOrders) {
                if ("In Progress".equals(order.getStatus())) {
                    throw new IllegalStateException("Unavailable servers cannot have in-progress food orders.");
                }
            }
        }
    }

    public void addFoodOrder(FoodOrder order) {
        if (order == null) {
            throw new IllegalArgumentException("Food order cannot be null.");
        }
        if (!availability && "In Progress".equals(order.getStatus())) {
            throw new IllegalStateException("Unavailable servers cannot take new in-progress food orders.");
        }
        this.foodOrders.add(order);
    }

    // Additional methods and logic might be needed depending on the FoodOrder class implementation.
    // Getters and setters for other fields and methods to manage food orders...
}

class Restaurant {
    // Assuming this class is already defined in the context of your application
    // with necessary methods and attributes...
}

class FoodOrder {
    private String status; // Assuming status is a String, e.g., "In Progress", "Completed"

    public String getStatus() {
        return status;
    }
    
    // Constructors, getters, setters, and other methods...
}
