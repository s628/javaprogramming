package Math;

public class Math1 {

	public static void main(String[] args) {
		
		// 1. static double abs(double a) float, int, long ���밪 ��ȯ

		int l = Math.abs(-10);
		double d1 = Math.abs(-10.0);
		System.out.println(l);
		System.out.println(d1);
		
		//2. static doubli ceil(double a) �־��� ���� �ø��Ͽ� ��ȯ�Ѵ�

		double d2 = Math.ceil(10.1);
		double d3 = Math.ceil(-10.1);
		double d4 = Math.ceil(10.000015);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		//3. static double floor(double a) �־��� ���� �����Ͽ� ��ȯ�Ѵ�

		double d5 = Math.floor(10.8);
		double d6 = Math.floor(-10.8);
		System.out.println(d5);
		System.out.println(d6);
		
		
	    //4. static double max(double a, double b) float, int, long �־��� �� ���� ���Ͽ� ū ���� ��ȯ
		double d7 = Math.max(9.5, 9.50001); 
		int i1 = Math.max(0, -1);
		System.out.println(d7);
		System.out.println(i1);
		
		
		//5. static double min(double a, double b) float, int, long �־��� �� ���� ���Ͽ� ������ ��ȯ
		double d8 = Math.min(9.5, 9.50001); 
		int i2 = Math.min(0, -1);
		System.out.println(d8);
		System.out.println(i2);
		
		//6. static double random() 0.0 ~ 1.0������ ������ double ��ȯ
		double d9= Math.random();
		int i3 = (int)(Math.random()*10)+1;
		System.out.println(d9);
		System.out.println(i3);
		
		//7. static double rint(double a) �־��� double ���� ���� ����� �������� double������ ��ȯ�Ѵ�.
		double d10 = Math.rint(5.5);
		double d11 = Math.rint(5.1);
		double d12 = Math.rint(-5.5);
		double d13 = Math.rint(-5.1);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		
		
		//8. static long round(double a) static long round(float a) �Ҽ��� ù°�ڸ����� �ݿø��� long���� ��ȯ
		long i4 = Math.round(5.5);
		long i5 = Math.round(5.11);
		long i6 = Math.round(-5.5);
		long i7 = Math.round(-5.1);
		double d14 = 90.7552;
		double d15 = Math.round(d14*100)/100.0;
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(d14);
		System.out.println(d15);
		


	}

}
