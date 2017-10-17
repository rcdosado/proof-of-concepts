package flsl;

import java.util.ArrayList;

public class AcademicProgramOfficer extends Employee {
	private ArrayList<Course> courseList;
	
	public AcademicProgramOfficer(String name, String id){
		super(name,id);
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
	
	public void addCourse(Course course){
		this.courseList.add(course);
	}
		
	
}
