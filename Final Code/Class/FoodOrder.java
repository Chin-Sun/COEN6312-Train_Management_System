
package Class;
import java.util.ArrayList;
import java.util.List;

public class FoodOrder {

	private List<String> itemsOrdered;

	public int orderId;

	private int customerId;

	private String orderDate;

	public String status;

	private int totalPrice;
	private String passengerId;
	private String orderDetails;
	private Restaurant restaurantId;

	public FoodOrder(int orderId, String passengerId, String orderDetails) {
		this.orderId = orderId; // Assuming orderId is generated or assigned elsewhere
		this.passengerId = passengerId;
		this.orderDetails = orderDetails;
		this.status = "In Progress"; // Initial status of the order
		this.restaurantId = restaurantId;
	}
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
	// Methods to get and set restaurantId to ensure an order is associated with only one restaurant
	public Restaurant getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Restaurant restaurantId) {
		this.restaurantId = restaurantId;
	}
	public int getTotalPrice() {
	 	 return totalPrice; 
	}
	/**
	 * Setter of totalPrice
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void removeItem(String itemId) {
		if (itemsOrdered != null) {
			itemsOrdered.remove(itemId);
			calculateAndUpdateTotalPrice(); // Update total price with each removed item
			}
		}



	public void calculateAndUpdateTotalPrice() {
		// Simulated price calculation
		int calculatedPrice = 0;
		// For each item ordered, add a fixed price assuming a hypothetical price per item
		for (String item : itemsOrdered) {
			calculatedPrice += 10; // Assuming each item adds $10 to the total price
		}
		setTotalPrice(calculatedPrice);
	}

	public void addItem(String item) {
		if (itemsOrdered == null) {
			itemsOrdered = new ArrayList<>();
		}
		itemsOrdered.add(item);
		calculateAndUpdateTotalPrice();
	}

	public void updateStatus(String newStatus) {
		this.status = newStatus;
	}


}