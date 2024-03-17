

public class IssueOfPassengers {

	/**
	 * 
	 */
	private String issueId;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String resolution;
	/**
	 * 
	 */
	private String category;
	/**
	 * 
	 */
	private int submissionDate;
	/**
	 * Getter of issueId
	 */
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
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param issueId 
	 * @param description 
	 */
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