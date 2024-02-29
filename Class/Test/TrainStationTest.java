package Test;
import Class.TrainStation;
import Class.Train;
import Class.City;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class TrainStationTest {
    private TrainStation station;
    private Train train1, train2;

    @Before
    public void setUp() {
        City city = new City("CityName", "State", "Country", 1000000); // Assuming City constructor
        station = new TrainStation("Central Station", "Central Location", city, 5);

        // Assume Train class has a constructor like Train(String trainId, String route)
        train1 = new Train(1, "Express", "CityA to CityB", "08:00 AM - 10:00 AM");
        train2 = new Train(2, "Inspire", "CityC to CityD", "09:00 PM - 10:00 PM");
    }

    @Test
    public void testAddTrainSchedule() {
        station.addTrainSchedule(train1, "08:00 AM");
        assertFalse("Timetable should not be empty after adding a schedule", station.listAllDepartures().isEmpty());
        assertTrue("Timetable should contain the added train schedule", station.listAllDepartures().containsKey(train1));
    }

    @Test
    public void testRemoveTrainSchedule() {
        station.addTrainSchedule(train1, "08:00 AM");
        station.removeTrainSchedule(train1);
        assertFalse("Timetable should not contain the removed train schedule", station.listAllDepartures().containsKey(train1));
    }

    @Test
    public void testFindNextTrain() {
        station.addTrainSchedule(train1, "08:00 AM");
        Train foundTrain = station.findNextTrain("CityA to CityB");
        assertNotNull("Should find a train going to the destination", foundTrain);
        assertEquals("Found train should match the expected train", train1, foundTrain);
    }

    @Test
    public void testListAllDepartures() {
        station.addTrainSchedule(train1, "08:00 AM");
        station.addTrainSchedule(train2, "09:00 AM");
        Map<Train, String> departures = station.listAllDepartures();
        assertEquals("There should be two departures listed", 2, departures.size());
    }
}
