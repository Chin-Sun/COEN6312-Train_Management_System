public class SecurityManager {
    // Attributes
    private int managerId;
    private String name;

    // Constructor
    public SecurityManager(int managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }

    // Methods
    public void reportIncident(String incidentDetails) {
        // Logic to report a security incident
        System.out.println(name + " reports an incident: " + incidentDetails);
    }

    public void accessDashboard() {
        // Logic to access the security dashboard
        System.out.println(name + " accesses the security dashboard.");
    }
}
