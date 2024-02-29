package Class;
public class Administrator {
    // Attributes
    private int adminId;
    private String username;
    // Flags to check if actions are performed (not part of original implementation)
    private boolean isAccountsManaged = false;
    private boolean isSystemBackedUp = false;
    private boolean isSystemRestored = false;

    // Constructor
    public Administrator(int adminId, String username) {
        this.adminId = adminId;
        this.username = username;
    }

    // Methods
    public void manageAccounts() {
        // Logic to manage user accounts
        isAccountsManaged = true;
        System.out.println(username + " manages accounts.");
    }

    public void backupSystem() {
        // Logic to back up the system
        isSystemBackedUp = true;
        System.out.println(username + " backs up the system.");
    }

    public void restoreSystem() {
        // Logic to restore the system from a backup
        isSystemRestored = true;
        System.out.println(username + " restores the system.");
    }
    // Testable actions
    public boolean isAccountsManaged() {
        return isAccountsManaged;
    }

    public boolean isSystemBackedUp() {
        return isSystemBackedUp;
    }

    public boolean isSystemRestored() {
        return isSystemRestored;
    }
}
