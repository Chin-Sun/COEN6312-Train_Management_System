public class Dispatcher {
    // Attributes
    private int dispatcherId;
    private String name;

    // Constructor
    public Dispatcher(int dispatcherId, String name) {
        this.dispatcherId = dispatcherId;
        this.name = name;
    }

    // Methods
    public void changeSchedule(int trainId, String newSchedule) {
        // Logic to change the schedule for a specific train
        System.out.println(name + " changes schedule for Train ID " + trainId + " to: " + newSchedule);
    }

    public void receiveAlerts(String alert) {
        // Logic to receive alerts
        System.out.println(name + " received an alert: " + alert);
    }

    public void communicateWithPersonnel(String message) {
        // Logic to communicate with personnel
        System.out.println(name + " communicates with personnel: " + message);
    }
}
