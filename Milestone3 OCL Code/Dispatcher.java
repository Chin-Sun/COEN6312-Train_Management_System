import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Train> trains;
    private List<Personnel> personnel;
    private List<String> alerts;

    public Dispatcher() {
        this.trains = new ArrayList<>();
        this.personnel = new ArrayList<>();
        this.alerts = new ArrayList<>();
    }

    // Assuming a method to change the schedule of a train
    public void changeSchedule(Train train, Schedule newSchedule) {
        // Constraint: CannotChangeScheduleInTransit
        if ("InTransit".equals(train.getCurrentStatus())) {
            throw new IllegalStateException("Cannot change the schedule of a train in transit.");
        }
        train.setSchedule(newSchedule);
    }

    // Method to simulate receiving alerts
    public void receiveAlert(String alert) {
        alerts.add(alert);
        // AlertsRequireCommunication: Automatically communicate with personnel if an alert is received
        if (!alerts.isEmpty()) {
            communicateWithPersonnel();
        }
    }

    // Communicates with TrainOperator
    private void communicateWithPersonnel() {
        // CommunicatesWithTrainOperator: Ensuring at least one communication with a TrainOperator
        boolean hasCommunicatedWithTrainOperator = personnel.stream().anyMatch(p -> p instanceof TrainOperator);
        if (!hasCommunicatedWithTrainOperator) {
            throw new IllegalStateException("Must communicate with at least one Train Operator.");
        }
        // Logic for communication...
    }

    // Methods to manage trains and personnel...
    public void addTrain(Train train) {
        trains.add(train);
    }

    public void addPersonnel(Personnel person) {
        personnel.add(person);
    }
}

class Train {
    private String currentStatus;
    private Schedule schedule;

    // Constructors, getters, setters
    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}

class Schedule {
    // Schedule details
}

abstract class Personnel {
    // Details for personnel
}

class TrainOperator extends Personnel {
    // Specific details for TrainOperator
}
