package Week1.Day0709;

public class ConstructorTest {

	private static Object x;
	int a, b, c, d, e, f, g;         
	ConstructorTest() {                 //������1
		a = 1; b = 2; c = 3;
		d = 4; e = 5; f = 6; g = 7;
		
	}
	
	ConstructorTest(int x){            //������2
		this();
		d = x;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}
	ConstructorTest(int x, int y){     //������3
		this(x);
		e = y;
	}
	
	public static void main(String[] args) {
		ConstructorTest rEx = new ConstructorTest();
	  

	}

}
