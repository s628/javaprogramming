package Week1.Day0711;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {    
		
 char gender;
 String regNo = "";
 System.out.println("����� �ֹι�ȣ�� �Է��ϼ���(011231-11112222)");
 
  Scanner scanner = new Scanner(System.in);
  regNo = scanner.nextLine();
  
  gender = regNo.charAt(7);
  
  switch(gender){
	  case '1':
	  case '3':
		  switch(gender) {
		  case'1':
			  System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			  break;
		  case '3':
			  System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
		  }
		       break;  //�� break ���� ������ �ʵ��� ����
		  
	  case '2':
	  case '4':
		  
		  switch(gender) {
		  case '2':
			  System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
			  break;
		  case '4':
			  System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
		 
		       break; 
		  }
	  break;
	  
	}
	  System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
  
}

}



