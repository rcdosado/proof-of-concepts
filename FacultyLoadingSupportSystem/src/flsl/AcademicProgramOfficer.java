package flsl;

public class AcademicProgramOfficer extends Employee {
	private SubjectOfferings subjectList;
	
	public AcademicProgramOfficer(String name, String id){
		super(name,id);
	}
	/**
	 * @return the courseList
	 */
	public SubjectOfferings getCourseList() {
		return subjectList;
	}

	/**
	 * @param courseList the courseList to set
	 */
	public void setCourseList(SubjectOfferings courseList) {
		this.subjectList = courseList;
	}
	@Override
	public boolean canEditSubjects() {
		// TODO Auto-generated method stub
		return true;
	}

		
	
}
