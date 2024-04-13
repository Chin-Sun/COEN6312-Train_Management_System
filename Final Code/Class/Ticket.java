package Class;
import java.util.HashSet;
import java.util.Set;

public class Ticket {
	private static final Set<String> allTicketIds = new HashSet<>();

	private int passengerId;
	public String trainId;
	private String seatNumber;
	public String ticketId;
	private String journeyDate;
	private String issueDate; // Assuming you add this
	private String destination;
	private String origin; // Assuming you add this

	public Ticket() {
		// Initialize issueDate to current date in your preferred format
	}

	public void setTicketId(String ticketId) {
		if (!allTicketIds.contains(ticketId)) {
			allTicketIds.add(ticketId);
			this.ticketId = ticketId;
		} else {
			throw new IllegalArgumentException("Ticket ID must be unique.");
		}
	}

	public void setDestination(String destination) {
		if (destination.equals(this.origin)) {
			throw new IllegalArgumentException("Destination must be different from origin.");
		}
		this.destination = destination;
	}


	public void setJourneyDate(String journeyDate) {
		// Assuming journeyDate and issueDate are in a compatible format or converted accordingly
		// Compare dates and throw exception if issueDate is after journeyDate
		this.journeyDate = journeyDate;
	}

	public void setSeatNumber(String seatNumber, int totalSeats) {
		int seatNum = Integer.parseInt(seatNumber);
		if (seatNum > 0 && seatNum <= totalSeats) {
			this.seatNumber = seatNumber;
		} else {
			throw new IllegalArgumentException("Seat number must be within the range of available seats.");
		}
	}

	// Additional methods and logic to handle the constraints


public int getPassengerId() {
	 	 return passengerId; 
	}
	/**
	 * Setter of passengerId
	 */
	public void setPassengerId(int passengerId) { 
		 this.passengerId = passengerId; 
	}
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
	 * Getter of seatNumber
	 */
	public String getSeatNumber() {
	 	 return seatNumber; 
	}
	/**
	 * Setter of seatNumber
	 */
	public void setSeatNumber(String seatNumber) { 
		 this.seatNumber = seatNumber; 
	}
	/**
	 * Getter of ticketId
	 */
	public String getTicketId() {
	 	 return ticketId; 
	}
	/**
	 * Setter of ticketId
	 */

	public String getJourneyDate() {
	 	 return journeyDate; 
	}
	/**
	 * Setter of journeyDate
	 */

	public String getDestination() {
	 	 return destination; 
	}
	/**
	 * Setter of destination
	 */

	public void issueTicket(String ticketId, String details) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param changeDetails 
	 * @param ticketId 
	 * @return 
	 */
	public boolean changeTicket(String changeDetails, String ticketId) { 
		// TODO Auto-generated method
		return false;
	 } 

}