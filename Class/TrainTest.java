import org.junit.Test;
import static org.junit.Assert.*;

public class TrainTest {

    private Train train;

//    @BeforeEach
//    public void setUp() {
//        // Initialize your Train object here
//        train = new Train(1, "Express", "CityA to CityB", "08:00 AM - 10:00 AM");
//    }

    @Test
    public void testGetRouteInformation() {
        // Test getRouteInformation method
        String expectedRoute = "CityA to CityB";
        String actualRoute = train.getRouteInformation();
        assertEquals(expectedRoute, actualRoute, "The route information should match.");
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
        assertEquals(newSchedule, updatedSchedule, "The schedule should be updated.");
    }
}
