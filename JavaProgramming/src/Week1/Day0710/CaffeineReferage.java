package Week1.Day0710;




 abstract public class CaffeineReferage {
	 final void prepareRecipe() {    //�������� ����         �߻� Ŭ��
		 this.boilWater();
		 this.brew();
		 this.pourInCup();
		 this.addcndiments();
	 }
	 abstract void brew();   //abstract  //�ڽĿ��� �ο��ؼ� �ݵ�� �ؾ� �ϴ°� override x
	 abstract void addcndiments();
	 void boilWater() {
		 System.out.println("�� ���̴� ��");         
	 }
	 void pourInCup() {
		 System.out.println("�ſ� ������ ��");
	 }
	 class Coffee extends CaffeineReferage{                   
		 void brew() {
			 System.out.println("������ ������ �߰��ϴ� ��");        //abstract �ֱ� ������ //�ڽĿ��� �ο��ؼ� �ݵ�� �ؾ� �ϴ°� override x
		 }
		 void addcndiments() {
			 System.out.println("���͸� ���� Ŀ�Ǹ� ������� ��");     //abstract �ֱ� ������ //�ڽĿ��� �ο��ؼ� �ݵ�� �ؾ� �ϴ°� override x
		 
	 }
	 }
	 class Tea extends CaffeineReferage{
		 void brew() {
			 System.out.println("���� ������� ��");              //abstract �ֱ� ������  //�ڽĿ��� �ο��ؼ� �ݵ�� �ؾ� �ϴ°� override x
		 }
		 void addcndiments() {
			 System.out.println("������ �߰��ϴ� ��");            //abstract �ֱ� ������  //�ڽĿ��� �ο��ؼ� �ݵ�� �ؾ� �ϴ°� override x
		
	 }
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
