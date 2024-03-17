import java.util.HashSet;
import java.util.Set;

public class City {
    private Set<Station> stations;

    public City() {
        this.stations = new HashSet<>();
    }

    public void addStation(Station station) {
        // UniqueStationOnAdd: While adding a station, it should not already be in the list of stations.
        if (stations.contains(station)) {
            throw new IllegalArgumentException("Station already exists in the city.");
        }
        stations.add(station);
    }

    public Set<Station> listStations() {
        // CorrectStationList: The listStations operation should return all the stations associated with the city.
        // In Java, returning the set itself already ensures this, as a Set by definition is a collection of unique elements.
        return new HashSet<>(stations); // Returning a copy to prevent external modifications
    }
    
    // Other methods and attributes of City class...
}

class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    // Override equals and hashCode to ensure correct behavior in HashSet.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Station)) return false;
        Station station = (Station) o;
        return name != null ? name.equals(station.name) : station.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    // Getters and setters for Station class...
}
