package Week1.Exception;

public class Exception4 {

	public static void main(String[] args) {
	//method1()�� static�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ��
		Exception4.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ����.");
	} //main �޼����� ��
static void method1() {
	try {
		System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
		return;  //���� ���� ���� �޼��带 �����Ѵ�.
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
	}
} //method1 �޼����� ��
}
