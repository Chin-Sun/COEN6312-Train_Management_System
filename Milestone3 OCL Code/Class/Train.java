
package Class;
import java.util.ArrayList;
import java.util.List;

public class Train {
	public String trainId;
	private List<City> route; // Adjusted to List<City> to enforce association with City objects
	public String trainName;
	private List<String> schedule; // Assuming schedule is a list of time slots or similar
	private boolean operational; // Added to represent operational status

	// Constructor to enforce non-empty route and schedule upon creation if operational
	public Train(String trainId, String trainName, boolean operational) {
		this.trainId = trainId;
		this.trainName = trainName.trim(); // Ensures no leading or trailing whitespace
		this.operational = operational;
		this.route = new ArrayList<>(); // Initialize with an empty list
		this.schedule = new ArrayList<>(); // Initialize with an empty list
	}

	// Modified setters and getters based on OCL constraints

	private String currentStatus;
	// Other attributes and methods...

	public String getCurrentStatus() {
		return currentStatus;
	}

	// Setter for currentStatus, if needed
	public void setCurrentStatus(String status) {
		this.currentStatus = status;
	}
	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public List<City> getRoute() {
		return route;
	}

	public void setRoute(List<City> route) {
		if (!route.isEmpty()) { // Enforcing at least one City in route
			this.route = route;
		}
	}


	// If you want to add a single new schedule instead of setting the whole list
	public void addSchedule(String newSchedule) {
		if(this.schedule == null) {
			this.schedule = new ArrayList<>();
		}
		this.schedule.add(newSchedule);
	}
	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName.trim(); // Enforces no leading or trailing whitespace
	}

	public List<String> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<String> schedule) {
		if (operational && !schedule.isEmpty()) { // Enforces non-empty schedule if operational
			this.schedule = schedule;
		}
	}

	// Additional methods to comply with operational and route constraints
	public boolean isOperational() {
		return operational;
	}

	public void setOperational(boolean operational) {
		this.operational = operational;
		if (!operational) {
			this.schedule.clear(); // Clears schedule if train is not operational
		}
	}

	// Example method to add a City to route
	public void updateSchedule(City city, String newSchedule) {
		if (!this.route.contains(city)) {
			this.route.add(city);
		}
	}
	public Train getRouteInformation() {
		// TODO Auto-generated method
		return null;
	 }

}