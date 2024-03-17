

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
	/**
	 * Getter of trainId
	 */
	public String getTrainId() {
	 	 return trainId; 
	}
	/**
	 * Setter of trainId
	 */
	public void setTrainId(String trainId) { 
		 this.trainId = trainId; 
	}
	/**
	 * Getter of Id
	 */
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
	/**
	 * 
	 * @param settings 
	 * @return 
	 */
	public boolean updateSystemSettings(String settings) { 
		// TODO Auto-generated method
		return false;
	 } 

}