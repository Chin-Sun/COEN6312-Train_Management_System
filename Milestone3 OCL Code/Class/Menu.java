package Class;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	public String itemId;
	private List<String> specials;
	public List<String> items; // Example format: "Pizza-10"
	private String updateDate;
	public int menuId;

	// Simulated static list for unique menu ID verification within a Restaurant scope
	private static List<Integer> existingMenuIds = new ArrayList<>();

	// Constructor and getters/setters...

	public void setMenuId(int menuId) {
		if (existingMenuIds.contains(menuId)) {
			throw new IllegalArgumentException("Menu ID must be unique within the restaurant.");
		} else {
			this.menuId = menuId;
			existingMenuIds.add(menuId);
		}
	}

	// Assuming this method is intended to add a new item to the menu
	// with a price check based on the simulated format "ItemName-Price"

	public String getItemId() {
	 	 return itemId; 
	}
	/**
	 * Setter of itemId
	 */
	public void setItemId(String itemId) { 
		 this.itemId = itemId; 
	}
	/**
	 * Getter of specials
	 */
	public List<String> getSpecials() {
	 	 return specials; 
	}
	/**
	 * Setter of specials
	 */
	public void setSpecials(List<String> specials) { 
		 this.specials = specials; 
	}
	/**
	 * Getter of items
	 */
	public List<String> getItems() {
	 	 return items; 
	}
	/**
	 * Setter of items
	 */
	public void setItems(List<String> items) { 
		 this.items = items; 
	}
	/**
	 * Getter of updateDate
	 */
	public String getUpdateDate() {
	 	 return updateDate; 
	}
	/**
	 * Setter of updateDate
	 */
	public void setUpdateDate(String updateDate) { 
		 this.updateDate = updateDate; 
	}
	/**
	 * Getter of menuId
	 */
	public int getMenuId() {
	 	 return menuId; 
	}

	public String listItems() { 
		// TODO Auto-generated method
		return null;
	 }

	public void addItem(String newItem) {
		String[] parts = newItem.split("-");
		if (parts.length != 2) throw new IllegalArgumentException("Invalid item format. Use 'ItemName-Price'.");

		try {
			int price = Integer.parseInt(parts[1]);
			if (price <= 0) throw new IllegalArgumentException("Item price must be greater than zero.");
			items.add(newItem);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid price. Ensure it is a positive number.");
		}
	}
	public void updateItem(String newItem) {
		// Split the new item string to extract the name and price
		String[] parts = newItem.split("-");
		if (parts.length != 2) {
			throw new IllegalArgumentException("Invalid format for the new item. Use 'ItemName-Price'.");
		}
		String newItemName = parts[0];
		int newPrice = Integer.parseInt(parts[1]);
		if (newPrice <= 0) {
			throw new IllegalArgumentException("Price must be greater than zero.");
		}

		// Find and remove the old item
		boolean itemFound = false;
		for (String item : new ArrayList<>(items)) { // Create a copy to avoid ConcurrentModificationException
			if (item.startsWith(newItemName + "-")) {
				items.remove(item);
				itemFound = true;
				break; // Assuming only one item with this name exists
			}
		}

		if (!itemFound) {
			throw new IllegalArgumentException("Item to update not found.");
		}

		// Add the new item
		items.add(newItem);
	}


	public void removeItem(String itemId) {
		boolean itemFound = false;
		for (String item : new ArrayList<>(items)) { // Use a copy to avoid ConcurrentModificationException
			if (item.startsWith(itemId + "-")) {
				items.remove(item);
				itemFound = true;
				break; // Assuming only one item with this name exists
			}
		}

		if (!itemFound) {
			throw new IllegalArgumentException("Item to remove not found.");
		}
	}


}