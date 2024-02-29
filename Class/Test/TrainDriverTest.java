package Test;
import Class.TrainDriver;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrainDriverTest {
    TrainDriver trainDriver;

    @Before
    public void setUp() {
        trainDriver = new TrainDriver("1", "John Doe", "ABC123", 5, "CityA to CityB", "Healthy");
    }

    @Test
    public void testStartTrain() {
        trainDriver.startTrain();
        assertEquals("running",  trainDriver.getTrainStatus());
    }

    @Test
    public void testStopTrain() {
        // Ensuring the train is running first
        trainDriver.startTrain();
        trainDriver.stopTrain();
        assertEquals("stopped", trainDriver.getTrainStatus());
    }

    @Test
    public void testUpdateRoute() {
        String newRoute = "CityC to CityD";
        trainDriver.updateRoute(newRoute);
        assertEquals(newRoute, trainDriver.getCurrentRoute());
    }

    // Assuming getTrainStatus and getCurrentRoute getters are implemented for testing
}
