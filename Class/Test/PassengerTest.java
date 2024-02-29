package Test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.Passenger;
import Class.Ticket;

public class PassengerTest {
    private Passenger passenger;
    private Ticket ticket;

    @Before
    public void setUp() {
        // Initialize your Passenger with dummy data
        passenger = new Passenger(1, "John Doe", "john.doe@example.com");

        // Create a ticket for testing; assume Ticket has an appropriate constructor
        // Replace with the correct constructor call based on your Ticket class definition
        ticket = new Ticket(1, 100, passenger.getId(), "A1", "2022-01-01");
    }

    @Test
    public void testBookTicket() {
        Ticket bookedTicket = passenger.bookTicket(100, "A1", "2022-01-01");
        assertNotNull("Booked ticket should not be null", bookedTicket);
        assertTrue("Booking history should contain the new ticket", passenger.getBookingHistory().contains(bookedTicket));
    }

    @Test
    public void testChooseSeat() {
        Ticket bookedTicket = passenger.bookTicket(100, "A1", "2022-01-01");
        passenger.chooseSeat(bookedTicket, "B2");
        assertEquals("Seat number should be updated to 'B2'", "B2", bookedTicket.getSeatNumber());
    }

    @Test
    public void testCancelTicket() {
        Ticket bookedTicket = passenger.bookTicket(100, "A1", "2022-01-01");
        passenger.cancelTicket(bookedTicket);
        assertFalse("Booking history should not contain the canceled ticket", passenger.getBookingHistory().contains(bookedTicket));
    }
}
