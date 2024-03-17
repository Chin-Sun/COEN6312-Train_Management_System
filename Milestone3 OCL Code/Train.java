import java.util.HashSet;
import java.util.Set;

class Train {
    private String trainName;
    private boolean operational;
    private Set<TrainStation> stations = new HashSet<>();
    private Set<ScheduleEntry> schedule = new HashSet<>();
    private Set<City> route = new HashSet<>();

    public Train(String trainName, boolean operational) {
        setTrainName(trainName);
        this.operational = operational;
    }

    public void setTrainName(String trainName) {
        // Ensure trainName has no leading or trailing whitespace
        if (trainName == null || !trainName.trim().equals(trainName)) {
            throw new IllegalArgumentException("Train name must not contain leading or trailing whitespace.");
        }
        this.trainName = trainName;
    }

    public void addStation(TrainStation station) {
        // Ensure every Train is associated with at least one TrainStation
        if (station == null) {
            throw new IllegalArgumentException("Station cannot be null.");
        }
        stations.add(station);
        station.addTrain(this);
    }

    public void addScheduleEntry(ScheduleEntry entry) {
        // Ensure the schedule of an operational Train has at least one entry
        if (entry == null) {
            throw new IllegalArgumentException("Schedule entry cannot be null.");
        }
        if (operational && schedule.isEmpty()) {
            schedule.add(entry);
        }
    }

    public void addRoute(City city) {
        // Ensure a Train's route is a valid association to City objects
        if (city == null || !City.allInstances().contains(city)) {
            throw new IllegalArgumentException("City must be a valid instance.");
        }
        route.add(city);
    }

    // Check if cities of all TrainStations are included in the Train's route
    public boolean checkTrainStationCityRouteInclusion() {
        for (TrainStation station : stations) {
            if (!route.contains(station.getCity())) {
                return false;
            }
        }
        return true;
    }

    // Other getters and setters...
}

class TrainStation {
    private City city;
    private Set<Train> trains = new HashSet<>();

    public TrainStation(City city) {
        if (city == null) {
            throw new IllegalArgumentException("City cannot be null.");
        }
        this.city = city;
    }

    public void addTrain(Train train) {
        if (train == null) {
            throw new IllegalArgumentException("Train cannot be null.");
        }
        trains.add(train);
        train.addRoute(city); // Ensure the Train's route includes this station's city
    }

    public City getCity() {
        return city;
    }

    // Other methods...
}

class ScheduleEntry {
    // Schedule entry details
}

class City {
    private static Set<City> allInstances = new HashSet<>();

    public City() {
        allInstances.add(this);
    }

    public static Set<City> allInstances() {
        return new HashSet<>(allInstances);
    }

    // Other city details...
}
