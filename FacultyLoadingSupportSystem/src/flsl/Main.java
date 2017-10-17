package flsl;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FacultyLoadingSystem fls = new FacultyLoadingSystem();
		AcademicProgramOfficer apo = new AcademicProgramOfficer("Jack Ma", "1000");
		SubjectOfferings courses = new SubjectOfferings(1,"Computer and Network Security");
		ViceChairman vc = new ViceChairman("10","Jeff Bezos");
		
		
		apo.addLoad(new TeachingLoad());
		apo.addLoad(new AdministrativeLoad());
		
		apo.setCourseList(courses);
		
		Subject subj1 = new Subject("cs34", "Machine Language and Computer Organization",
				new Schedule("Monday", "07:30", "10:30"));

		Subject subj2 = new Subject("cs42", "Network Principles with Programming",
				new Schedule("Monday","1:30", "3:30"));
		
		apo.getCourseList().addSubject(subj1);
		apo.getCourseList().addSubject(subj2);
		
		if( !fls.uploadCourseList(apo.getCourseList()) ){
			System.out.println("Cannot upload to server");
			return;
		}
		
		SubjectOfferings vcourses = fls.accessCourseList();
		if( vc.canEditSubjects()){
			vc.setSubjectOfferings(vcourses);
			vc.setSubjectInstructor(subj1, new Faculty("150","Linus Torvalds", "Professor II"));
			vc.setSubjectInstructor(subj2, new Faculty("151","Steve Jobs", "Professor I"));	
		}
		
		if( !fls.uploadCourseList(vc.getSubjects()) ){
			System.out.println("Cannot upload to server");
			return;
		}		
		
		
									

	}

}
