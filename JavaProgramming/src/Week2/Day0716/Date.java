package Week2.Day0716;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {                //month ��  0���� ���� 

	public static void main(String[] args) {
//		 String �� java.sql.Date ��ȯ
		 String day1 = "2016-11-22";  // ������ ���Ѿ� �� 
		 System.out.println(day1);
		 
		 java.sql.Date d = java.sql.Date.valueOf(day1);
//		 String �� java.sql.Timestamp ��ȯ
		 String day2 = "2016-11-22 11:22:30.0"; 	 // ������ ���Ѿ� ��
		 System.out.println(day2);
		 java.sql.Timestamp t = java.sql.Timestamp.valueOf(day2);
		 
//		 String �� java.util.Date ��ȯ
		 String day3 = "20161122"; // SimpleDateFormat �����ڿ� ���޵Ǵ� ���İ� ��ġ�ؾ� �� java.util.Date d = new java.text.SimpleDateFormat("yyyyMMdd").parse(day);
		 System.out.println(day3);
//		 java.util.Date �� java.sql.Date ��ȯ
		 java.util.Date u = new java.util.Date(); 
		 java.sql.Date s = new java.sql.Date(u.getTime());
		 
	}
		 
		// ��¥�� yyyymmdd �������� �ԷµǾ��� ��� Date�� �����ϴ� �޼���
		 public Date transformDate(String date) 
		 {
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
		
		// Date�� �����ϱ� ���ؼ��� ��¥ ������ yyyy-mm-dd�� �����ؾ� �Ѵ�. 
		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");
		
		java.util.Date tempDate = null;
		
		try { // ���� yyyymmdd�ε� ��¥ �������� java.util.Date��ü�� �����. 
		tempDate = beforeFormat.parse(date); 
		} 
		catch (ParseException e) {
		e.printStackTrace(); 
		}
		// java.util.Date�� yyyy-mm-dd �������� �����Ͽ� String�� ��ȯ�Ѵ�. 
		String transDate = afterFormat.format(tempDate);
		// ��ȯ�� String ���� Date�� �����Ѵ�. 
		Date d = Date.valueOf(transDate);
		return d;
		}
		private static Date valueOf(String transDate) {
			// TODO Auto-generated method stub
			return null;
		}

	}


