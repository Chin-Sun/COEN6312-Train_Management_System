package Class;

public class TrainDriver {

	private String healthStatus;
	private Train currentTrain; // Assuming a Train class exists
	private long yearsOfExperience;
	private String name;
	private int Id;

	// Constructor to enforce DriverInfoValidity
	public TrainDriver(String name, int Id, long yearsOfExperience, String healthStatus) {
		if(name == null || name.trim().isEmpty() || Id <= 0 || yearsOfExperience < 0) {
			throw new IllegalArgumentException("Invalid driver information");
		}
		this.name = name;
		this.Id = Id;
		this.yearsOfExperience = yearsOfExperience;
		this.healthStatus = healthStatus;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public Train getCurrentTrain() {
		return currentTrain;
	}

	public void setCurrentTrain(Train currentTrain) {
		this.currentTrain = currentTrain;
	}

	public long getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(long yearsOfExperience) {
		if(yearsOfExperience < 0) {
			throw new IllegalArgumentException("Years of experience cannot be negative");
		}
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		if(Id <= 0) {
			throw new IllegalArgumentException("ID must be positive");
		}
		this.Id = Id;
	}

	public void startTrain() {
		if (!"healthy".equalsIgnoreCase(healthStatus)) {
			throw new IllegalStateException("Cannot start train. Driver is not in healthy status.");
		}
		// Code to start the train...
	}

	public void reportStatus() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void stopTrain() { 
		// TODO Auto-generated method
	 } 

}