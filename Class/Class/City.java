package Class;
import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String state;
    private String country;
    private int population;
    private List<TrainStation> stations;

    public City(String name, String state, String country, int population) {
        this.name = name;
        this.state = state;
        this.country = country;
        this.population = population;
        this.stations = new ArrayList<>();
    }

    public void addStation(TrainStation station) {
        stations.add(station);
    }

    public void removeStation(TrainStation station) {
        stations.remove(station);
    }

    public TrainStation getStationInfo(String stationName) {
        for (TrainStation station : stations) {
            if (station.getName().equals(stationName)) {
                return station;
            }
        }
        return null;
    }

    public List<TrainStation> listStations() {
        return stations;
    }

    // Getters and setters for each field
}
