package userx;


import userx.Company;
import userx.Teller;
import userx.Manager;

/*
 * 
 * Design and implement the system described below:
 * Banks have different kinds of employees. These are the teller, and manager. The name of the employee
 * , his/her employee ID and his/her numberOfYearsWorked are stored in the system for both employees.
 * Since the manager handles many employees, handledEmployees is also stored in the system for managers
 * 
 * The salary of the teller is solved as numberOfYearsWorked * 500 while the salary of the manager
 * is computer as numberOfYearsWorked*handledEmployees*300.
 * 
 * Both should have a getSalary() method which returns the salary of the employee. (float value).
 * 
 * Create a class that will represent the Company, which contains a list of employees (composed of 
 * managers and tellers). Create the method addEmployee() to add an employee (may either be a manager
 * or Teller) and showEmployees() which will display on screen all the name, employeeID and salary
 * of all employees added.
 * 
 */
public class ProjectOOP {
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Company c = new Company();
		Teller ta = new Teller();
		ta.setName("Maria");
		ta.setEmployeeID(100);
		ta.setNumberOfYearsWorked(5);
		
		Teller tb = new Teller();
		tb.setName("Imelda");
		tb.setEmployeeID(101);
		tb.setNumberOfYearsWorked(10);
		
		Teller tc = new Teller();
		tc.setName("Harley");
		tc.setEmployeeID(102);
		tc.setNumberOfYearsWorked(15);
		
		Manager ma = new Manager();
		ma.setName("Ricky");
		ma.setEmployeeID(10);
		ma.setNumberOfYearsWorked(20);
		ma.setHandledEmployees(3);			
		
		c.addEmployee(ta);
		c.addEmployee(tb);
		c.addEmployee(tc);		
		c.addEmployee(ma);
		
		c.showEmployees();
	}
	
}
