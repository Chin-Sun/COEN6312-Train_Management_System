package Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.MenuItem;
import Class.Menu;

public class MenuTest {
    private Menu menu;
    private MenuItem item1;
    private MenuItem item2;

    @Before
    public void setUp() {
        menu = new Menu("Menu1");
        item1 = new MenuItem("Item1", "Pizza", 9.99);
        item2 = new MenuItem("Item2", "Burger", 5.99);
    }

    @Test
    public void testAddItem() {
        menu.addItem(item1);
        assertEquals("Menu should contain 1 item after addition", 1, menu.items.size());
    }

    @Test
    public void testRemoveItem() {
        menu.addItem(item1);
        menu.removeItem("Item1");
        assertTrue("Menu should be empty after removing the item", menu.items.isEmpty());
    }

    @Test
    public void testUpdateItem() {
        menu.addItem(item1);
        MenuItem updatedItem = new MenuItem("Item1", "Pizza", 10.99); // Updated price
        menu.updateItem(updatedItem);
        MenuItem currentItem = menu.items.get(0);
        assertEquals("Updated item's price should be 10.99", 10.99, currentItem.getPrice(), 0.0);
    }

    // This test assumes you have a method to get items for assertion. If not, adjust accordingly.
    @Test
    public void testListItems() {
        menu.addItem(item1);
        menu.addItem(item2);
        assertEquals("Menu should list 2 items", 2, menu.items.size());
        // Further validation can be performed based on the listItems method's output if needed.
    }
}
