package Week1.Day0710;


class A6{
	public void aaa() {
		System.out.println("aaa");
	}
	public void bbb() {
		System.out.println("bbb");
	}
}
	class B6 extends A6 {
		public void bbb() {
			System.out.println("bbb1");
		}



public void ccc() {
	System.out.println("ccc");
}
}
public class PolymorTest {
	

	public static void main(String[] args) {
		A6 ap = new B6(); //다형적 표현
		ap.aaa(); //A6 클래스의 aaa()메서드 호출> aaa출력
		ap.bbb(); //B6 클래스의 bbb() 메서드 호출? bbb1 출력
		//ap.ccc(); 접근 가능한 멤버는 Data Type에 의해 결정 Compile Error 발생

	}

}
