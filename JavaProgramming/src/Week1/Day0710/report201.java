package Week1.Day0710;

interface AnimalType {
	public String bark();

}

class Dog implements AnimalType {

	
	@Override
	public String bark() {

		return "멍멍";
	}

}

class Cat implements AnimalType {

	@Override
	public String bark() {

		return "야옹";
	}

}
public class report201 {
	private AnimalType type;
	
	public void setType(AnimalType type) {
		this.type = type;
	}
	public void bark() {
		System.out.println(type.bark());

	}
	
	public static void main(String[] args) {
		// 실습3 : 동물 짖기
//		- Animal class 를 설계한다
//		- 생성자로 AnimalType을 파라미터로 받는다
//		- bark() 메서드를 통해 동물의 짖는 소리를 출력한다 : Dog는 멍멍, Cat은 야옹
//		- 현재 Dog와 Cat의 클래스만 존재하는데 향후 추가될 수 있다
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		report201 pr = new report201();
		
		pr.setType(cat);
		pr.bark();
		
		
	}

}
