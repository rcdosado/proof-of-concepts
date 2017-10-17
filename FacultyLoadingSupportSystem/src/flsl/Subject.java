package flsl;

public class Subject {
	
	String subjectCode;
	String description;
	Employee instructor;
	Schedule sched;	
	
	public Subject(String subjectCode, String description, Schedule sched) {
		super();
		this.subjectCode = subjectCode;
		this.description = description;
		this.sched = sched;
	}

	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return subjectCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.subjectCode = courseCode;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the instructor
	 */
	public Employee getInstructor() {
		return instructor;
	}
	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Employee instructor) {
		this.instructor = instructor;
	}
	/**
	 * @return the sched
	 */
	public Schedule getSched() {
		return sched;
	}
	/**
	 * @param sched the sched to set
	 */
	public void setSched(Schedule sched) {
		this.sched = sched;
	}


}
