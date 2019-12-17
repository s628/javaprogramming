package Week1.Day0709;

public class OperatorEx3 {

	public static void main(String[] args) {
		int x = 15;
		System.out.println(10 > x && x++ <20);
		System.out.println("x" + x);
		System.out.println(10 < x || x++ < 20);
		System.out.println("x=" + x);
		
		System.out.println();
		
		
		System.out.println(10 > x & x++ < 20);
		System.out.println("x=" + x);
		System.out.println(10<x | x++ < 20);
		System.out.println("x= " + x);
		
		int y, z;
		int absX, absY, absz;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >=0 ? x: -x;
		absY = y >=0 ? y: -y;
		absz = z >=0 ? z: -z;
		

	}

}
