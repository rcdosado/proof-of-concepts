package flsl;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FacultyLoadingSystem fls = new FacultyLoadingSystem();
		AcademicProgramOfficer apo = new AcademicProgramOfficer("Raymond Wong", "1000");
		Course regcourse = new Course("100", "BSCS", "Networking");
		
		
		
		TeachingLoad teachload1 = new TeachingLoad();
		AdministrativeLoad adminload1 = new AdministrativeLoad();
		
		apo.addLoad(teachload1);
		apo.addLoad(adminload1);
									

	}

}
