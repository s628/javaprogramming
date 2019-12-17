package Week1.Day0709;

import java.util.Scanner;

public class report1 {

	
//	 class Person{
//		
//		void draw() {
//			System.out.println("�̸��� ȫ�浿�Դϴ�.");
//			
//		}
//		
//	}
//
//	class Animal extends Person{
//		@Override //:�߻� �޼ҵ� �������̵�
//		void draw() {
//			System.out.println("�۸� ¢���ϴ�.");
//		}
//	}
//	
	
	
	
	
	public static void main(String[] args) {
//		�ǽ�1: �Ϲ�ȭ//��ü���� �繰�� �ٶ󺸰� �����Ѵ�   �߻�ȭ //Annimal ���ظ� ��������  ����   ex)������, ����  
//		�Ϲ�ȭ ��ü: Person, Animal
//		�߻�ȭ ��ü: Person, Animal�� �߻�ȭ ��ü
//		1. Person
//		�Ӽ�: �̸�, ����
//		�޼ҵ�: ���ϴ�(��)
//		2. Animal
//		3. Person �߻�ȭ ����, ����, ���, ����
//		4. Animal �߻�ȭ
		
		
//		Person p = new Person();
//		Animal  a = new Animal ();
//		
//		p.draw();
//		a.draw();
		
		
		
		
		//�ǽ�2: �޿� ����ϱ�
		//�Է�: �⺻��, ��å(���/�븮/����/����)
		//���: �Ǽ��ɾ� = xxx��
		//������ ������ ����.
		//�Ǽ��ɾ� = �⺻�� + ��å���� -����
		//���� = �⺻���� 10%
		//��å ����ǥ
		//- ���� 200,000
		//- ���� 500,000
		
		
		Scanner scan = new Scanner(System.in);
		int money; 
		double sale = 0;
		String level;
		
		System.out.println("�⺻���� �Է��ϼ���.");
		money = scan.nextInt();
		System.out.println("��å�� �Է��ϼ���. (���/�븮/����/����");
		level = scan.next();
		
		
		switch(level) {
		case("1"):
			sale = money - money*0.1;
		break;
		case("2"):
		    sale = money - money*0.1;
		break;
		case("3"):
			sale = money + 200000 - money*0.1;
		break;
		case("�4��"):
			sale = money + 500000 - money*0.1;
		break;
	
		}
		System.out.println("�Ǽ��ɾ� = " + sale);
			
		
		
		
		//�ǽ�3: ��Ģ����
		//-�Է�
		//A��
		//B��
		//������ (+, - *, /)
	    //��� : ��� = xxx
		//*����ó�� �����ڿ� =, -, *, /�̿��� ���� �Է½� �Ʒ� �޽����� ����Ѵ�.
		//"�߸��� �����ڸ� �Է��Ͽ����ϴ�."

		
//		Scanner scan2 = new Scanner(System.in);
//		  int num1=0, num2=0;
//		  int result = 0; 
//		  String operator = null;
//		  
//
//		  System.out.print("ù��° ���� �� :"); 
//		  num1 = scan.nextInt();
//		  
//		  
//		  System.out.print("������ :");
//		  operator = scan.next();
//
//		  System.out.print("�ι�° ���� �� ");
//		  num2 = scan.nextInt();
//		 
//		  //����� �� 
//		  System.out.println("================================================");
//		  System.out.println(num1+" "+operator+" "+num2+"�� ����մϴ�.");
//		  System.out.println("================================================");
//		  
//		  
//		  if(operator.equals("+"))
//		  {
//		   result = num1+num2;
//		   System.out.println(num1 + "+" + num2 + "=" + result+"�Դϴ�.");
//		  }
//		  else if(operator.equals("-"))
//		  {
//		   result = num1-num2;
//		   System.out.println(num1+"-"+num2+"="+result+"�Դϴ�.");
//		 
//		  }
//		  else if(operator.equals("*"))
//		  {
//		   result = num1*num2;
//		   System.out.println(num1+"*"+num2+"="+result+"�Դϴ�.");
//		  }
//		  else if(operator.equals("/"))
//		  {
//		   System.out.println("������ �����"+num1+"/"+num2+"="+(double)num1/num2+"�Դϴ�.");
//		  }
//		  else
//		  {
//		   System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.");
//
//		  }
		
	}

}
