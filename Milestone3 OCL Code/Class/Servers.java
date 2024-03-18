package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Servers {

	/**
	 * 
	 */
	private boolean availability;
	/**
	 * 
	 */
	private List<String> assignedArea;
	/**
	 * 
	 */
	public String serverId;
	/**
	 * 
	 */
	public List<String> menuItems;
	/**
	 * 
	 */
	private String name;
	/**
	 * Getter of availability
	 */
	private List<FoodOrder> foodOrders = new ArrayList<>(); // Changed to hold FoodOrder objects
	private Map<String, String> feedbackLog = new HashMap<>();
	private List<FoodOrder> orders = new ArrayList<>();
	public boolean getAvailability() {
	 	 return availability; 
	}
	/**
	 * Setter of availability
	 */
	public List<FoodOrder> getFoodOrders() {
		return foodOrders;
	}

	public void setFoodOrders(List<FoodOrder> foodOrders) {
		this.foodOrders = foodOrders;
	}

	// Setter for availability ensures no in-progress orders if setting to unavailable
	public void setAvailability(boolean availability) {
		if (!availability) {
			boolean hasInProgressOrders = foodOrders.stream().anyMatch(order -> "In Progress".equals(order.getStatus()));
			if (hasInProgressOrders) {
				throw new IllegalStateException("Cannot make server unavailable while orders are in progress.");
			}
		}
		this.availability = availability;
	}
	public List<String> getAssignedArea() {
	 	 return assignedArea; 
	}
	/**
	 * Setter of assignedArea
	 */
	public void setAssignedArea(List<String> assignedArea) { 
		 this.assignedArea = assignedArea; 
	}
	/**
	 * Getter of serverId
	 */
	public String getServerId() {
	 	 return serverId; 
	}
	/**
	 * Setter of serverId
	 */
	public void setServerId(String serverId) { 
		 this.serverId = serverId; 
	}
	/**
	 * Getter of menuItems
	 */
	public List<String> getMenuItems() {
	 	 return menuItems; 
	}
	/**
	 * Setter of menuItems
	 */
	public void setMenuItems(List<String> menuItems) { 
		 this.menuItems = menuItems; 
	}
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}

	public void receiveFeedback(String feedback, String passengerId) {
		// Here, we simply log the feedback associated with a passenger/customer ID
		feedbackLog.put(passengerId, feedback);
		System.out.println("Feedback received from passenger " + passengerId + ": " + feedback);
	}
	public void takeOrder(String passengerId, String orderDetails) {
		Integer orderId = generateOrderId(); // Assuming you have a method to generate unique order IDs
		FoodOrder order = new FoodOrder(orderId, passengerId, orderDetails);
		orders.add(order);
		System.out.println("Order taken for passenger " + passengerId + ": " + orderDetails);
	}

	private int generateOrderId() {
		// Implement logic to generate a unique order ID
		return (String.valueOf(System.currentTimeMillis())).hashCode(); // Example implementation
	}
	/**
	 * 
	 * @param orderId 
	 */
	public void cancelOrder(int orderId) {
		// Assuming FoodOrder has a method getOrderId() that returns int
		foodOrders.removeIf(order -> order.getOrderId() == orderId);
		System.out.println("Order " + orderId + " cancelled.");
		// Implement logic as needed, e.g., updating order status instead of removing
	}

}