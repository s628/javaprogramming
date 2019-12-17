package Week2.Day0717;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Army {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
		
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStrDt() {
		return strDt;
	}

	public void setStrDt(String strDt) {
		this.strDt = strDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	public Date getNextHoliday() {
		return nextHoliday;
	}

	public void setNextHoliday(Date nextHoliday) {
		this.nextHoliday = nextHoliday;
	}

	public Army[] getSub() {
		return sub;
	}

	public void setSub(Army[] sub) {
		this.sub = sub;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	private String name;
	private int age;
	private String grade;
	private String strDt;
	private String endDt;
	private Date nextHoliday;
	private Army[] sub;
	private int count;

	Army(String name, int age, String grade, String strDt, String endDt) {

		this.name = name;
		this.age = age;
		this.grade = grade;
		this.strDt = strDt;
		this.endDt = endDt;
	}

	public int getOverTimePayByGrade() {
		if (grade.equals("�Ϻ�"))
			return 100000;
   else if (grade.equals("��"))
			return 200000;
   else if (grade.equals("����"))
			return 300000;
		else
			return 0;
		
	}

	public void printSubOverTimePay(Army[] sub) {

		DecimalFormat df = new DecimalFormat("#,###");
		for (int i = 0; i < sub.length; i++) {
			String msg = "{0} {1} �� �߱� ������ {2} �� �Դϴ�.";
			Object[] arguments = {sub[i].grade, sub[i].name, df.format(sub[i].getOverTimePayByGrade())};
			
			String result = MessageFormat.format(msg, arguments);
			System.out.println(result);
		}
	}

	public int getThisMMPeriod() {
		Calendar today = Calendar.getInstance();
		int Period = 0;

		System.out.println("�� ���� �ϼ� : " + today.get(Calendar.DAY_OF_MONTH) + "��");
		Period = today.getActualMaximum(Calendar.DATE) - today.get(Calendar.DAY_OF_MONTH);
		return Period;
	}

//    	Calendar baseCal = new GregorianCalendar(2019, Calendar.JULY, 17);
//    	Calendar targetCal = new GregorianCalendar(2019, Calendar.JULY, 31);
//    	long diffSec = (targetCal.getTimeInMillis() - baseCal.getTimeInMillis())/1000;
//		long diffDays = diffSec/(24*60*60);
//		System.out.println("�̹����� ���� �ٹ��Ⱓ =" + diffDays);
//    	
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		System.out.println("----------------------------------------");
//		System.out.println("���� ��¥ = "+sdf.format(baseCal.getTime()));
//		System.out.println("�� ��� ��¥ = "+sdf.format(targetCal.getTime()));
//		System.out.println("----------------------------------------");
//		baseCal.add(Calendar.DAY_OF_MONTH, (int)diffDays);
//		System.out.println("���س�¥�� "+diffDays+" �� ��ŭ ���� ��¥ = "+sdf.format(baseCal.getTime()));
//		targetCal.add(Calendar.DAY_OF_MONTH, -(int)diffDays);
//		System.out.println("�� ��� ��¥�� "+diffDays+" �� ��ŭ �� ��¥ = "+sdf.format(targetCal.getTime()));

//    public int getSubTotalPeriod() {
//    	int Period= 0 ;   	
//		return Period;
//    	
//    }
//    public boolean checkSub(Army[]sub) {
//		return false;

	public void returnSub(Army[] sub) {
		System.out.println(this.getName() + "�� �д�� ��� ���");
		for (int i = 0; i < this.count; i++) {
			System.out.println(this.sub[i].getName() + "\t" + this.sub[i].getGrade());
		}
	}

	public void printSub() {
		for (int i = 0; i < this.count; i++) {
			if ((this.sub[i] instanceof SpecialArmy) == true) {
				System.out.printf(" \t ", "���", this.sub[i].getGrade(), this.sub[i].getName(), this.sub[i].getStrDt(),
						this.sub[i].getEndDt());

			} else if ((sub[i] instanceof Army) == true) {
				System.out.printf(" \t ", this.sub[i].getGrade(), this.sub[i].getName(), this.sub[i].getStrDt(),
						this.sub[i].getEndDt());
			}

//			for(int i=0; i<sub.length; i++) {
//				SimpleDateFormat origianl_format = new SimpleDateFormat("yyyymmdd");
//				SimpleDateFormat new_format = new SimpleDateFormat("yyyy-mm-dd");
//				
//				java.util.Date Start_origianl_date = origianl_format.parse(sub[i].strDt);
//				String Start_new_date = new_format.format(Start_origianl_date);
//				
//				java.util.Date End_origianl_date = origianl_format.parse(sub[i].endDt);
//				String End_new_date = new_format.format(End_origianl_date);
//				if(sub[i]!=null && sub[i] instanceof SpecialArmy)
//					System.out.println("������� " + sub[i].grade + " " + sub[i].name + " " + Start_new_date + "~" + End_new_date);
//				else
//					System.out.println(sub[i].grade + " " + sub[i].name + " " + Start_new_date + "~" + End_new_date);
//			}
		}
	}

	class SpecialArmy extends Army {

		private int bonus;

		SpecialArmy(String name, int age, String grade, String strDt, String endDt, int bonus) {
			super(name, age, grade, strDt, endDt);
			this.bonus = bonus;
		}

		public int getBonus() {
			return bonus;
		}

		public void setBonus(int bonus) {
			this.bonus = bonus;
		}


		}
	}


public class report0717 {

	public static void main(String[] args) {
		
		Army army = new Army("ȫ���", 20, "����","2018-07-17","2019-07-17");
		

	      
		Army[] a = new Army[3];
		   a[0] = new Army("ȫ�浿", 21, "�Ϻ�","2019-01-01","2020-12-31");
		   a[1] = new Army("ȫ�渮", 21, "��","2019-02-01","2020-11-31");
		   a[2] = new Army("ȫ���", 21, "����","2019-03-01","2020-10-31");
		 
		 
		   
		 System.out.println("�߰� �ٹ� ���� : " + army.getOverTimePayByGrade());
		 System.out.println("���� �ٹ� �Ⱓ : " + army.getThisMMPeriod() + "��");

	
		 army.returnSub(a);
		 army.getOverTimePayByGrade();
		 army.printSubOverTimePay(a);
//		 army.getThisMMPeriod();
		 army.printSub();
	
		 
	
	
	
		 
	}

}
