package Class;
public class TrainOperator {
    // Attributes
    private int operatorId;
    private String name;

    // Constructor
    public TrainOperator(int operatorId, String name) {
        this.operatorId = operatorId;
        this.name = name;
    }

    // Methods
    public void trackTrainStatus() {
        // Logic to track the train's current status
        System.out.println(name + " is tracking the train status.");
    }

    public void notifyEmergency(String message) {
        // Logic to notify about emergency situations
        System.out.println(name + " reports an emergency: " + message);
    }
}
