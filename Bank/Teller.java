package userx;

import userx.Employee;


public class Teller extends Employee {

	public Teller()
	{
		super();
	}
	
	public float getSalary()
	{
		return this.getNumberOfYearsWorked()*500;
		
	}

}
