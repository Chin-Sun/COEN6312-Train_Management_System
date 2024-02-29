package Test; // 确保这里的包名与你的 City 类相匹配

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Class.City;
import Class.TrainStation;

public class CityTest {
    private City city;
    private TrainStation station1;
    private TrainStation station2;

    @Before
    public void setUp() {
        city = new City("Sample City", "Sample State", "Sample Country", 1000000);
        station1 = new TrainStation("Station1", "Location1", city,2);
        station2 = new TrainStation("Station2", "Location2",city,3);
    }

    @Test
    public void testAddStation() {
        city.addStation(station1);
        assertTrue(city.listStations().contains(station1));
    }

    @Test
    public void testRemoveStation() {
        city.addStation(station1);
        city.removeStation(station1);
        assertFalse(city.listStations().contains(station1));
    }

    @Test
    public void testGetStationInfo() {
        city.addStation(station1);
        assertNotNull(city.getStationInfo("Station1"));
    }

    @Test
    public void testListStations() {
        city.addStation(station1);
        city.addStation(station2);
        assertEquals(2, city.listStations().size());
    }
}
