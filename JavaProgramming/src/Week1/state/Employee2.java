package Week1.state;


interface EmployeeType{    //�θ�
	public int getAmount();
}
class Engineer implements EmployeeType{
	public int getAmount() {
		return 100;
}
}
class Manager implements EmployeeType{
	public int getAmount() {
		return 200;
}
}
class Salesman implements EmployeeType{
	public int getAmount() {
		return 300;
}
}

public class Employee2 {

	private EmployeeType type;
	
	public Employee2(EmployeeType type) {   //EmployeeType type �Ű����� �ּҰ�
		setType(type);
	}
	
	public void setType(EmployeeType type) {
		this.type = type;
	}
//	public int getAmount() {
//		type.getAmount();
//	}


	
	public static void main(String[] args) {

       

	
	}
	}