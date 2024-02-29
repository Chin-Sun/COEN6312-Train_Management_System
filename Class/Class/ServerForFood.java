package Class;
import java.util.HashMap;
import java.util.Map;

public class ServerForFood {
    // Attributes
    private String serverId;
    private String name;
    private String assignedArea;
    private boolean availability;
    private Map<String, String> menuItems; // Assuming a simple String to String mapping for menu items

    // Constructor
    public ServerForFood(String serverId, String name, String assignedArea, boolean availability) {
        this.serverId = serverId;
        this.name = name;
        this.assignedArea = assignedArea;
        this.availability = availability;
        this.menuItems = new HashMap<>(); // Initialize an empty menu
    }

    // Methods
    public void takeOrder(String orderDetails) {
        // Implementation for taking an order
    }

    public void cancelOrder(String orderId) {
        // Implementation for canceling an order
    }
     public void receiveFeedback() {
        // Implementation
    }
    public void updateMenu(Map<String, String> newMenuItems) {
        // Implementation for updating the menu
        this.menuItems = newMenuItems;
    }
    public String getServerId(){
        return serverId;
    }
    public Map getMenuItems(){
        return menuItems;
    }
}
