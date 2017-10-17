package flsl;

public class FacultyLoadingSystem {
	
	private String name;
	private SubjectOfferings courseList;
	
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
	 * @return the courseList
	 */
	public SubjectOfferings getCourseList() {
		return courseList;
	}
	/**
	 * @param courseList the courseList to set
	 */
	public void setCourseList(SubjectOfferings courseList) {
		this.courseList = courseList;
	}
	
	/*
	 * 
	 * 
	 */
	public boolean uploadCourseList(SubjectOfferings courseList) {
		if( courseList==null )			
			return false;
		
		this.courseList = courseList;
		return true;
	}
	
	/*
	 * 
	 */
	
	public SubjectOfferings accessCourseList() {
		return this.getCourseList();
	}	

	
}
