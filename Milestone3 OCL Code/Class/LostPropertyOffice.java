import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LostPropertyOffice {

	// Static set to track all office IDs for uniqueness constraint
	private static Set<Integer> allOfficeIds = new HashSet<>();

	public List<String> itemDescription;
	private String status;
	public int officeId;
	private int ItemId;
	// Initialized lists to ensure they are not null
	public List<String> items = new ArrayList<>(); // Ensuring items list is not null
	private List<String> claims = new ArrayList<>(); // Added claims list, initialized to ensure it's not null
	private String foundDate;
	private String locationLost;

	// Constructor
	//OCL Constrains:
	public LostPropertyOffice(int officeId) {
		// Check for unique officeId
		if(!allOfficeIds.add(officeId)) {
			throw new IllegalArgumentException("officeId must be unique");
		}
		this.officeId = officeId;
	}


	public List<String> getClaims() {
		return claims;
	}

	public void setClaims(List<String> claims) {
		this.claims = claims;
	}
	public String getFoundDate() {
	 	 return foundDate; 
	}
	/**
	 * Setter of foundDate
	 */
	public void setFoundDate(String foundDate) { 
		 this.foundDate = foundDate; 
	}
	/**
	 * Getter of locationLost
	 */
	public String getLocationLost() {
	 	 return locationLost; 
	}
	/**
	 * Setter of locationLost
	 */
	public void setLocationLost(String locationLost) { 
		 this.locationLost = locationLost; 
	}
	/**
	 * 
	 * @param locationLost 
	 * @param foundDate 
	 * @param itemDescription 
	 * @return 
	 */
	public int reportLostItem(String locationLost, String foundDate, String itemDescription) { 
		// TODO Auto-generated method
		return 0;
	 }
	/**
	 * 
	 * @param ReportId 
	 * @param Document 
	 * @return 
	 */
	public boolean claimItem(int ReportId, String Document) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @param newStatus 
	 * @param itemId 
	 */
	public void updateItemStatus(String newStatus, int itemId) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param foundDate 
	 * @param itemDescription 
	 * @param locationLost 
	 * @return 
	 */
	public int searchItems(String foundDate, String itemDescription, String locationLost) { 
		// TODO Auto-generated method
		return 0;
	 } 

}