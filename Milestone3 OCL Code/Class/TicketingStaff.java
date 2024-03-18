import java.util.HashSet;
import java.util.Set;

public class TicketingStaff {

	private static final Set<Integer> allStaffIds = new HashSet<>();

	private String name;
	private int staffId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("The name of the TicketingStaff member must not be empty");
		}
		this.name = name;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		// Check if the staffId is already taken
		if (!allStaffIds.add(staffId)) {
			throw new IllegalArgumentException("The staffId must be unique");
		}
		this.staffId = staffId;
	}

	// Your other methods...

	public String assistInquiries(String inquiryDetails) {
		// Implementation
		return null;
	}

	public boolean refundTicket(Ticket ticket) {
		// Implementation
		return false;
	}

	public boolean processPurchase(String validatePaymentDetails) {
		// Implementation
		return false;
	}

	public boolean checkTicket(Ticket ticket) {
		// Implementation
		return false;
	}

	// Additional method to remove a staffId when a TicketingStaff object is no longer used
	public void removeStaffId() {
		allStaffIds.remove(this.staffId);
	}

	// Make sure to call removeStaffId() appropriately in your code when a TicketingStaff instance is deleted or no longer needed
}
