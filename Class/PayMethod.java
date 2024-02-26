public class PayMethod {
    // Attributes
    private int methodId;
    private String methodName;
    private boolean availability;
    private double transactionFee;

    // Constructor
    public PayMethod(int methodId, String methodName, boolean availability, double transactionFee) {
        this.methodId = methodId;
        this.methodName = methodName;
        this.availability = availability;
        this.transactionFee = transactionFee;
    }

    // Methods
    public boolean validatePaymentDetails(String details) {
        // Implementation for validating payment details
        return true; // Placeholder return
    }

    public boolean processPayment(double amount, String details) {
        // Implementation for processing payment
        return true; // Placeholder return
    }

    public boolean refundPayment(String transactionId, double amount) {
        // Implementation for refunding payment
        return true; // Placeholder return
    }

    public double getTransactionFee(double amount) {
        // Implementation for calculating transaction fee
        return transactionFee; // Placeholder return
    }

    // Getter and Setter methods for each attribute as needed
}
