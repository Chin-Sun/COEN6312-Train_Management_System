import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InfrastructureMaintenance {
    private static Set<String> validTypes = new HashSet<>(Arrays.asList("Track", "Signal", "Station", "Train"));
    private static Set<String> validStatuses = new HashSet<>(Arrays.asList("Scheduled", "InProgress", "Completed", "Cancelled"));
    private static List<String> allMaintenanceIds = new ArrayList<>(); // To track all maintenance IDs for uniqueness

    private String type; // Changed from List<String> for simplification based on your OCL constraint
    private LocalDate schedule; // Changed to LocalDate for date comparisons
    private String status;
    private String maintenanceId;

    // Assume getters and setters are here

    public void setMaintenanceId(String maintenanceId) {
        if (!allMaintenanceIds.contains(maintenanceId)) {
            this.maintenanceId = maintenanceId;
            allMaintenanceIds.add(maintenanceId);
        } else {
            throw new IllegalArgumentException("Maintenance ID must be unique.");
        }
    }

    public void setSchedule(LocalDate schedule) {
        if (schedule.isAfter(LocalDate.now())) {
            this.schedule = schedule;
        } else {
            throw new IllegalArgumentException("Schedule must represent a future date.");
        }
    }

    public void setType(String type) {
        if (validTypes.contains(type)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Invalid type specified.");
        }
    }

    public void setStatus(String status) {
        if (validStatuses.contains(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Invalid status specified.");
        }
    }

    // Additional methods...
}
