package Class;

import java.util.List;

public class City {
	private String name;
	private int population;
	private String country;
	public List<String> stations;
	private String state;

	public City(String name, String state, String country, int population) {
		setName(name);
		setState(state);
		setCountry(country);
		setPopulation(population);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name must not be empty");
		}
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if (state == null || state.trim().isEmpty()) {
			throw new IllegalArgumentException("State must not be empty");
		}
		this.state = state;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		if (population < 0) {
			throw new IllegalArgumentException("Population must be non-negative");
		}
		this.population = population;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country == null || country.trim().isEmpty()) {
			throw new IllegalArgumentException("Country must not be empty");
		}
		this.country = country;
	}

	public List<String> getStations() {
		return stations;
	}

	public void setStations(List<String> stations) {
		this.stations = stations;
	}



	public TrainStation getStationInfo() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param TrainStations 
	 * @return 
	 */
	public String listStations(TrainStation TrainStations) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param TrainStation 
	 * @return 
	 */
	public boolean addStation(TrainStation TrainStation) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @param TrainStation 
	 * @return 
	 */
	public boolean removeStation(TrainStation TrainStation) { 
		// TODO Auto-generated method
		return false;
	 } 

}