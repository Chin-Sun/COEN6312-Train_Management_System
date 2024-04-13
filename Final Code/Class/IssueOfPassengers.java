package Class;

public class IssueOfPassengers {

	private String issueId;
	private String description;
	private String resolution;
	private String category;
	private int submissionDate;
	private String status; // Added status attribute
	private Integer resolutionDate; // Changed to Integer to allow for null, assuming this represents a date in some format

	// Getters and Setters for existing fields...

	// Getter and Setter for status
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status == null || (!status.equals("open") && !status.equals("resolved"))) {
			throw new IllegalArgumentException("Status must be 'open' or 'resolved'.");
		}
		this.status = status;
	}

	public void setResolutionDate(Integer resolutionDate) {
		if (status.equals("resolved")) {
			if (resolutionDate == null || resolutionDate < submissionDate) {
				throw new IllegalArgumentException("For resolved issues, resolutionDate must not be null and must be >= submissionDate.");
			}
		}
		this.resolutionDate = resolutionDate;
	}

	public Integer getResolutionDate() {
		return resolutionDate;
	}
	public String getIssueId() {
	 	 return issueId; 
	}
	/**
	 * Setter of issueId
	 */
	public void setIssueId(String issueId) { 
		 this.issueId = issueId; 
	}
	/**
	 * Getter of description
	 */
	public String getDescription() {
	 	 return description; 
	}
	/**
	 * Setter of description
	 */
	public void setDescription(String description) { 
		 this.description = description; 
	}
	/**
	 * Getter of resolution
	 */
	public String getResolution() {
	 	 return resolution; 
	}
	/**
	 * Setter of resolution
	 */
	public void setResolution(String resolution) { 
		 this.resolution = resolution; 
	}
	/**
	 * Getter of category
	 */
	public String getCategory() {
	 	 return category; 
	}
	/**
	 * Setter of category
	 */
	public void setCategory(String category) { 
		 this.category = category; 
	}
	/**
	 * Getter of submissionDate
	 */
	public int getSubmissionDate() {
	 	 return submissionDate; 
	}
	/**
	 * Setter of submissionDate
	 */
	public void setSubmissionDate(int submissionDate) { 
		 this.submissionDate = submissionDate; 
	}
	/**
	 * 
	 * @param resolution 
	 * @param issueId 
	 */
	public void addResolution(String resolution, String issueId) {
		// Assuming you find the issue by issueId and then add resolution
		// This is where you'd also set the resolutionDate and status
		this.resolution = resolution;
		this.setStatus("resolved"); // Automatically set the issue as resolved when adding a resolution
		// this.setResolutionDate(/** current date **/); // Set the resolution date here
	}
	public void updateIssue(String issueId, String description) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param description 
	 * @param category 
	 */
	public void submitIssue(String description, String category) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param category 
	 * @param status 
	 * @return 
	 */
	public String searchIssue(String category, String status) { 
		// TODO Auto-generated method
		return null;
	 } 

}