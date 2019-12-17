package Week1.Exception;

public class Exception1 {

	public static void main(String[] args) {

System.out.println(1);
System.out.println(2);

try {
	 System.out.println(3);
	 System.out.println(0/0);
     System.out.println(4);	 
} catch (ArithmeticException ae) {    //catch는 보통 하나만 하지 않는다.
	if(ae instanceof ArithmeticException)  //ArithmeticException ae가 인스턴스냐 true면 true출력
		System.out.println(true);
	System.out.println("ArithmeticException");
} catch (Exception e) {                    //가장 큰 Exception
	System.out.println("Exception");
}//try -catch의 끝
	System.out.println(6);
	}//main메서드의 끝
	

}
