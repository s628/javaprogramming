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
		
		SpecialMember m = new SpecialMember("ȫ�浿");
		Member s = m;
		m.getName(); // ȫ�浿
		


//�ǽ�2: ���� Ŭ���� ����
//
//SpecialMember, Member
//
//SpecialMember m = new SpecialMember(��ȫ�浿��);
//
//Member s = m;
//
//
//s.getName(); // ȫ�浿

	}

}
