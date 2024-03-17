import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class PayMethod {

	private String transactionId;
	private boolean availability;
	private List<String> validatePaymentDetails;
	private String methodName;
	private float amount;
	// Added to track transactions and their amounts
	private Map<String, Float> transactions = new HashMap<>();

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public List<String> getValidatePaymentDetails() {
		return validatePaymentDetails;
	}

	public void setValidatePaymentDetails(List<String> validatePaymentDetails) {
		this.validatePaymentDetails = validatePaymentDetails;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean refundPayment(String transactionId, float amount) {
		Float storedAmount = transactions.get(transactionId);
		if (storedAmount != null && storedAmount == amount) {
			// Process refund logic here
			return true;
		}
		return false;
	}

	public boolean processPayment(List<String> validatePaymentDetails, float amount) {
		// Store transaction with a generated or provided transaction ID and amount
		 String transactionId = generateTransactionId();
		 transactions.put(transactionId, amount);
		// Process payment logic here
		return true;
	}

	private String generateTransactionId() {
		// Generates a unique identifier based on UUID for simplicity
		return UUID.randomUUID().toString();
	}

	// Additional methods as necessary...
}
