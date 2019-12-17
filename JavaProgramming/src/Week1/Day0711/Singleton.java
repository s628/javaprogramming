package Week1.Day0711;

public class Singleton {
	  private Singleton() {}

	  private static Singleton instance = null;

	  public static synchronized Singleton getInstance(){

	    if(instance == null){

	         instance = new Singleton();  //������ �ϳ��� ���ͼ� ��밡��

	    }

	    return instance;

	  }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
