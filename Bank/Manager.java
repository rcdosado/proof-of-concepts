package userx;


import userx.Employee;

public class Manager extends Employee {
	
	private int handledEmployees;
	
	public float getSalary()
	{
		return this.getNumberOfYearsWorked()*this.getHandledEmployees()*300;
	}

	/**
	 * @return the handledEmployees
	 */
	public int getHandledEmployees() {
		return handledEmployees;
	}

	/**
	 * @param handledEmployees the handledEmployees to set
	 */
	public void setHandledEmployees(int handledEmployees) {
		this.handledEmployees = handledEmployees;
	}
	
	

}
