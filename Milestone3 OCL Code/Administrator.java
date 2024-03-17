public class Administrator {
    private boolean isBackingUp = false;
    private boolean isRestoring = false;

    public synchronized void backupSystem() {
        if (isRestoring) {
            throw new IllegalStateException("Cannot backup while system is being restored.");
        }
        try {
            isBackingUp = true;
            // Code to backup the system...
        } finally {
            isBackingUp = false;
        }
    }

    public synchronized void restoreSystem() {
        if (isBackingUp) {
            throw new IllegalStateException("Cannot restore while system is being backed up.");
        }
        try {
            isRestoring = true;
            // Code to restore the system...
        } finally {
            isRestoring = false;
        }
    }

    // Other Administrator methods...
}
