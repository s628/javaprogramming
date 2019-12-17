package Week2.Day0716;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {

	public static void main(String[] args) {
		
//	DecimalFormat: 숫자 형식화
		DecimalFormat df2 = new DecimalFormat("#,###.##"); 
		System.out.println(df2.format(123456789.98));
		DecimalFormat df3 = new DecimalFormat("#,###"); 
		System.out.println(df3.format(123456789));
		
		
//		 SimpleDateFormat: 날짜 형식화
		Date today = new Date(); 
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); 
		System.out.println(sdf4.format(today));

	
		
//		ChoiceFormat: 특정범위를 문자열로 변환 // #은 경계값 포함(작거나 같다), # 은 경계값 미포함 
		String pattern = "60#D|70#C|80<B|90#A"; 
		// 90은 A, 80은 C 
		int[] scores = { 91, 90, 80, 88, 70, 52, 60};
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i=0;i<scores.length;i++) { 
		System.out.println(scores[i]+":"+form.format(scores[i])); 

	}
	}
}
