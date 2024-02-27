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

    public void updateItem(MenuItem newItem) {
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            if (item.getItemId().equals(newItem.getItemId())) {
                items.set(i, newItem); // Update the item with the new item details
                return;
            }
        }
        System.out.println("Item not found for update.");
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("The menu is currently empty.");
            return;
        }
        
        System.out.println("Menu Items:");
        for (MenuItem item : items) {
            System.out.println(item.toString()); // Assuming MenuItem has a toString() method implemented
        }
    }
}
