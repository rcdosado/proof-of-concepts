package flsl;

import java.util.ArrayList;

public class SubjectOfferings {
	private int id;
	private String specialization;
	private ArrayList<Subject> subjects;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public SubjectOfferings(int id,String specialization) {		
		this.specialization = specialization;
		this.subjects = new ArrayList<Subject>();
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
	
	/*
	 * 
	 */
	public ArrayList<Subject> getCourseList(){
		return this.subjects;
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

	public static void main(String[] args) {
//		SubjectOfferings c = new SubjectOfferings(1,"Networking");
//		
//		Schedule before = new Schedule("Monday", "08:00","08:30");		
//		Schedule toCheck = new Schedule("Monday", "08:15", "08:20");
//		
//		String outs = c.isSameTime(before, toCheck) ? "Yes": "No";
//		System.out.println("Is Same Schedule: "+ outs);
//		outs = c.isBetween(before, toCheck) ? "Yes": "No";
//		System.out.println("Is Schedule overlaps: "+ outs);
		
		
	}
	
	
}
