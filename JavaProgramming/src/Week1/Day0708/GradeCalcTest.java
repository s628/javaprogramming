package Week1.Day0708;

import java.util.Scanner;

public class GradeCalcTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, math, tot;
		float avg;
		
		System.out.println("����: ");
		kor = Integer.parseInt(scanner.nextLine());
		
		System.out.println("����: ");
		eng = Integer.parseInt(scanner.nextLine());
		
		System.out.println("����: ");
		math = Integer.parseInt(scanner.nextLine());
		
	
				
		tot = kor+eng+math;
		avg = tot/3.0f;
		
		System.out.printf(" ����: %d �� %n" , tot);
		System.out.printf(" ���: %.2f�� %n " , avg);

	}

}
