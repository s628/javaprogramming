package Week1.Day0709;

public class ThisSample {

	private int x;
	private static int y;
	
	//public void aaa(ThisSample this){
	public void aaa() {
		this.x = 10;
		ThisSample.y = 20;
		
	}
	//public void bbb(ThisSample this, int x, int y){
	public void bbb(int x, int y) {
		this.x = x;
		ThisSample.y = y;
	}
	//public void ccc(ThisSample this, int x, int y){
		public void ccc(int x, int y) {
			//this.x
			ThisSample.y = 10;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
