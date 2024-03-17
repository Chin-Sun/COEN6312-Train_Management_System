import java.util.HashSet;
import java.util.Set;

public class IDRegistry {
    private static Set<String> registeredIDs = new HashSet<>();

    public static boolean registerID(String id) {
        return registeredIDs.add(id);
    }

    public static void unregisterID(String id) {
        registeredIDs.remove(id);
    }

    public static boolean isIDTaken(String id) {
        return registeredIDs.contains(id);
    }
}

class TrainOperator {
    private String operatorID;

    public TrainOperator(String operatorID) {
        if (IDRegistry.isIDTaken(operatorID)) {
            throw new IllegalArgumentException("Operator ID is already taken.");
        }
        this.operatorID = operatorID;
        IDRegistry.registerID(operatorID);
    }

    // Ensure cleanup on deletion or reassignment of ID
    protected void finalize() throws Throwable {
        IDRegistry.unregisterID(operatorID);
        super.finalize();
    }

    // Other methods...
}

class Dispatcher {
    private String dispatcherID;

    public Dispatcher(String dispatcherID) {
        if (IDRegistry.isIDTaken(dispatcherID)) {
            throw new IllegalArgumentException("Dispatcher ID is already taken.");
        }
        this.dispatcherID = dispatcherID;
        IDRegistry.registerID(dispatcherID);
    }

    // Ensure cleanup on deletion or reassignment of ID
    protected void finalize() throws Throwable {
        IDRegistry.unregisterID(dispatcherID);
        super.finalize();
    }

    // Other methods...
}
