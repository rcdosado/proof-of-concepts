package flsl;

public class Faculty extends Employee{
	String rank;
	
	
	
	public Faculty(String name, String id, String rank){
		super(name,id);
		this.rank = rank;
	}	
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}


	
}
