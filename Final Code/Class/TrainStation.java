package Class;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;


public class TrainStation {
	// Assuming there's a static list to keep track of all instances for uniqueness checks.
	private static final Set<String> allStationNames = new HashSet<>();
	private static final Set<String> allStationLocations = new HashSet<>();

	public String location;
	public String name;
	public String stationId;
	private List<Integer> platforms;
	private List<String> timeTable;
	public String city;

	private static final List<String> validStations = Arrays.asList("Station1", "Station2", "Station3");

	// Constructors
	public TrainStation(String name, String location, String city) {
		// Check for unique name and non-empty location
		if (!allStationNames.add(name)) {
			throw new IllegalArgumentException("TrainStation name must be unique");
		}
		if (location == null || location.isEmpty()) {
			throw new IllegalArgumentException("Location must not be empty");
		}
		if (city == null || city.isEmpty()) {
			throw new IllegalArgumentException("A TrainStation must be associated with a City");
		}
		this.name = name;
		this.location = location;
		this.city = city;
	}
	public void setCity(String city) {
		if (city == null || city.isEmpty()) {
			throw new IllegalArgumentException("A TrainStation must be associated with a City");
		}
		this.city = city;
	}
	public void setTimeTable(List<String> timeTable) {
		if (timeTable == null || timeTable.isEmpty()) {
			throw new IllegalArgumentException("A TrainStation's timetable must not be null");
		}
		this.timeTable = timeTable;
	}
	public void setLocation(String location) {
		if (location == null || location.isEmpty()) {
			throw new IllegalArgumentException("Location must not be empty");
		}
		this.location = location;
	}
	public String getLocation() {
		return location;
	}



	public String getName() {
		return name;
	}

	// Other getters and setters remain unchanged

	public List<String> getTimeTable() {
		return timeTable;
	}



	public String getCity() {
		return city;
	}




	public static void clearStationRecords() {
		allStationNames.clear();
		allStationLocations.clear();
	}
	public void addTrainSchedule(String trainSchedule) {

	}

	public void removeTrainSchedule(Train train) {
		timeTable.remove(train);
	}

	public Train findNextTrain(String destination) {
		// Assuming Train has a method getDestination()

		return null;
	}

	public List<String> listAllDepartures() {
		return null;
	}


	// Static method to check if a station is valid
	public static boolean isValidStation(String stationId) {
		return validStations.contains(stationId);
	}

}