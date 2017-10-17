package flsl;

import java.util.ArrayList;

public class FacultyLoadingSystem {
	
	private String name;
	private ArrayList<Course> courseList;
	
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
	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	/**
	 * @param courseList the courseList to set
	 */
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	
	

	
}
