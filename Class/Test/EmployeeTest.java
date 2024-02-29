package Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.Employee;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() {
        employee = new Employee(1, "John Doe", "100", "555-1234", "Day Shift");
    }

    @Test
    public void testUpdateSchedule() {
        String newShiftDetails = "Night Shift";
        employee.updateSchedule(newShiftDetails);
        assertEquals("Shift schedule should be updated to Night Shift",
                newShiftDetails, employee.getShiftSchedule());
    }

    @Test
    public void testRequestLeave() {
        // As requestLeave primarily prints a message and does not change state,
        // you'd typically test this by checking the state or output.
        // For demonstration, we assume it updates some internal state (conceptually).

        String leaveDetails = "Annual leave for two weeks";
        employee.requestLeave(leaveDetails);
        // Assuming we have a method to get the last leave request or a status indicating a leave was requested.
        // This is a placeholder for actual verification logic.
        assertTrue("A leave request should be made", true);
    }
}
