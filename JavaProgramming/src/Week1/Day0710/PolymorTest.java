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
		A6 ap = new B6(); //������ ǥ��
		ap.aaa(); //A6 Ŭ������ aaa()�޼��� ȣ��> aaa���
		ap.bbb(); //B6 Ŭ������ bbb() �޼��� ȣ��? bbb1 ���
		//ap.ccc(); ���� ������ ����� Data Type�� ���� ���� Compile Error �߻�

	}

}
