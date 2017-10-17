package flsl;

import java.util.ArrayList;

/*
 * loads are employee's way of putting different load for an employee
 */
public class Employee extends Person{
	String id;	
	ArrayList<Load> loads;
	
	/**
	 * @return the loads
	 */
	public ArrayList<Load> getLoads() {
		return loads;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	public Employee(String name, String id){
		super(name);
		this.id = id;
		
	}
	
	public void addLoad(Load load){
		this.loads.add(load);
	}

}
