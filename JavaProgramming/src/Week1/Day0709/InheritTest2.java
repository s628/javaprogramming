package Week1.Day0709;


class A1 {
	protected int x = 100;
	protected void disp() {
}
}
class B1 extends A1{
	//private int x = 200;
	public int x = 200;
	public int y = 100;
	public void disp() {
		System.out.println("A1Ŭ������  x =" + super.x);
		System.out.println("B1Ŭ������  x =" + this.x);
		
	}
	public void disp2() {}
}


public class InheritTest2 {

	public static void main(String[] args) {
		B1 bp = new B1();
		System.out.println(bp.x);
		bp.disp();
		
		A1 ap = new B1();
		System.out.println(ap.x);
        ap.disp();
        
	}

}
