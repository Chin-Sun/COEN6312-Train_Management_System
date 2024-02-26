public class Ticket {
    private static int nextTicketId = 1; // Example of a static field to generate unique ticket IDs

    private int ticketId;
    private int trainId;
    private int passengerId;
    private String seatNumber;
    private String journeyDate;

    public Ticket(int ticketId, int trainId, int passengerId, String seatNumber, String journeyDate) {
        this.ticketId = ticketId;
        this.trainId = trainId;
        this.passengerId = passengerId;
        this.seatNumber = seatNumber;
        this.journeyDate = journeyDate;
    }

    public static int generateTicketId() {
        return nextTicketId++; // Increment and return the next ticket ID
    }

    public void issueTicket() {
        // Logic to issue a new ticket. This might interact with other systems.
    }

    public void cancelTicket() {
        // Logic to cancel the ticket. This might interact with other systems.
    }

    public void changeTicket(String newSeatNumber, String newJourneyDate) {
        // Logic to change the ticket details. This might interact with other systems.
        this.seatNumber = newSeatNumber;
        this.journeyDate = newJourneyDate;
    }

    // Getters and setters for each field
    // ...
}
