package Class;
import java.util.HashMap;
import java.util.Map;

public class TrainStation {
    private String name;
    private String location;
    private City city;
    private int numberOfPlatforms;
    private Map<Train, String> timetable; // Train to departure time mapping

    public TrainStation(String name, String location, City city, int numberOfPlatforms) {
        this.name = name;
        this.location = location;
        this.city = city;
        this.numberOfPlatforms = numberOfPlatforms;
        this.timetable = new HashMap<>();
    }

    public void addTrainSchedule(Train train, String departureTime) {
        timetable.put(train, departureTime);
    }

    public void removeTrainSchedule(Train train) {
        timetable.remove(train);
    }

    public Train findNextTrain(String destination) {
        // Assuming Train has a method getDestination()
        for (Train train : timetable.keySet()) {
            if (train.getRouteInformation().equals(destination)) {
                return train;
            }
        }
        return null;
    }

    public Map<Train, String> listAllDepartures() {
        return timetable;
    }
    public String getName(){
        return name;
    }

    // Getters and setters for each field

}
