package Class;

import java.util.List;

public class TrainOperator {

	private String name;
	private int Id;

	// Assuming a static method to get all Dispatcher IDs for validation
	// This requires the Dispatcher class and a method to fetch all IDs

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	// Instance methods for TrainOperator...
	public void setId(int Id) {
		List<String> allDispatcherIDs = Dispatcher.getAllDispatcherIDs(); // Correctly fetch all Dispatcher IDs
		String stringId = String.valueOf(Id); // Convert int ID to String to match Dispatcher ID format
		if (!allDispatcherIDs.contains(stringId)) {
			this.Id = Id;
		} else {
			throw new IllegalArgumentException("ID is already used by a Dispatcher.");
		}
	}

	public String trackTrainStatus(String trainId) {
		// Implementation depends on the details of how status is tracked
		return "Status for train " + trainId;
	}

	public String notifyEmergency(String message) {
		// Implement notification logic
		return "Emergency: " + message;
	}
}
