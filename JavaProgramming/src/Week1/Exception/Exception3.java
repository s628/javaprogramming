package Week1.Exception;

public class Exception3 {

	public static void main(String[] args) {
		try { 
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;  //예외를 발생시킴
			//throw new Exception ("고의로 발생시켰음.");
		}catch (Exception e ) {
			System.out.println("에러 메시지:" + e.getMessage()); //발생한 예외 클래스의 인스턴스에 저장된 메시지를 리턴
			e.printStackTrace();     //예외발생 당시의 call stack에 있었던 메서드의 정보와 예외 메시지를 출력
		}
             System.out.println("프로그램이 정상 종료되었음.");
	}

}
