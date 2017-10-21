package flsl;

import java.util.ArrayList;

public class Room {
	String name;
	int capacity;
	ArrayList<Schedule> schedules;
	
	/**
	 * @return the schedules
	 */
	public ArrayList<Schedule> getSchedules() {
		return schedules;
	}
	/**
	 * @param schedules the schedules to set
	 */
	public void addSchedule(Schedule schedule) {
		
		this.schedules.add(schedule);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	

}
