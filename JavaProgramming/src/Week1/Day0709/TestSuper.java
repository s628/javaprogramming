package Week1.Day0709;


class Employee{
	/* Employee() {
	 * System.out.println("���� �θ� constructor");
	 */
	Employee(int a){
		System.out.println("���� �θ� constructor");
	}
}

	
	class Manager extends Employee{
		Manager(){
			super(1);
			//super();
			System.out.println("���� �ڽ�  constructor");
		}
	}
	public class TestSuper {
		
	public static void main(String[] args) {
		Manager m = new Manager();

	}

}
