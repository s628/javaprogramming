package Week1.Day0711;




class Father {
	
	int age;
	String job;
	String name;
	
	public Father(String job, int age, String name) {
		
		this.job = job;  //생성자에서 초기화, 리턴값 x, 클래스명과 동일
		this.age = age;
		this.name = name;
	}

	  void goToWork(int time) {
		  System.out.println(job + " 일을 하는 " + age + "세 " +name + "이 " +   + time + "시 출근하다");
	  }

	  void goOffWork(int time) {
		  System.out.println(job + " 일을 하는 " + age + "세 " +name + "이 " +   + time + "시 퇴근하다");
	  }
}

public class report301 {

	public static void main(String[] args) {

		
//		실습1: Father에 대한 클래스 
//		- 속성:(String)name, (int)age, (String)job
//		- 메소드: 
//		  void goToWork(inttime): ‘출근하다’ 출력
//		  void goOffWork(inttime): ‘퇴근하다’ 출력
//
//		위 클래스를 사용하여 출근하다, 퇴근하다를
//		출력해 보기
//

	
	Father f = new Father("프로그래머", 40 , "홍길동");
	f.goToWork(10);
	f.goOffWork(18);
	
	}
}
