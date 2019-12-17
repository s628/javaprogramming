package Week2.Day0716;

import java.util.Arrays;

class CompanyMan{
	 private String name;
	 private int age;
	 private String[] hobby = new String[5];
	 private Company nowCompany;
	 private Company[] hisCompany = new Company[5];
	 private int hobbyCnt;
	 private int hisCompanyCnt;
	 
	 CompanyMan(String name, int age, Company nowCompany){
	  this.name = name;
	  this.age = age;
	  this.nowCompany = nowCompany;
	 }
	 
	 public boolean setHobby(String hobby) {
	  int temp = hobbyCnt;
	  try {
	   this.hobby[this.hobbyCnt] = hobby;
	   hobbyCnt++; 
	  } catch(Exception e) {
	   hobbyCnt = temp;
	   return false;
	  }
	  
	  return true;
	 }
	 
	 public boolean delHobby(String hobby) {
	  int index = -1;
	  String[] temp = Arrays.copyOf(this.hobby, this.hobby.length);
	  
	  try {
	   // ������ ��̰� �ִ� index ���ϱ�
	   for(int i = 0; i < this.hobbyCnt; i++) {
	    if(this.hobby[i].equals(hobby)) {
	     index = i;
	    }
	   }
	   // ������� ��̰� �������� �ʴ°��
	   if (index < 0) {
	    return false;
	   }
	   // �ش� index�����ϰ� ���ο� ��̹迭 �����
	   for(int i = 0; i < this.hobbyCnt; i++) {
	    if(i >= index) {
	     this.hobby[i] = this.hobby[i+1];
	    }
	   }
	   // ������� �븶�� �ִ� ��� ������ �� �ʱ�ȭ
	   this.hobby[this.hobbyCnt-1] = null;
	  }catch(Exception e) {
	   this.hobby = temp;
	   return false;
	  }
	  
	  this.hobbyCnt--;
	  return true;
	 }
	 
	 public void setNowCompany(Company company) {
	  hisCompany[hisCompanyCnt] = this.nowCompany;
	  hisCompanyCnt++;
	  
	  this.nowCompany = company;  
	 }
	 
	 public void printHobby() {
	  for(int i = 0; i < this.hobbyCnt; i++) {
	   System.out.println(hobby[i]);
	  }  
	 }
	 
	 public void printCompanyHistory() {
	  for(int i = 0; i < this.hisCompanyCnt; i++) {
	   System.out.println(hisCompany[i].getName());
	  }  
	 } 
	}

	class Company {
	 private String name;
	 private int period; 
	 
	 Company(String name){
	  this.name = name;
	 }
	 
	 Company(String name, int period){
	  this.name = name;
	  this.period = period;
	 } 
	 
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public int getPeriod() {
	  return period;
	 }
	 public void setPeriod(int period) {
	  this.period = period;
	 }
	 
	}

     

public class report0716_2 {

	public static void main(String[] args) {
		
		CompanyMan cp = new CompanyMan("�̸�", 50, new Company("�Ｚ����"));
		
		
		cp.setHobby("����");
		cp.setHobby("��");
		cp.printHobby();
		
		cp.delHobby("��");
		cp.printHobby();
		cp.setNowCompany(new Company("LG����"));
		cp.printCompanyHistory();
		
		Company[] c = new Company[6];
		c[0] = new Company("ȫ����", 10);        //p[0] ��° �ּҰ�
		c[1] = new Company("ȫ���", 20);
		c[2] = new Company("ȫ�渮", 30);
		c[3] = new Company("ȫ�汸", 40);
		c[4] = new Company("ȫ�浿", 50);
		
		
		
		
		
		
		

		
		

	}

}
