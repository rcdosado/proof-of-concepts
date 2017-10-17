Bank Example
===========

Design and implement the system described below:
Banks have different kinds of employees. These are the teller, and manager. The name of the employee, his/her employee ID and his/her numberOfYearsWorked are stored in the system for both employees.
Since the manager handles many employees, handledEmployees is also stored in the system for managers. The salary of the teller is solved as numberOfYearsWorked * 500 while the salary of the manager
is computer as numberOfYearsWorked * handledEmployees * 300. Both should have a getSalary() method which returns the salary of the employee. (float value).
 
Create a class that will represent the Company, which contains a list of employees (composed of managers and tellers). 
Create the method addEmployee() to add an employee (may either be a manager
or Teller) and showEmployees() which will display on screen all the name, employeeID and salary of all employees added.