package flsl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
 * 
 * Schedule has time and date  
 * 
 */

public class Schedule {
	Date start;
	Date end;
	ArrayList<String> days;
	
	public Schedule(String day, String start, String end){
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		try {
			this.start = sdf.parse(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.end = sdf.parse(end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * @return the day
	 */
	public ArrayList<String> getDays() {
		return days;
	}


	/**
	 * @param day the day to set
	 */
	public void addDay(String day) {
		this.days.add(day);
	}



	/**
	 * @return the start
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}
	/*
	 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	 * Date before = sdf.parse("07/05/2012 08:00");
	 * Date after = sdf.parse("07/05/2012 08:30");
	 * Date toCheck = sdf.parse("07/05/2012 08:15");
	 * 
	 */
	public static void Main(String[] args){
		
	}

		

}
