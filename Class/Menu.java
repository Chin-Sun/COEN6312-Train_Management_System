import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private String menuId;
    private List<MenuItem> items;
    private Date updateDate;
    private List<MenuItem> specials;

    public Menu(String menuId) {
        this.menuId = menuId;
        this.items = new ArrayList<>();
        this.specials = new ArrayList<>();
        this.updateDate = new Date(); // Current date
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public void updateItem(MenuItem item) {
        // Find and update the item in the list
    }

    public void listItems() {
        // List all items
    }
}
