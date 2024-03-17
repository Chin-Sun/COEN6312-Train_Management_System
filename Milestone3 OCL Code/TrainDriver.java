import java.util.HashSet;
import java.util.Set;

public class TrainDriver {
    private String driverID;
    private String name;
    private int yearsOfExperience;
    private Train assignedTrain;

    public TrainDriver(String driverID, String name, int yearsOfExperience) {
        setDriverID(driverID);
        setName(name);
        setYearsOfExperience(yearsOfExperience);
    }

    public void assignTrain(Train train) {
        if (this.assignedTrain != null) {
            throw new IllegalStateException("Driver is already operating another train.");
        }
        if (Train.getAllInstances().stream().anyMatch(t -> t.getCurrentOperator() == this)) {
            throw new IllegalStateException("Driver cannot operate more than one train.");
        }
        this.assignedTrain = train;
        train.setCurrentOperator(this);
    }

    public void unassignTrain() {
        this.assignedTrain = null;
    }

    private void setDriverID(String driverID) {
        if (driverID == null || driverID.trim().isEmpty()) {
            throw new IllegalArgumentException("Driver ID must not be empty.");
        }
        this.driverID = driverID;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
    }

    private void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience must be zero or positive.");
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters and other methods...
}

class Train {
    private static Set<Train> allInstances = new HashSet<>();
    private TrainDriver currentOperator;

    public Train() {
        allInstances.add(this);
    }

    public static Set<Train> getAllInstances() {
        return new HashSet<>(allInstances);
    }

    public TrainDriver getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(TrainDriver currentOperator) {
        this.currentOperator = currentOperator;
    }

    // Other methods...
}
