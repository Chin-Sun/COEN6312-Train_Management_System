
package Class;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {


	private String name;
	/**
	 * 
	 */
	private String Id;

	private List<Train> trains;
	private List<String> alerts;

	private static List<Dispatcher> allDispatchers = new ArrayList<>();

	public Dispatcher(String name, String Id) {
		this.name = name;
		this.Id = Id;
		allDispatchers.add(this);
	}

	public static List<String> getAllDispatcherIDs() {
		List<String> ids = new ArrayList<>();
		for (Dispatcher dispatcher : allDispatchers) {
			ids.add(dispatcher.getId());
		}
		return ids;
	}


	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Getter of Id
	 */
	public String getId() {
	 	 return Id; 
	}
	/**
	 * Setter of Id
	 */
	public void setId(String Id) { 
		 this.Id = Id; 
	}

	public void changeSchedule(Train train, String newSchedule) {
		// Constraint: CannotChangeScheduleInTransit
		if ("InTransit".equals(train.getCurrentStatus())) {
			throw new IllegalStateException("Cannot change the schedule of a train in transit.");
		}
		train.addSchedule(newSchedule);
	}

	// Method to simulate receiving alerts
	public void receiveAlert(String alert) {
		alerts.add(alert);
		// AlertsRequireCommunication: Automatically communicate with personnel if an alert is received
		if (!alerts.isEmpty()) {
			communicateWithPersonnel();
		}
	}

	// Communicates with TrainOperator
	private void communicateWithPersonnel() {

		throw new IllegalStateException("Must communicate with at least one Train Operator.");
		// Logic for communication...
	}


}