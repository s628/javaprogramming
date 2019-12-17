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
		System.out.println("아이들과 학교가다.");
		for(int i=0; i<childs.length; i++) {
			
		    System.out.println(childs[i].name+"학교를 갑니다.");
		    }
	}
	void callChild(String name, Child[] childs) {
		
		for(int i=0; i<childs.length; i++) {
			
	    System.out.println(childs[i].name+"이 지금 갑니다.");
		}
	}
	
	void setChild(Child[] c) {  //get뒤에는 얻어가고자하는 내용을 넣는다.
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
		System.out.println("학교가다");
	}
	void fight(Child c) {
		System.out.println(c.name + "와 싸웠습니다.");
	}
	
}


public class report401 {

	public static void main(String[] args) {
		
		
		Child[] c1 = new Child[3];
		c1[0] = new Child("홍길동1", 14);
		c1[1] = new Child("홍길동2", 14);
		c1[2] = new Child("홍길동3", 14);
		
		Child c2 = new Child("홍길동", 11, "축구");
		c2.fight(c2);
		
		Mother m = new Mother("홍영희", 50, "프로그래머", c1);
		m.goToSchool();
		m.setChild(c1);
		m.callChild("홍영희", c1);
		
		

		
// 실습1: Mother에 대한 클래스 
//- 속성:(String)name, (int)age, (String)job, private(Child[])childs
//- 생성자
//  Mother(String name, int age)
//  Mother(String name, int age, String job, Child[] childs) 
//- 메소드: 
//  void goToSchool(): ‘아이들과 학교가다’ 출력
//  void callChild(): 아이들 수만큼 출력 =>‘아이이름’이지금 갑니다
//  void setChild(Child[] c): 아이를 설정 
//  Mother의 goToSchool, setChild후 callChild 를 호출해 보기
//

// Child에 대한 클래스 
//- 속성:(String)name, (int)age, String hobby
//- 생성자
//  Child(String name, int age)
//  Child(String name, int age, String hobby) 
//- 메소드: 
//  void goToSchool(): ‘학교가다’ 출력
//  void fight(Child c): ‘아이이름’과 싸웠습니다 출력
//
//---------------------------------------------------------
//
		
		









	}

}
