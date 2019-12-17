package Week1.Day0710;

interface AnimalType {
	public String bark();

}

class Dog implements AnimalType {

	
	@Override
	public String bark() {

		return "�۸�";
	}

}

class Cat implements AnimalType {

	@Override
	public String bark() {

		return "�߿�";
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
		// �ǽ�3 : ���� ¢��
//		- Animal class �� �����Ѵ�
//		- �����ڷ� AnimalType�� �Ķ���ͷ� �޴´�
//		- bark() �޼��带 ���� ������ ¢�� �Ҹ��� ����Ѵ� : Dog�� �۸�, Cat�� �߿�
//		- ���� Dog�� Cat�� Ŭ������ �����ϴµ� ���� �߰��� �� �ִ�
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		report201 pr = new report201();
		
		pr.setType(cat);
		pr.bark();
		
		
	}

}
