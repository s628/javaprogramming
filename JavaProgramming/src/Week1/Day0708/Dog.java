package Week1.Day0708;

import Week1.Day0708.Dog;

public class Dog {
	String name;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		Dog[] myDogs = new Dog[3];
		
		myDogs[0] = new Dog();  //dog �������� 3��
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.println("������ ���� �̸�:");
		System.out.println(myDogs[2].name);
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}

	}
	
	public void bark() {
		this.name = "";
		System.out.println( "�� ��! �ϰ� ¢���ϴ�.");
		
	}
	public void eat() {}
	public void chaseCat() {}

}
