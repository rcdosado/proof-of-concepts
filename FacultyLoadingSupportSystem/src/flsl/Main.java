package flsl;
import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * This is the system where users updates the course list
		 */
		FacultyLoadingSystem fls = new FacultyLoadingSystem();
		
		/*
		 * Academic Programming Officer 
		 */
		AcademicProgramOfficer apo = new AcademicProgramOfficer("Jack Ma", "1000");
		
		/*
		 * List of Courses with ID number & specialization
		 */
		SubjectOfferings courses = new SubjectOfferings(1,"Computer and Network Security");
		
		/*
		 * The vice chair will assign faculty to subjects
		 */
		ViceChairman vc = new ViceChairman("10","Jeff Bezos");
				
		/*
		 * This code allows any employee to have any type of load e.g Academic Program officer is given 
		 * a Administrative Load and TeachingLoad
		 */
		apo.addLoad(new TeachingLoad());
		apo.addLoad(new AdministrativeLoad());
		
		/*
		 * A.P.O prepares courses to be offered, and add a subject into it
		 */
		apo.setCourseList(courses);
		
		/*
		 * Create initial subjects, (note) Instructors is not yet filled
		 */
		Subject subj1 = new Subject("cs34", "Machine Language and Computer Organization",
				new Schedule("Monday", "07:30", "10:30"));

		Subject subj2 = new Subject("cs42", "Network Principles with Programming",
				new Schedule("Monday","1:30", "3:30"));
		
		/*
		 * Save subjects to course listing
		 */
		apo.getCourseList().addSubject(subj1);
		apo.getCourseList().addSubject(subj2);
		
		/*
		 * Academic Program Officer uploads added courses to the Faculty Loading System
		 */
		if( !fls.uploadCourseList(apo.getCourseList()) ){
			System.out.println("Cannot upload to server");
			return;
		}
				
		/*
		 * test if Vice chairman can modify courses  
		 */
		if( !vc.canEditSubjects()){
			System.out.println("User cannot edit this Course List, consult Academic Program Officer");
			return;			
		}
		
		/*
		 * vice chairman access the course list & added instructors to those subjects
		 */
		vc.setSubjectOfferings(fls.accessCourseList());
		vc.setSubjectInstructor(subj1, new Faculty("150","Linus Torvalds", "Professor II"));
		vc.setSubjectInstructor(subj2, new Faculty("151","Steve Jobs", "Professor I"));
		
		
		/*
		 * vice chairman uploads the updated list 
		 */
		if( !fls.uploadCourseList(vc.getSubjects()) ){
			System.out.println("Cannot upload to server");
			return;
		}
		
		/*
		 * APO will indicate the rooms where every classes will be held.
		 */

		Room mtc1 = new Room("MTC1", 25, RoomType.LABORATORY);
		Room cl5 = new Room("CL5", 25, RoomType.LECTURE);
		
		SubjectOfferings offerings = apo.getCourseList();
		Subject _subj1 = offerings.getSubjects().get(0);
		Subject _subj2 = offerings.getSubjects().get(1);
		
		if( !mtc1.addSubject(_subj1) ){
			System.out.println("Cannot add this subject, there is a schedule conflict");
			return;
		}
		if( !cl5.addSubject(_subj2) ){
			System.out.println("Cannot add this subject, there is a schedule conflict");
			return;
		}		
		
		
		
					
		

	}

}
