package flsl;

public class ViceChairman extends Employee {
	private SubjectOfferings subjects;
	
	public ViceChairman( String id, String name){
		super(name,id);		
	}	
	/**
	 * @return the subjects
	 */
	public SubjectOfferings getSubjects() {
		return subjects;
	}

	/**
	 * @return the subjects
	 */
	public void setSubjectOfferings(SubjectOfferings offerings) {
		this.subjects = offerings;
	}
	
	
	public void setSubjectInstructor(Subject s, Employee f){
		s.setInstructor(f);
	}
	@Override
	public boolean canEditSubjects() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean canReadSubjects() {
		// TODO Auto-generated method stub
		return true;
	}



}
