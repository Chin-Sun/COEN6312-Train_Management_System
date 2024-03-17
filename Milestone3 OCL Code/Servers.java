

import java.util.List;

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
	public boolean getAvailability() {
	 	 return availability; 
	}
	/**
	 * Setter of availability
	 */
	public void setAvailability(boolean availability) { 
		 this.availability = availability; 
	}
	/**
	 * Getter of assignedArea
	 */
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
	/**
	 * 
	 * @param Feedback 
	 * @param passengerId 
	 */
	public void receiveFeedback(String Feedback, String passengerId) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param passengerId 
	 * @param orderDetails 
	 */
	public void takeOrder(String passengerId, String orderDetails) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param orderId 
	 */
	public void cancelOrder(String orderId) { 
		// TODO Auto-generated method
	 } 

}