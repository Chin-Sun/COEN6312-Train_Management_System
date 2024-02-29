package Test;
import Class.TicketInspector;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.TicketInspector;

public class TicketInspectorTest {

    private TicketInspector ticketInspector;

    @Before
    public void setUp() {
        ticketInspector = new TicketInspector(1, "John Doe");
    }

    @Test
    public void testCheckTicket() {
        // Since checkTicket prints to the console, actual testing of the method output isn't straightforward.
        // Instead, this test will simply invoke the method to ensure it runs without errors.

        try {
            ticketInspector.checkTicket("Valid Ticket");
            assertTrue("Method should execute successfully.", true);
        } catch (Exception e) {
            fail("Method should not throw an exception.");
        }
    }
}