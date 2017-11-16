package flsl;

import java.util.ArrayList;

public class Preferences {
	
	ArrayList<Schedule> prefSchedules;

	/**
	 * @return the prefSchedules
	 */
	public ArrayList<Schedule> getPrefSchedules() {
		return prefSchedules;
	}

	/**
	 * @param prefSchedules the prefSchedules to set
	 */
	public void addPreferredSchedule(Schedule schedule) {
		this.prefSchedules.add(schedule);
	}
	
	

}
