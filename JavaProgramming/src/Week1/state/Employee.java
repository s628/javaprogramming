package Week1.state;

public class Employee {

	public static final int  ENGINEER = 1;
	public static final int  MANAGER = 2;
	public static final int  SALESMAN = 3;
	
	
	private int type;
	public void setType(int type) {
		this.type = type;
		
	}
	
	public Employee(int type) {
		setType(type);
	}
	public int getAmount() {
		switch(type) {
		case ENGINEER:
			return 100;
		case MANAGER:
			return 100;
		case SALESMAN:
			return 100;
		}
		return 0 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
