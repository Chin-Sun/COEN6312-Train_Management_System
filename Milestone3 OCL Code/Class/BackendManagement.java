package Class;

import java.util.ArrayList;
import java.util.List;

public class BackendManagement {

	/**
	 * 
	 */
	private String trainId;
	private int Id;
	/**
	 * 
	 */
	private List<String> shiftSchedule;
	/**
	 * 
	 */
	private String name;
	private String phone;

	// Assuming you add a getter and setter for phone
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone.matches("^[+]?[0-9]{10,13}$")) {
			this.phone = phone;
		} else {
			throw new IllegalArgumentException("Invalid phone format.");
		}
	}

	// Placeholder for the isValidTrainId method
	public boolean isValidTrainId(String trainId) {
		// This should check against actual train IDs, possibly requiring access to a database or a static list
		// For demonstration, let's assume it returns true for now.
		return true;
	}

	public String getTrainId() {
	 	 return trainId; 
	}
	/**
	 * Setter of trainId
	 */
	public void setTrainId(String trainId) {
		if (isValidTrainId(trainId)) {
			this.trainId = trainId;
		} else {
			throw new IllegalArgumentException("Invalid train ID.");
		}
	}

	public int getId() {
	 	 return Id; 
	}
	/**
	 * Setter of Id
	 */
	public void setId(int Id) { 
		 this.Id = Id; 
	}
	/**
	 * Getter of shiftSchedule
	 */
	public List<String> getShiftSchedule() {
	 	 return shiftSchedule; 
	}
	/**
	 * Setter of shiftSchedule
	 */
	public void setShiftSchedule(List<String> shiftSchedule) { 
		 this.shiftSchedule = shiftSchedule; 
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

	public void updateSchedule(List<String> newSchedule) {
		if (!newSchedule.equals(this.shiftSchedule)) {
			this.shiftSchedule = new ArrayList<>(newSchedule);
		} else {
			throw new IllegalArgumentException("New schedule must differ from the current schedule.");
		}
	}


}