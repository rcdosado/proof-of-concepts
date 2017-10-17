package userx;

import userx.Person;

public class Employee extends Person{
	

	private int EmployeeID;
	private int numberOfYearsWorked;
	private float salary;
	
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return EmployeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	/**
	 * @return the numberOfYearsWorked
	 */
	public int getNumberOfYearsWorked() {
		return numberOfYearsWorked;
	}
	/**
	 * @param numberOfYearsWorked the numberOfYearsWorked to set
	 */
	public void setNumberOfYearsWorked(int numberOfYearsWorked) {
		this.numberOfYearsWorked = numberOfYearsWorked;
	}
	
	public float getSalary()
	{
		return this.salary;
	}


}
