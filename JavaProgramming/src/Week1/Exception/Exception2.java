package Week1.Exception;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���� �޽���:" + ae.getMessage());
		}//try=catch �� ��
		System.out.println(6);
		
	}  //main�޼����� ��
	

}
