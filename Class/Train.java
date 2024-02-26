public class Train {
    // Attributes
    private int trainId;
    private String trainName;
    private String route;
    private String schedule;

    // Constructor
    public Train(int trainId, String trainName, String route, String schedule) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.route = route;
        this.schedule = schedule;
    }

    // Methods
    public String getRouteInformation() {
        return route;
    }

    public void updateSchedule(String newSchedule) {
        this.schedule = newSchedule;
        System.out.println("Schedule updated for " + trainName + ": " + newSchedule);
    }
}
