package Week1.Day0709;

public class OperatorEx2 {

	public static void main(String[] args) {
	String str1 = "abc";
	String str2 = new String("abc");
	
	System.out.println("abc"=="abc");
	System.out.println(str1 == "abc");
	System.out.println(str2 == "abc");
	System.out.println(str1.equals("abc"));
	System.out.println(str2.endsWith("abc"));
    System.out.println(str2.endsWith("ABC"));
    System.out.println(str2.equalsIgnoreCase("ABC"));
	}

}
