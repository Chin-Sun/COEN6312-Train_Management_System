

import java.util.List;

public class Menu {

	/**
	 * 
	 */
	public String itemId;
	/**
	 * 
	 */
	private List<String> specials;
	/**
	 * 
	 */
	public List<String> items;
	/**
	 * 
	 */
	private String updateDate;
	/**
	 * 
	 */
	public int menuId;
	/**
	 * Getter of itemId
	 */
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
	/**
	 * Setter of menuId
	 */
	public void setMenuId(int menuId) { 
		 this.menuId = menuId; 
	}
	/**
	 * 
	 * @return 
	 */
	public String listItems() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param NewItem 
	 * @param updateDate 
	 * @return 
	 */
	public String addItem(String NewItem, String updateDate) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param NewItem 
	 */
	public void updateItem(String NewItem) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ItemId 
	 */
	public void removeItem(String ItemId) { 
		// TODO Auto-generated method
	 } 

}