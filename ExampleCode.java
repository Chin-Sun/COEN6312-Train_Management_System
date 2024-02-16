```

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

    public void chooseSeat() {
        // Implementation
    }

    public Ticket bookTicket(Train train, String seatNumber, Date journeyDate) {
        // Implementation
        return new Ticket();
    }

    public void cancelTicket(Ticket ticket) {
        // Implementation
    }

    public String viewTrainRoute(Train train) {
        // Implementation
        return train.getRouteInformation();
    }

    // Getters and setters
}
```
