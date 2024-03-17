import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PassengerAnalytics {
    private PassengerData passengerData;

    public PassengerAnalytics(PassengerData passengerData) {
        this.passengerData = passengerData;
    }

    // Ensure booking history in passenger data matches the booking history of associated tickets.
    public boolean checkBookingHistoryConsistency() {
        Set<BookingHistory> passengerBookingHistory = passengerData.getBookingHistory();
        Set<BookingHistory> ticketBookingHistories = passengerData.getTickets().stream()
            .map(Ticket::getBookingHistory)
            .collect(Collectors.toSet());

        return passengerBookingHistory.equals(ticketBookingHistories);
    }

    // Ensure consistency of passenger IDs between tickets and passenger data.
    public boolean checkPassengerIDConsistency() {
        String passengerID = passengerData.getID();
        return passengerData.getTickets().stream()
            .allMatch(ticket -> ticket.getPassengerID().equals(passengerID));
    }

    // The number of collected passenger data should match the number of associated tickets.
    public boolean checkPassengerDataTicketCount() {
        // Assuming a method to collect all relevant passenger data records
        int passengerDataCount = collectPassengerData().size();
        int ticketCount = passengerData.getTickets().size();
        return passengerDataCount == ticketCount;
    }

    // Each Ticket associated with PassengerAnalytics should have a valid destination consistent with the train's route.
    public boolean checkTicketDestinationConsistency() {
        return passengerData.getTickets().stream()
            .allMatch(ticket -> ticket.getDestination().equals(ticket.getTrain().viewTrainRoute().getLast()));
    }

    // Method to collect all relevant passenger data, placeholder for actual implementation
    private List<PassengerData> collectPassengerData() {
        // Placeholder for collecting passenger data
        return List.of(passengerData);
    }

    // Other methods...
}

class PassengerData {
    private String ID;
    private Set<BookingHistory> bookingHistory;
    private List<Ticket> tickets;

    // Getters and Setters...

    public String getID() { return ID; }
    public Set<BookingHistory> getBookingHistory() { return bookingHistory; }
    public List<Ticket> getTickets() { return tickets; }
}

class Ticket {
    private String passengerID;
    private BookingHistory bookingHistory;
    private String destination;
    private Train train;

    // Getters and Setters...

    public String getPassengerID() { return passengerID; }
    public BookingHistory getBookingHistory() { return bookingHistory; }
    public String getDestination() { return destination; }
    public Train getTrain() { return train; }
}

class Train {
    // Method to get the train's route, which returns a list of destinations.
    public Route viewTrainRoute() { /* Implementation */ }
}

class BookingHistory {
    // Details about the booking history
}

class Route {
    // Assuming this class has a method to get the last destination in the route
    public String getLast() { /* Implementation */ }
}
