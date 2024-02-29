package Class;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class IssueOfPassengers {
    // Attributes
    private String issueId;
    private String description;
    private String category;
    private String resolution;
    private Date submissionDate;
    private String status; // Ensure this exists

// A static list to hold all issues for simplicity
    public static List<IssueOfPassengers> issuesList = new ArrayList<>();
  
    // Constructor
    public IssueOfPassengers(String issueId, String description, 
                             String category) {
        this.issueId = issueId;
        this.description = description;
        this.category = category;        
        this.submissionDate = new Date(); // Sets the current date as submission date
    }
    // Modified constructor to accept an additional String for status
    // Methods
    public static void submitIssue(String description, String category) {
        // Generate a unique issue ID, simplistic approach
        String issueId = "ISSUE" + (issuesList.size() + 1);
        IssueOfPassengers newIssue = new IssueOfPassengers(issueId, description, category);
        issuesList.add(newIssue);
    }



    public static void addResolution(String issueId, String resolution) {
        for (IssueOfPassengers issue : issuesList) {
            if (issue.issueId.equals(issueId)) {
                issue.resolution = resolution;
//                updateIssueStatus(issueId, "resolved"); // Update status to resolved
                break;
            }
        }
    }

    public static List<IssueOfPassengers> searchIssues(String category) {
        return issuesList.stream()
                .filter(issue -> issue.category.equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public static List<IssueOfPassengers> listOpenIssues() {
        return searchIssues("open");
    }

    public static IssueOfPassengers getIssue(String issueId) {
        for (IssueOfPassengers issue : issuesList) {
            if (issue.issueId.equals(issueId)) {
                return issue;
            }
        }
        return null; // No issue found with the given ID
    }
    // Getter for issueId
    public String getIssueId() {
        return issueId;
    }

    // Getter for resolution
    public String getResolution() {
        return resolution;
    }
}
