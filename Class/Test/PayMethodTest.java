package Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import  Class.PayMethod;

public class PayMethodTest {
    private PayMethod payMethod;

    @Before
    public void setUp() {
        // Initialize PayMethod with test data
        payMethod = new PayMethod(1, "CreditCard", true, 2.5);
    }

    @Test
    public void testValidatePaymentDetails() {
        // Assume validatePaymentDetails returns true for valid details
        assertTrue("Payment details should be valid",
                payMethod.validatePaymentDetails("ValidDetails"));
    }

    @Test
    public void testProcessPayment() {
        // Assume processPayment returns true for successful processing
        assertTrue("Payment should be processed successfully",
                payMethod.processPayment(100, "ValidDetails"));
    }

    @Test
    public void testRefundPayment() {
        // Assume refundPayment returns true for successful refund
        assertTrue("Payment should be refunded successfully",
                payMethod.refundPayment("TX123", 100));
    }

    @Test
    public void testGetTransactionFee() {
        // Check if the transaction fee is calculated correctly
        double expectedFee = 2.5; // Based on the placeholder implementation
        assertEquals("Transaction fee should be calculated correctly",
                expectedFee, payMethod.getTransactionFee(100), 0.0);
    }
}
