public class TicketingStaff {
    // Attributes
    private int staffId;
    private String name;

    // Constructor
    public TicketingStaff(int staffId, String name) {
        this.staffId = staffId;
        this.name = name;
    }

    // Methods
    public void processPurchase(String purchaseDetails) {
        // Logic to process ticket purchase
        System.out.println(name + " processes purchase: " + purchaseDetails);
    }

    public void refundTicket(String ticketDetails) {
        // Logic to refund a ticket
        System.out.println(name + " processes refund for ticket: " + ticketDetails);
    }

    public void assistInquiries(String inquiryDetails) {
        // Logic to assist with customer inquiries
        System.out.println(name + " assists with inquiry: " + inquiryDetails);
    }
}
