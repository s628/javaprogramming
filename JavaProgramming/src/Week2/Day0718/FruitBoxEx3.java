package Week2.Day0718;

import java.util.ArrayList;

class Juice {
	String name;
	
	Juice (String name) { this.name = name + "Juice";}
	
	public String toString( ) { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox3 <? extends Fruit1> box) {
		String tmp = "";
		
		for(Fruit1 f : box.getList()) 
			tmp += f + " "; 
		return new Juice(tmp);

		
	}
}

public class FruitBoxEx3 {

	public static void main(String[] args) {
		
		
		FruitBox3<Fruit1>fruitBox = new FruitBox3<Fruit1>();
		FruitBox3<Apple1>appleBox = new FruitBox3<Apple1>();
		
		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1()); 
		appleBox.add(new Apple1()); 
		appleBox.add(new Apple1());

		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));	
	}

}
class FruitBox3<T extends Fruit1> extends Box4<T> {}

class Box4<T> {
	//class Fruit <T extends Fruit> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i)     { return list.get(i); } 
	ArrayList<T> getList() { return list;  } 
	int size()       { return list.size(); } 
	public String toString() { return list.toString();}
	

}



