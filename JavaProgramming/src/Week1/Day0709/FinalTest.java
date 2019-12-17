package Week1.Day0709;

final class Human {
	public void pro() {
		System.out.println("pro");
	}
}


/*
 * class Student extesnds Human{
 * public void info(){
 * System.out.println("info");
 * }
 */
class Student{
	public void info() {
		System.out.println("info");
	}
}

public class FinalTest {

	public static void main(String[] args) {
//		Human h = new Human();
//		h.pro();
		Student s = new Student();
		s.info();
		//s.info();

	}

}
