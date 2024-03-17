public class SecurityManager {
    private int managerId;
    private boolean hasDashboardAccess;

    public SecurityManager(int managerId) {
        setManagerId(managerId);
        this.hasDashboardAccess = checkDashboardAccess();
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        // Constraint 3: PositiveManagerId
        if (managerId <= 0) {
            throw new IllegalArgumentException("Manager ID must be positive.");
        }
        this.managerId = managerId;
        this.hasDashboardAccess = checkDashboardAccess();
    }

    // Method to check dashboard access rights
    private boolean checkDashboardAccess() {
        // Constraint 4: AuthorizedDashboardAccess
        return this.managerId > 100;
    }

    // Simulated method for accessing the dashboard, reflecting constraint check
    public void accessDashboard() {
        if (!hasDashboardAccess) {
            throw new SecurityException("Unauthorized access to dashboard. Manager ID must be greater than 100.");
        }
        // Dashboard access logic here
        System.out.println("Accessing the dashboard...");
    }

    // Other methods...
}
