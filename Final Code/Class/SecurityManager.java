
package Class;
public class SecurityManager {

	/**
	 * 
	 */
	private int id;
	private boolean hasDashboardAccess;
	public SecurityManager(int managerId) {
		setManagerId(id);
		this.hasDashboardAccess = checkDashboardAccess();
	}
	public void setManagerId(int managerId) {
		// Constraint 2: PositiveManagerId
		if (managerId <= 0) {
			throw new IllegalArgumentException("Manager ID must be positive.");
		}
		this.id = managerId;
		this.hasDashboardAccess = checkDashboardAccess();
	}
	public void accessDashboard() {
		if (!hasDashboardAccess) {
			throw new SecurityException("Unauthorized access to dashboard. Manager ID must be greater than 100.");
		}
		// Dashboard access logic here
		System.out.println("Accessing the dashboard...");
	}

	// Method to check dashboard access rights
	private boolean checkDashboardAccess() {
		// Constraint 3: AuthorizedDashboardAccess
		return this.id > 100;
	}
	/**
	 * Getter of id
	 */
	public int getId() {
	 	 return id; 
	}

	/**
	 * Setter of id
	 */
	public void setId(int id) { 
		 this.id = id; 
	}

	/**
	 * 
	 * @param incidentDetails 
	 */
	public void reportIncident(String incidentDetails) { 
		// TODO Auto-generated method
	 }

	/**
	 * 
	 */


}