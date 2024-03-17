

import java.util.List;

public class PassengerAnalytics {

	/**
	 * 
	 */
	public String peakTime;
	/**
	 * 
	 */
	public String analysisType;
	/**
	 * 
	 */
	public List<String> travelLocations;
	/**
	 * 
	 */
	public List<String> passengerData;
	/**
	 * Getter of peakTime
	 */
	public String getPeakTime() {
	 	 return peakTime; 
	}
	/**
	 * Setter of peakTime
	 */
	public void setPeakTime(String peakTime) { 
		 this.peakTime = peakTime; 
	}
	/**
	 * Getter of analysisType
	 */
	public String getAnalysisType() {
	 	 return analysisType; 
	}
	/**
	 * Setter of analysisType
	 */
	public void setAnalysisType(String analysisType) { 
		 this.analysisType = analysisType; 
	}
	/**
	 * Getter of travelLocations
	 */
	public List<String> getTravelLocations() {
	 	 return travelLocations; 
	}
	/**
	 * Setter of travelLocations
	 */
	public void setTravelLocations(List<String> travelLocations) { 
		 this.travelLocations = travelLocations; 
	}
	/**
	 * Getter of passengerData
	 */
	public List<String> getPassengerData() {
	 	 return passengerData; 
	}
	/**
	 * Setter of passengerData
	 */
	public void setPassengerData(List<String> passengerData) { 
		 this.passengerData = passengerData; 
	}
	/**
	 * 
	 * @param startDate 
	 * @param passengerData 
	 * @param endDate 
	 */
	public void collectData(String startDate, String passengerData, String endDate) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param analysisType 
	 * @param passengerData 
	 * @return 
	 */
	public String identifyTrends(String analysisType, String passengerData) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param includeSections 
	 * @param analysisType 
	 * @return 
	 */
	public String generateReports(String includeSections, String analysisType) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param trendResults 
	 * @return 
	 */
	public String recommendChanges(String trendResults) { 
		// TODO Auto-generated method
		return null;
	 } 

}