package Week1.Day0711;

class Member {

	 String name;

	 Member(String name){

	   this.name = name;

	 }

	 String getName() {

	   return name;

	 }

	void setName(String name){

	   this.name = name;

	 } 

	}


	class SpecialMember extends Member {

	 public SpecialMember(String name) {

	  //super.name = name;

	  super(name);

	 }

	}

public class report302 {

	public static void main(String[] args) {
		
		SpecialMember m = new SpecialMember("È«±æµ¿");
		Member s = m;
		m.getName(); // È«±æµ¿
		


//½Ç½À2: ´ÙÀ½ Å¬·¡½º ¼³°è
//
//SpecialMember, Member
//
//SpecialMember m = new SpecialMember(¡°È«±æµ¿¡±);
//
//Member s = m;
//
//
//s.getName(); // È«±æµ¿

	}

}
