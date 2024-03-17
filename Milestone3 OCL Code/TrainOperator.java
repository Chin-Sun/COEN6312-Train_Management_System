public class TrainOperator {
    private String operatorID;

    public TrainOperator(String operatorID) {
        if (!Dispatcher.isIDUnique(operatorID)) {
            throw new IllegalArgumentException("Operator ID must not be the same as any Dispatcher's ID.");
        }
        this.operatorID = operatorID;
    }

    // Getter and other methods...
}
