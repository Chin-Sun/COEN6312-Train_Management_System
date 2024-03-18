package Class;
import java.util.ArrayList;
import java.util.List;

class Restaurant {
	private String name;
	private String cuisineType;
	private List<Menu> menu; // Assume Menu is a class containing List<MenuItem>
	private String operationalStatus;
	private List<Servers> servers; // Assume Server is a class with a boolean 'available' attribute
	private List<FoodOrder> foodOrders; // Assume FoodOrder is a class containing List<MenuItem>

	public Restaurant() {
		this.menu = new ArrayList<>();
		this.servers = new ArrayList<>();
		this.foodOrders = new ArrayList<>();
	}

	// Getters and setters

	// Ensures at least one menu is present
	public void setMenu(List<Menu> menu) {
		if (menu == null || menu.isEmpty()) {
			throw new IllegalArgumentException("A restaurant must have at least one menu.");
		}
		this.menu = menu;
	}

	// Ensures at least one server is available
	public void addServer(Servers server) {
		if (server != null) {
			this.servers.add(server);
		}
		// Check if at least one server is available
		boolean hasAvailableServer = this.servers.stream().anyMatch(Servers::getAvailability);
		if (!hasAvailableServer) {
			throw new IllegalStateException("A restaurant should have at least one available server.");
		}
	}

	// Verify all food orders are linked to menu items
	public void processOrder(FoodOrder foodOrder) {
		boolean allItemsAvailable = foodOrder.getItemsOrdered().stream()
				.allMatch(item -> this.menu.stream().anyMatch(menu -> menu.getItems().contains(item)));
		if (!allItemsAvailable) {
			throw new IllegalArgumentException("All food order items must be linked to the menu items offered.");
		}
		if ("closed".equals(this.operationalStatus)) {
			throw new IllegalStateException("Cannot process orders. The restaurant is closed.");
		}
		this.foodOrders.add(foodOrder);
	}

	// Setter for operationalStatus checks for active orders if setting to closed
	public void setOperationalStatus(String operationalStatus) {
		if ("closed".equals(operationalStatus) && !this.foodOrders.stream().allMatch(order -> !"active".equals(order.getStatus()))) {
			throw new IllegalStateException("Cannot close restaurant with active orders.");
		}
		this.operationalStatus = operationalStatus;
	}
}
