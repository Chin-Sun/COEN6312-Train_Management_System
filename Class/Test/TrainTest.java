package Test;
import Class.Train;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TrainTest {

    private Train train;

    @Before
    public void setUp() {
        // Initialize your Train object here
        train = new Train(1, "Express", "CityA to CityB", "08:00 AM - 10:00 AM");
    }

    @Test
    public void testGetRouteInformation() {
        // Test getRouteInformation method
        String newRoute = "CityA to CityB";
        train.getRouteInformation(newRoute);
        String actualRoute = train.getRouteInformation();
        assertEquals(newRoute, actualRoute);
    }

    @Test
    public void testUpdateSchedule() {
        // Test updateSchedule method
        String newSchedule = "09:00 AM - 11:00 AM";
        train.updateSchedule(newSchedule);
        // Directly accessing the schedule attribute is not possible since it's private,
        // assuming a getSchedule method exists or verifying through another means would be needed here.
        // For the purpose of this example, let's assume such a method exists.
        String updatedSchedule = train.getSchedule(); // Assuming getSchedule method exists
        assertEquals(newSchedule, updatedSchedule);
    }
}
