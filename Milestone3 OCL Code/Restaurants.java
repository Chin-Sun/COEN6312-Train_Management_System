

import java.util.List;

public class Restaurants {

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String cuisionType;
	/**
	 * 
	 */
	private int restaurants;
	/**
	 * 
	 */
	public List<String> menu;
	/**
	 * 
	 */
	private List<String> operatingHours;
	/**
	 * 
	 */
	public String operationalStatus;
	/**
	 * 
	 */
	public List<String> servers;
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
	 * Getter of cuisionType
	 */
	public String getCuisionType() {
	 	 return cuisionType; 
	}
	/**
	 * Setter of cuisionType
	 */
	public void setCuisionType(String cuisionType) { 
		 this.cuisionType = cuisionType; 
	}
	/**
	 * Getter of restaurants
	 */
	public int getRestaurants() {
	 	 return restaurants; 
	}
	/**
	 * Setter of restaurants
	 */
	public void setRestaurants(int restaurants) { 
		 this.restaurants = restaurants; 
	}
	/**
	 * Getter of menu
	 */
	public List<String> getMenu() {
	 	 return menu; 
	}
	/**
	 * Setter of menu
	 */
	public void setMenu(List<String> menu) { 
		 this.menu = menu; 
	}
	/**
	 * Getter of operatingHours
	 */
	public List<String> getOperatingHours() {
	 	 return operatingHours; 
	}
	/**
	 * Setter of operatingHours
	 */
	public void setOperatingHours(List<String> operatingHours) { 
		 this.operatingHours = operatingHours; 
	}
	/**
	 * Getter of operationalStatus
	 */
	public String getOperationalStatus() {
	 	 return operationalStatus; 
	}
	/**
	 * Setter of operationalStatus
	 */
	public void setOperationalStatus(String operationalStatus) { 
		 this.operationalStatus = operationalStatus; 
	}
	/**
	 * Getter of servers
	 */
	public List<String> getServers() {
	 	 return servers; 
	}
	/**
	 * Setter of servers
	 */
	public void setServers(List<String> servers) { 
		 this.servers = servers; 
	}
	/**
	 * 
	 * @param foodOrder 
	 */
	public void processOrder(FoodOrder foodOrder) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param NewMenu 
	 */
	public void updateMenu(Menu NewMenu) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param server 
	 * @return 
	 */
	public String addServers(Servers server) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param serverId 
	 */
	public void removeServers(String serverId) { 
		// TODO Auto-generated method
	 } 

}