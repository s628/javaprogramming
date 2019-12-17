package Week1.Day0710;

interface A3 {

	  int x = 100;

	  public static class B3 {
	      private int y;

	  public B3() {
	      this.y = 200;
	      }

	  
	  public void disp() {

	         System.out.println("x = " + x); // A.x
	         System.out.println("y = " + y); // this.y

	      }
	  }
	}

public class Interface {

	public static void main(String[] args) {
		 A3.B3 bp = new A3.B3();

	      bp.disp();

	}

}
