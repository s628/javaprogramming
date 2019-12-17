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
	   // 삭제할 취미가 있는 index 구하기
	   for(int i = 0; i < this.hobbyCnt; i++) {
	    if(this.hobby[i].equals(hobby)) {
	     index = i;
	    }
	   }
	   // 삭제대상 취미가 존재하지 않는경우
	   if (index < 0) {
	    return false;
	   }
	   // 해당 index제외하고 새로운 취미배열 만들기
	   for(int i = 0; i < this.hobbyCnt; i++) {
	    if(i >= index) {
	     this.hobby[i] = this.hobby[i+1];
	    }
	   }
	   // 삭제대상 취마가 있는 경우 마지막 값 초기화
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
		
		CompanyMan cp = new CompanyMan("이름", 50, new Company("삼성전자"));
		
		
		cp.setHobby("수영");
		cp.setHobby("농구");
		cp.printHobby();
		
		cp.delHobby("농구");
		cp.printHobby();
		cp.setNowCompany(new Company("LG전자"));
		cp.printCompanyHistory();
		
		Company[] c = new Company[6];
		c[0] = new Company("홍길읍", 10);        //p[0] 번째 주소값
		c[1] = new Company("홍길면", 20);
		c[2] = new Company("홍길리", 30);
		c[3] = new Company("홍길구", 40);
		c[4] = new Company("홍길동", 50);
		
		
		
		
		
		
		

		
		

	}

}
