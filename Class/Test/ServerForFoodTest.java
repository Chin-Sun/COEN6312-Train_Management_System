package Test;
import Class.ServerForFood;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class ServerForFoodTest {
    private ServerForFood server;

    @Before
    public void setUp() {
        server = new ServerForFood("1", "John Doe", "Area 51", true);
    }

    @Test
    public void testUpdateMenu() {
        Map<String, String> newMenuItems = new HashMap<>();
        newMenuItems.put("Coffee", "$2");
        newMenuItems.put("Tea", "$1.5");

        server.updateMenu(newMenuItems);

        // Assuming a getter method for menuItems exists for testing purposes
        Map<String, String> updatedMenu = server.getMenuItems();

        // Check if the menu contains the new items
        assertEquals("Menu should contain Coffee", "$2", updatedMenu.get("Coffee"));
        assertEquals("Menu should contain Tea", "$1.5", updatedMenu.get("Tea"));
    }

    // Method to test takeOrder, cancelOrder, and receiveFeedback would go here
    // These tests would depend on the implementation details of each method
}
