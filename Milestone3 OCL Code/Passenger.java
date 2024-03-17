import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Passenger {

	private List<Ticket> bookingHistory = new ArrayList<>();
	private String email;


	private String name;

	public int passengerId;

	private int phone;

	public String getEmail() {
	 	 return email; 
	}

	public void setEmail(String email) { 
		 this.email = email; 
	}


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
	 * Getter of passengerId
	 */
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
	 * Getter of phone
	 */
	public int getPhone() {
	 	 return phone; 
	}
	/**
	 * Setter of phone
	 */
	public void setPhone(int phone) { 
		 this.phone = phone; 
	}
	/**
	 * 
	 * @param ticket 
	 */

	// Modified to align with OCL constraints
	public void cancelTicket(Ticket ticket) {
		bookingHistory.remove(ticket);
		// Additional logic to reflect cancellation in a persistent storage if necessary
	}

	// Modified to align with OCL constraints
	public Ticket bookTicket(String trainId, String journeyDate, String seatNumber) {
		// Check if a ticket for the same date already exists
		for (Ticket existingTicket : bookingHistory) {
			if (existingTicket.getJourneyDate().equals(journeyDate)) {
				System.out.println("Cannot book multiple tickets for the same journey date.");
				return null; // or throw an exception based on your design
			}
		}

		// Assuming Ticket constructor and a method to check if the station is valid
		if (!TrainStation.isValidStation(trainId)) {
			System.out.println("Invalid train station.");
			return null; // or throw an exception
		}

		Ticket newTicket = new Ticket(/* parameters to construct a ticket */);
		bookingHistory.add(newTicket);
		return newTicket;
	}
	public void changeSeat(Ticket ticket, String NewSeatNumber) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param trainId 
	 * @return 
	 */
	public String viewTrainRoute(String trainId) { 
		// TODO Auto-generated method
		return null;
	 }



}