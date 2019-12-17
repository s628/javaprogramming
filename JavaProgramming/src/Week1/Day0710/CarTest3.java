package Week1.Day0710;

class Car {
 String color;
 String gearType;
  int door;

  Car(){
	  this("white","auto", 4);
  }
  Car(Car c){
	  color = c.color;
	  gearType = c.gearType;
	  door = c.door;
  }
  
  Car(String color, String gearType, int door){
	  this.color = color;
	  this.gearType = gearType;
	  this.door = door;
  }
}


class CarTest3{
	
	public static void main(String[] args) {
		
Car c1 = new Car();
Car c2 = new Car(c1);
//System.out.println(c1.door);
//System.out.println(c2.door);


if (c1 == c2)
	System.out.println("c1과 c2는 문의 개수가 같습니다.");
else 
System.out.println("c1과 c2는 문의 개수가 다릅니다");

if (c1.equals(c2))
	System.out.println("c1과 c2는 문의 개수가 같습니다.");
else 
System.out.println("c1과 c2는 문의 개수가 다릅니다");





	}

}
