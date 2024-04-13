package Class;
import java.util.List;

public class CargoManifest {
	private String departureStation;
	private List<String> contents;
	private int weight;
	private int manifestId;
	private String destinationStation;

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		if (departureStation == null || departureStation.isEmpty()) {
			throw new IllegalArgumentException("Departure station cannot be empty.");
		}
		this.departureStation = departureStation;
	}
	public void setContents(List<String> contents) {
		if (contents == null || contents.isEmpty()) {
			throw new IllegalArgumentException("Contents cannot be empty.");
		}
		this.contents = contents;
	}
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Weight must be greater than 0.");
		}
		this.weight = weight;
	}

	public List<String> getContents() {
		return contents;
	}



	public int getManifestId() {
		return manifestId;
	}

	public void setManifestId(int manifestId) {
		this.manifestId = manifestId;
	}

	public String getDestinationStation() {
		return destinationStation;
	}


	// Assume your other methods remain unchanged.


public int calculateTotalWeight(String contents, int manifestId) {
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param departureStation 
	 * @param trainId 
	 * @param contents 
	 * @param destinationStation 
	 * @param weight 
	 * @return 
	 */
	public int createManifest(String departureStation, Train trainId, String contents, String destinationStation, int weight) { 
		// TODO Auto-generated method
		return 0;
	 }
	public void updateManifest(int manifestId, List<String> updatedDetails) { 
		// TODO Auto-generated method
	 } 

}