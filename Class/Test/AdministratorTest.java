package Test;

import org.junit.Before;
import org.junit.Test;
import Class.Administrator;

//import static com.sun.tools.classfile.AccessFlags.Kind.Class;
import static org.junit.Assert.*;

public class AdministratorTest {
    private Administrator admin;

    @Before
    public void setUp() {
        admin = new Administrator(1, "AdminUser");
    }

    @Test
    public void testManageAccounts() {
        assertFalse("Initially, accounts should not be managed", admin.isAccountsManaged());
        admin.manageAccounts();
        assertTrue("Accounts should be managed after calling manageAccounts", admin.isAccountsManaged());
    }

    @Test
    public void testBackupSystem() {
        assertFalse("Initially, system should not be backed up", admin.isSystemBackedUp());
        admin.backupSystem();
        assertTrue("System should be backed up after calling backupSystem", admin.isSystemBackedUp());
    }

    @Test
    public void testRestoreSystem() {
        assertFalse("Initially, system should not be restored", admin.isSystemRestored());
        admin.restoreSystem();
        assertTrue("System should be restored after calling restoreSystem", admin.isSystemRestored());
    }
}
