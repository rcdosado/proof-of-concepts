package flsl;

import java.util.ArrayList;

public class Course {
	private String id;
	private String specialization;
	private String courseTitle;
	private ArrayList<Subject> subjects;
	
	
	public Course(String id,String courseTitle, String specialization) {		
		this.id = id;
		this.courseTitle = courseTitle;
		this.specialization = specialization;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}

	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}
	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	/**
	 * @return the subjects
	 */
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void addSubject(Subject subject) {
		if( !isConflict(subject) )
			this.subjects.add(subject);
	}

	// Check if time of all subjects are conflict with the new subject, before adding
	public boolean isConflict(Subject newSubject){
		for(Subject s:subjects){
			if( isSameTime(s.getSched(), newSubject.getSched()) ||
					isBetween(s.getSched(), newSubject.getSched()) ){
				return false;
			}
		}		
		return true;
	}
	private boolean isSameTime(Schedule compareThis,Schedule toThis){
		return compareThis.getStart().compareTo(toThis.getStart()) == 0 &&
				compareThis.getEnd().compareTo(toThis.getEnd()) == 0;
	}
	private boolean isBetween(Schedule before,Schedule toCheck){
		 return ((before.start.getTime() < toCheck.start.getTime()) && 
			before.end.getTime() > toCheck.start.getTime()) || 
		    ((before.start.getTime() < toCheck.end.getTime()) && 
				before.end.getTime() > toCheck.end.getTime()); 
	}
	
	/**
	 * @param args
	 */
	/*
	 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	 * Date before = sdf.parse("07/05/2017 08:00");
	 * Date after = sdf.parse("07/05/2017 08:30");
	 * Date toCheck = sdf.parse("07/05/2017 08:15");
	 */
	public static void main(String[] args) {
		Course c = new Course("CS123","BSCS","Networking");
		
		Schedule before = new Schedule("07/05/2012 08:00","07/05/2012 08:30");		
		Schedule toCheck = new Schedule("07/05/2012 08:15", "07/05/2012 08:20");
		
		String outs = c.isSameTime(before, toCheck) ? "Yes": "No";
		System.out.println("Is Same Schedule: "+ outs);
		outs = c.isBetween(before, toCheck) ? "Yes": "No";
		System.out.println("Is Schedule overlaps: "+ outs);
		
		
	}
	
	
}
