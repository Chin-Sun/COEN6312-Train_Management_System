import java.util.regex.Pattern;
import java.util.Set;

public class BackendManagement {
    private String phone;
    private String trainId;
    
    // This set should contain all valid train IDs in the system.
    private Set<String> validTrainIds;

    public BackendManagement(Set<String> validTrainIds) {
        this.validTrainIds = validTrainIds;
    }

    // Assuming a Train class exists that has a static method getAllInstances to return all Train instances
    public void setTrainId(String trainId) {
        // Constraint 3: ValidTrainNumber
        if (!validTrainNumber(trainId)) {
            throw new IllegalArgumentException("Invalid train number. It does not match an actual train.");
        }
        this.trainId = trainId;
    }
    
    public void setPhone(String phone) {
        // Constraint 4: ValidPhoneFormat
        if (!validPhoneFormat(phone)) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        this.phone = phone;
    }
    
    // Helper method to check for a valid train number
    private boolean validTrainNumber(String trainId) {
        // Check if the trainId exists in the set of valid train IDs
        return validTrainIds.contains(trainId);
    }

    // Helper method to check for a valid phone format
    private boolean validPhoneFormat(String phone) {
        String regex = "^[+]?[0-9]{10,13}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(phone).matches();
    }

    // Getters and other methods...
}
