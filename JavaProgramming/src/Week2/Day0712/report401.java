package Week2.Day0712;

class Mother {
	String name, job;
	int age;
	private Child[] childs;
	
	
	public Mother(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Mother(String name, int age, String job, Child[] childs) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.childs = childs;
		
	}
	
	void goToSchool() {
		System.out.println("���̵�� �б�����.");
		for(int i=0; i<childs.length; i++) {
			
		    System.out.println(childs[i].name+"�б��� ���ϴ�.");
		    }
	}
	void callChild(String name, Child[] childs) {
		
		for(int i=0; i<childs.length; i++) {
			
	    System.out.println(childs[i].name+"�� ���� ���ϴ�.");
		}
	}
	
	void setChild(Child[] c) {  //get�ڿ��� �������ϴ� ������ �ִ´�.
		this.childs = c;
	}
}

class Child {
	String name, hobby;
	int age;
	
	
	public Child(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
		
	public Child(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		
	}
	
	void goToSchool() {
		System.out.println("�б�����");
	}
	void fight(Child c) {
		System.out.println(c.name + "�� �ο����ϴ�.");
	}
	
}


public class report401 {

	public static void main(String[] args) {
		
		
		Child[] c1 = new Child[3];
		c1[0] = new Child("ȫ�浿1", 14);
		c1[1] = new Child("ȫ�浿2", 14);
		c1[2] = new Child("ȫ�浿3", 14);
		
		Child c2 = new Child("ȫ�浿", 11, "�౸");
		c2.fight(c2);
		
		Mother m = new Mother("ȫ����", 50, "���α׷���", c1);
		m.goToSchool();
		m.setChild(c1);
		m.callChild("ȫ����", c1);
		
		

		
// �ǽ�1: Mother�� ���� Ŭ���� 
//- �Ӽ�:(String)name, (int)age, (String)job, private(Child[])childs
//- ������
//  Mother(String name, int age)
//  Mother(String name, int age, String job, Child[] childs) 
//- �޼ҵ�: 
//  void goToSchool(): �����̵�� �б����١� ���
//  void callChild(): ���̵� ����ŭ ��� =>�������̸��������� ���ϴ�
//  void setChild(Child[] c): ���̸� ���� 
//  Mother�� goToSchool, setChild�� callChild �� ȣ���� ����
//

// Child�� ���� Ŭ���� 
//- �Ӽ�:(String)name, (int)age, String hobby
//- ������
//  Child(String name, int age)
//  Child(String name, int age, String hobby) 
//- �޼ҵ�: 
//  void goToSchool(): ���б����١� ���
//  void fight(Child c): �������̸����� �ο����ϴ� ���
//
//---------------------------------------------------------
//
		
		









	}

}
