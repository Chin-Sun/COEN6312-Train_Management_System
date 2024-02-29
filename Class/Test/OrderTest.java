package Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.Order;
import Class.MenuItem;

public class OrderTest {
    private Order order;
    private MenuItem item1, item2;

    @Before
    public void setUp() {
        // Initialize your Order and some MenuItems before each test
        order = new Order("orderId123", "customerId456");
        item1 = new MenuItem("item1", "Item 1", 10.00); // Assuming MenuItem has a constructor like MenuItem(String itemId, String name, double price)
        item2 = new MenuItem("item2", "Item 2", 15.00);
    }

    @Test
    public void testAddAndCalculateTotalPrice() {
        order.addItem(item1, 2); // Add 2 of item1
        order.addItem(item2, 1); // Add 1 of item2

        // Expected total = (2 * 10.00) + (1 * 15.00)
        double expectedTotal = 35.00;
        order.calculateTotalPrice();

        assertEquals("Total price should be calculated correctly", expectedTotal, order.getTotalPrice(), 0.001);
    }

    @Test
    public void testRemoveItem() {
        order.addItem(item1, 1);
        order.addItem(item2, 1);

        order.removeItem(item1.getItemId()); // Remove item1

        // After removal, total price should equal the price of item2 only
        order.calculateTotalPrice();
        assertEquals("Total price should be updated correctly after removal", 15.00, order.getTotalPrice(), 0.001);
    }

    @Test
    public void testUpdateItemQuantity() {
        order.addItem(item1, 1); // Add 1 of item1 initially
        order.updateItemQuantity(item1.getItemId(), 3); // Update quantity to 3

        // New total should reflect updated quantity of item1
        order.calculateTotalPrice();
        double expectedTotal = 3 * 10.00; // 3 * price of item1
        assertEquals("Total price should reflect updated quantity", expectedTotal, order.getTotalPrice(), 0.001);
    }

    @Test
    public void testUpdateStatus() {
        order.updateStatus("shipped");
        assertEquals("shipped", order.getStatus());
    }
}
