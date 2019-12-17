package Week1.Day0711;

import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable {  

	   private List<String> userList;

	   public Users() {

	      userList = new ArrayList();

	   }

	   public Users(List list) {
	      this.userList = list;
	   }
   
	   public void loadData() {

	      userList.add("1");
	      userList.add("2");
	      userList.add("3");
	      userList.add("4");

	   }
   
	   public void print() {
	      System.out.println(userList);

	   }

	   public List<String> getUserList() {
	      return userList;
	      
	   }



	   public Object clone() throws CloneNotSupportedException{

	      List<String> temp = new ArrayList();    

	      
	      for(String s: this.getUserList()) {

	         temp.add(s);
	      }

	      return new Users(temp);

	   }

	public static void main(String[] args) throws Exception { 
		  Users orginUsers = new Users();

	      orginUsers.loadData();           //Cloneable 카피본을 복사해서 리턴을 해줌

	      Users cloneUsers = (Users)orginUsers.clone();

	      cloneUsers.print();


	}

}
