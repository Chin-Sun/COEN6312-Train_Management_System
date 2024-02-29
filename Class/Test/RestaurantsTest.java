package Test;
import Class.Restaurants;
import Class.Menu;
import Class.ServerForFood;
import Class.MenuItem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantsTest {
    private Restaurants restaurant;
    private Menu menu;
    private ServerForFood server1, server2;

    @Before
    public void setUp() {
        // Initialize your Menu, Restaurants, and ServerForFood instances before each test
        menu = new Menu("menuId1"); // Assuming Menu has a constructor like Menu(String menuId)
        restaurant = new Restaurants("restId1", "Test Restaurant", "123 Main St", "Italian", menu, "9AM-10PM");

        // Create server instances; assuming ServerForFood has a constructor like ServerForFood(String serverId, String name)
        server1 = new ServerForFood("serverId1", "John Doe", "Main Floor", true);
        server2 = new ServerForFood("serverId2", "Jane Doe", "Patio", true);
    }

    @Test
    public void testAddServerForFood() {
        restaurant.addServerForFood(server1);
        assertTrue("Restaurant should contain the added server", restaurant.getServerForFoodList().contains(server1));
    }

    @Test
    public void testRemoveServerForFood() {
        restaurant.addServerForFood(server1);
        restaurant.removeServerForFood(server1.getServerId());
        assertFalse("Restaurant should not contain the removed server", restaurant.getServerForFoodList().contains(server1));
    }

    @Test
    public void testUpdateMenu() {
        Menu newMenu = new Menu("menuId2"); // Assuming a new menu
        restaurant.updateMenu(newMenu);
        assertEquals("Restaurant's menu should be updated", newMenu, restaurant.getMenu());
    }

    @Test
    public void testDisplayMenu() {
        // Setup - Add items to the menu as necessary
        Menu newMenu = new Menu("menuId2");
        MenuItem item1 = new MenuItem("1", "Pizza", 10.99); // Example item
        newMenu.addItem(item1);
        restaurant.updateMenu(newMenu);

        // Act
        String menuContent = restaurant.displayMenu();

        // Assert
        assertTrue("Menu content should include item description", menuContent.contains("Pizza"));
        // Additional assertions as needed
    }
}
