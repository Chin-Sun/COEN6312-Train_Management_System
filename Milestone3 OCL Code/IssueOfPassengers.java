import java.time.LocalDate;

public class IssueForPassengers {
    private String status; // Allowed values: "open", "resolved"
    private LocalDate submissionDate;
    private LocalDate resolutionDate;

    public IssueForPassengers(String status, LocalDate submissionDate) {
        setStatus(status);
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || (!status.equals("open") && !status.equals("resolved"))) {
            throw new IllegalArgumentException("Status must be either 'open' or 'resolved'.");
        }
        this.status = status;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        // Assuming the submission date cannot change once set, or implement validation as needed.
        this.submissionDate = submissionDate;
    }

    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(LocalDate resolutionDate) {
        if (resolutionDate != null && resolutionDate.isBefore(submissionDate)) {
            throw new IllegalArgumentException("Resolution date cannot be before submission date.");
        }
        this.resolutionDate = resolutionDate;
    }

    // Method to resolve an issue, setting its status to "resolved" and updating the resolution date.
    public void resolveIssue(LocalDate resolutionDate) {
        if (resolutionDate == null || resolutionDate.isBefore(submissionDate)) {
            throw new IllegalArgumentException("Invalid resolution date.");
        }
        this.status = "resolved";
        this.resolutionDate = resolutionDate;
    }
}
