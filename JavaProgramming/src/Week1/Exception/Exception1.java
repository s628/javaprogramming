package Week1.Exception;

public class Exception1 {

	public static void main(String[] args) {

System.out.println(1);
System.out.println(2);

try {
	 System.out.println(3);
	 System.out.println(0/0);
     System.out.println(4);	 
} catch (ArithmeticException ae) {    //catch�� ���� �ϳ��� ���� �ʴ´�.
	if(ae instanceof ArithmeticException)  //ArithmeticException ae�� �ν��Ͻ��� true�� true���
		System.out.println(true);
	System.out.println("ArithmeticException");
} catch (Exception e) {                    //���� ū Exception
	System.out.println("Exception");
}//try -catch�� ��
	System.out.println(6);
	}//main�޼����� ��
	

}
