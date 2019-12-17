package Math;

public class Math1 {

	public static void main(String[] args) {
		
		// 1. static double abs(double a) float, int, long 절대값 반환

		int l = Math.abs(-10);
		double d1 = Math.abs(-10.0);
		System.out.println(l);
		System.out.println(d1);
		
		//2. static doubli ceil(double a) 주어진 값을 올림하여 반환한다

		double d2 = Math.ceil(10.1);
		double d3 = Math.ceil(-10.1);
		double d4 = Math.ceil(10.000015);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		//3. static double floor(double a) 주어진 값을 버림하여 반환한다

		double d5 = Math.floor(10.8);
		double d6 = Math.floor(-10.8);
		System.out.println(d5);
		System.out.println(d6);
		
		
	    //4. static double max(double a, double b) float, int, long 주어진 두 값을 비교하여 큰 쪽을 반환
		double d7 = Math.max(9.5, 9.50001); 
		int i1 = Math.max(0, -1);
		System.out.println(d7);
		System.out.println(i1);
		
		
		//5. static double min(double a, double b) float, int, long 주어진 두 값을 비교하여 작은쪽 반환
		double d8 = Math.min(9.5, 9.50001); 
		int i2 = Math.min(0, -1);
		System.out.println(d8);
		System.out.println(i2);
		
		//6. static double random() 0.0 ~ 1.0범위의 임의의 double 반환
		double d9= Math.random();
		int i3 = (int)(Math.random()*10)+1;
		System.out.println(d9);
		System.out.println(i3);
		
		//7. static double rint(double a) 주어진 double 값과 가장 가까운 정수값을 double형으로 반환한다.
		double d10 = Math.rint(5.5);
		double d11 = Math.rint(5.1);
		double d12 = Math.rint(-5.5);
		double d13 = Math.rint(-5.1);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		
		
		//8. static long round(double a) static long round(float a) 소수점 첫째자리에서 반올림한 long값을 반환
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
