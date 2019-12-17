package Week1;

import Week1.Race.Animal;
import Week1.Race.Person;

interface Race{
	static void getRace(String race) {
		System.out.println(race);
		
	}
	
class Person{
		
		public String name;
		public int age;
		public String animal;
		
		public void speak() {
		System.out.println("speak KoreaPerson");
		System.out.println("speak JapanPerson");
		}
	}
class KoreaPerson extends Person{
	
	public void speak() {
	}
}
class JapanPerson extends Person{
	public void speak() {
		}
}
	
	class Animal extends Person {
  public void animal() {
	   String name;
	   String type;
}
		
	}
}
public class Example1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
		Animal a = new Animal();
		a.animal();

	}

}
