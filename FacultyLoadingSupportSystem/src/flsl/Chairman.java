package flsl;

public class Chairman extends Employee {

	public Chairman(String name, String id){
		super(name,id);
	}

	@Override
	public boolean canEditSubjects() {
		// TODO Auto-generated method stub
		return true;
	}
}
