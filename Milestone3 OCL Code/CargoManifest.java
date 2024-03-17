public class Train {
    private int maxCapacity;

    public Train(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}

public class CargoManifest {
    private String departureStation;
    private String destinationStation;
    private int weight;
    private Train train;

    public CargoManifest(Train train) {
        if (train == null) {
            throw new IllegalArgumentException("Train cannot be null.");
        }
        this.train = train;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.trim().isEmpty()) {
            throw new IllegalArgumentException("Departure station cannot be empty.");
        }
        this.departureStation = departureStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        if (destinationStation == null || destinationStation.trim().isEmpty()) {
            throw new IllegalArgumentException("Destination station cannot be empty.");
        }
        this.destinationStation = destinationStation;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0 || weight > train.getMaxCapacity()) {
            throw new IllegalArgumentException("Weight must be positive and within the train's max capacity.");
        }
        this.weight = weight;
    }

    // Additional getters and setters...
}
