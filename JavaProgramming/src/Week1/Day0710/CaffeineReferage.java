package Week1.Day0710;




 abstract public class CaffeineReferage {
	 final void prepareRecipe() {    //제조과정 정의         추상 클라스
		 this.boilWater();
		 this.brew();
		 this.pourInCup();
		 this.addcndiments();
	 }
	 abstract void brew();   //abstract  //자식에게 부여해서 반드시 해야 하는것 override x
	 abstract void addcndiments();
	 void boilWater() {
		 System.out.println("물 끓이는 중");         
	 }
	 void pourInCup() {
		 System.out.println("컵에 따르는 중");
	 }
	 class Coffee extends CaffeineReferage{                   
		 void brew() {
			 System.out.println("설탕과 우유를 추가하는 중");        //abstract 있기 때문에 //자식에게 부여해서 반드시 해야 하는것 override x
		 }
		 void addcndiments() {
			 System.out.println("필터를 통해 커피를 우려내는 중");     //abstract 있기 때문에 //자식에게 부여해서 반드시 해야 하는것 override x
		 
	 }
	 }
	 class Tea extends CaffeineReferage{
		 void brew() {
			 System.out.println("차를 우려내는 일");              //abstract 있기 때문에  //자식에게 부여해서 반드시 해야 하는것 override x
		 }
		 void addcndiments() {
			 System.out.println("레몬을 추가하는 중");            //abstract 있기 때문에  //자식에게 부여해서 반드시 해야 하는것 override x
		
	 }
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
