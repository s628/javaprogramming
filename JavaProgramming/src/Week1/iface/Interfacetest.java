package Week1.iface;


interface interA1{
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}
public class Interfacetest {

	public static void main(String[] args) {
	//interA1 ap = new interA1();
		//interA1.w = 100; //interface의 필드는 public static final이므로 값을 변경할 수 없다.
		
		System.out.println("w = " +   interA1.w);
		System.out.println("x = " +   interA1.x);
		System.out.println("y = " +   interA1.y);
		System.out.println("z = " +   interA1.z);
	}
}