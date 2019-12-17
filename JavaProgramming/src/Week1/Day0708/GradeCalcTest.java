package Week1.Day0708;

import java.util.Scanner;

public class GradeCalcTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, math, tot;
		float avg;
		
		System.out.println("국어: ");
		kor = Integer.parseInt(scanner.nextLine());
		
		System.out.println("영어: ");
		eng = Integer.parseInt(scanner.nextLine());
		
		System.out.println("수학: ");
		math = Integer.parseInt(scanner.nextLine());
		
	
				
		tot = kor+eng+math;
		avg = tot/3.0f;
		
		System.out.printf(" 총점: %d 점 %n" , tot);
		System.out.printf(" 평균: %.2f점 %n " , avg);

	}

}
