package Class;
public class TrainDriver {
    // Attributes
    private String driverId;
    private String name;
    private String licenseNumber;
    private int yearsOfExperience;
    private String currentRoute;
    private String healthStatus;
    private String trainStatus; // Added to track the status of the train

    // Constructor
    public TrainDriver(String driverId, String name, String licenseNumber,
                       int yearsOfExperience, String currentRoute, String healthStatus) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.yearsOfExperience = yearsOfExperience;
        this.currentRoute = currentRoute;
        this.healthStatus = healthStatus;
        this.trainStatus = "stopped"; // Initially, the train is not moving.
    }

    // Methods
    public void startTrain() {
        if ("stopped".equals(this.trainStatus)) {
            this.trainStatus = "running";
            System.out.println(name + " has started the train.");
        } else {
            System.out.println("The train is already running.");
        }
    }

    public void stopTrain() {
        if ("running".equals(this.trainStatus)) {
            this.trainStatus = "stopped";
            System.out.println(name + " has stopped the train.");
        } else {
            System.out.println("The train is already stopped.");
        }
    }

    public void reportStatus() {
        System.out.println("Current train status is: " + this.trainStatus);
    }

    public void requestAssistance() {
        // This could be elaborated to notify a central system or log an assistance request
        System.out.println(name + " is requesting assistance.");
    }

    // Getter and Setter methods for each attribute as needed
    public String getCurrentRoute() {
        return currentRoute;
    }

    public void updateRoute(String newRoute) {
        this.currentRoute = newRoute;
        System.out.println("Route updated to: " + newRoute);
    }
    public String getTrainStatus(){
        return trainStatus;
    }
}
