package Class;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private int id;
    private String name;
    private String email;
    private List<Ticket> bookingHistory;

    public Passenger(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bookingHistory = new ArrayList<>();
    }

    public void chooseSeat(Ticket ticket, String newSeatNumber) {
        // Logic to choose a seat. This might interact with other systems.
        ticket.setSeatNumber(newSeatNumber);
    }

    public Ticket bookTicket(int trainId, String seatNumber, String journeyDate) {
        // Logic to book a ticket. This might interact with other systems.
        Ticket newTicket = new Ticket(Ticket.generateTicketId(), trainId, this.id, seatNumber, journeyDate);
        newTicket.issueTicket();
        bookingHistory.add(newTicket);
        return newTicket;
    }

    public void cancelTicket(Ticket ticket) {
        // Logic to cancel a ticket. This might interact with other systems.
        ticket.cancelTicket();
        bookingHistory.remove(ticket);
    }

    public String viewTrainRoute(int trainId) {
        // Logic to view train route. This might interact with other systems.
        // Placeholder for route information
        return "Train route information for train ID: " + trainId;
    }
    public Integer getId(){
        return id;
    }

    public List getBookingHistory(){
        return bookingHistory;
    }
    // Getters and setters for each field
    // ...
}
