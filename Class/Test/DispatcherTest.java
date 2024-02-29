package Test;

import org.junit.Before;
import org.junit.Test;
import Class.Dispatcher;

public class DispatcherTest {
    private Dispatcher dispatcher;

    @Before
    public void setUp() {
        dispatcher = new Dispatcher(1, "DispatcherName");
    }

    @Test
    public void testChangeSchedule() {
        // This test simply executes the method to verify no exceptions are thrown
        dispatcher.changeSchedule(101, "09:00 AM");
        // In a real scenario, you might check the state change or interaction with other components
    }

    @Test
    public void testReceiveAlerts() {
        dispatcher.receiveAlerts("Emergency at Station 5");
        // Similar to above, you're ensuring the method can be called successfully
    }

    @Test
    public void testCommunicateWithPersonnel() {
        dispatcher.communicateWithPersonnel("All hands on deck");
        // Verify that the method executes without issues
    }
}
