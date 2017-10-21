package flsl;

import java.util.ArrayList;
enum RoomType {
	LABORATORY,
	LECTURE
}
public class Room {
	String name;
	int capacity;
	RoomType type;

	ArrayList<Schedule> schedules;
		
	public Room(String name, int capacity, RoomType type) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.type = type;
		this.schedules = new ArrayList<Schedule>();
	}

	/**
	 * @return the type
	 */
	public RoomType getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(RoomType type) {
		this.type = type;
	}

	/**
	 * @return the schedules
	 */
	public ArrayList<Schedule> getSchedules() {
		return schedules;
	}
	/**
	 * @param schedules the schedules to set
	 */
	public boolean addSubject(Subject subject) {
		if( this.isValid(subject.getSched())){
			return this.schedules.add(subject.getSched());			
		}
			
		return false;
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
	
	public boolean isValid(Schedule sched){
		// TODO:
		// test if a schedule does not conflict with other schedules in this room
		// returns true if no conflict, otherwise
		return true;
	}

	

}
