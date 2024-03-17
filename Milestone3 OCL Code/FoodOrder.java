

import java.util.List;

public class FoodOrder {

	/**
	 * 
	 */
	private List<String> itemsOrdered;
	/**
	 * 
	 */
	private int orderId;
	/**
	 * 
	 */
	private int customerId;
	/**
	 * 
	 */
	private String orderDate;
	/**
	 * 
	 */
	private String status;
	/**
	 * 
	 */
	private int totalPrice;
	/**
	 * Getter of itemsOrdered
	 */
	public List<String> getItemsOrdered() {
	 	 return itemsOrdered; 
	}
	/**
	 * Setter of itemsOrdered
	 */
	public void setItemsOrdered(List<String> itemsOrdered) { 
		 this.itemsOrdered = itemsOrdered; 
	}
	/**
	 * Getter of orderId
	 */
	public int getOrderId() {
	 	 return orderId; 
	}
	/**
	 * Setter of orderId
	 */
	public void setOrderId(int orderId) { 
		 this.orderId = orderId; 
	}
	/**
	 * Getter of customerId
	 */
	public int getCustomerId() {
	 	 return customerId; 
	}
	/**
	 * Setter of customerId
	 */
	public void setCustomerId(int customerId) { 
		 this.customerId = customerId; 
	}
	/**
	 * Getter of orderDate
	 */
	public String getOrderDate() {
	 	 return orderDate; 
	}
	/**
	 * Setter of orderDate
	 */
	public void setOrderDate(String orderDate) { 
		 this.orderDate = orderDate; 
	}
	/**
	 * Getter of status
	 */
	public String getStatus() {
	 	 return status; 
	}
	/**
	 * Setter of status
	 */
	public void setStatus(String status) { 
		 this.status = status; 
	}
	/**
	 * Getter of totalPrice
	 */
	public int getTotalPrice() {
	 	 return totalPrice; 
	}
	/**
	 * Setter of totalPrice
	 */
	public void setTotalPrice(int totalPrice) { 
		 this.totalPrice = totalPrice; 
	}
	/**
	 * 
	 * @param itemId 
	 */
	public void removeItem(String itemId) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param ItemPrice 
	 * @return 
	 */
	public float calculateTotalPrice(float ItemPrice) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param items 
	 */
	public void addItem(Menu items) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param NewStatus 
	 */
	public void updateStatus(String NewStatus) { 
		// TODO Auto-generated method
	 } 

}