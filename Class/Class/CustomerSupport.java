package Class;
public class CustomerSupport {
    // Attributes
    private int supportId;
    private String name;

    // Constructor
    public CustomerSupport(int supportId, String name) {
        this.supportId = supportId;
        this.name = name;
    }

    // Methods
    public void prioritizeIssues() {
        // Logic to prioritize customer issues
        System.out.println(name + " is prioritizing customer issues.");
    }

    public void provideAssistance(String assistanceDetails) {
        // Logic to provide assistance to a customer
        System.out.println(name + " provides assistance: " + assistanceDetails);
    }

    public void verifyInformation(String customerInfo) {
        // Logic to verify customer information
        System.out.println(name + " verifies customer information: " + customerInfo);
    }
}
