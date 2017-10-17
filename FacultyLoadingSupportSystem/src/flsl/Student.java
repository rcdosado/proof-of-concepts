package flsl;

public class Student extends Person{
	
	public Student(String name, String studentNumber) {
		super(name);
		this.studentNumber = studentNumber;
	}

	String studentNumber;

	/**
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	

}
