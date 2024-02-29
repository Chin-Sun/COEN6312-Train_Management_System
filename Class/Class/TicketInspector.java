package Class;
public class TicketInspector {
    // Attributes
    private int inspectorId;
    private String name;

    // Constructor
    public TicketInspector(int inspectorId, String name) {
        this.inspectorId = inspectorId;
        this.name = name;
    }

    // Method
    public void checkTicket(String ticketDetails) {
        // Logic to check if the ticket is valid
        System.out.println(name + " checks ticket: " + ticketDetails);
    }
}
