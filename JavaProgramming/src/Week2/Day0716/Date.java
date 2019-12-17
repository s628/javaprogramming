package Week2.Day0716;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {                //month 는  0부터 시작 

	public static void main(String[] args) {
//		 String → java.sql.Date 변환
		 String day1 = "2016-11-22";  // 형식을 지켜야 함 
		 System.out.println(day1);
		 
		 java.sql.Date d = java.sql.Date.valueOf(day1);
//		 String → java.sql.Timestamp 변환
		 String day2 = "2016-11-22 11:22:30.0"; 	 // 형식을 지켜야 함
		 System.out.println(day2);
		 java.sql.Timestamp t = java.sql.Timestamp.valueOf(day2);
		 
//		 String → java.util.Date 변환
		 String day3 = "20161122"; // SimpleDateFormat 생성자에 전달되는 형식과 일치해야 함 java.util.Date d = new java.text.SimpleDateFormat("yyyyMMdd").parse(day);
		 System.out.println(day3);
//		 java.util.Date → java.sql.Date 변환
		 java.util.Date u = new java.util.Date(); 
		 java.sql.Date s = new java.sql.Date(u.getTime());
		 
	}
		 
		// 날짜가 yyyymmdd 형식으로 입력되었을 경우 Date로 변경하는 메서드
		 public Date transformDate(String date) 
		 {
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
		
		// Date로 변경하기 위해서는 날짜 형식을 yyyy-mm-dd로 변경해야 한다. 
		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");
		
		java.util.Date tempDate = null;
		
		try { // 현재 yyyymmdd로된 날짜 형식으로 java.util.Date객체를 만든다. 
		tempDate = beforeFormat.parse(date); 
		} 
		catch (ParseException e) {
		e.printStackTrace(); 
		}
		// java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String로 반환한다. 
		String transDate = afterFormat.format(tempDate);
		// 반환된 String 값을 Date로 변경한다. 
		Date d = Date.valueOf(transDate);
		return d;
		}
		private static Date valueOf(String transDate) {
			// TODO Auto-generated method stub
			return null;
		}

	}


