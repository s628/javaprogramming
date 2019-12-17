package Week2.Day0718;

import java.util.ArrayList;



class Fruit2 implements Eatable {

    public String toString() { return "Fruit";}

}
class Apple2 extends Fruit2 { public String toString() { return "Apple";}}
class Grape2 extends Fruit2 { public String toString() { return "Grape";}}
class Toy2 { public String toString() { return "Toy"  ;}}


interface Eatable {}


class FruitBoxEx2 {

    public static void main(String[] args) {

 FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>(); // Eatable�� �ڽ�
 FruitBox<Apple2> appleBox = new FruitBox<Apple2>(); // Fruit�� �ڽ�
 FruitBox<Grape2> grapeBox = new FruitBox<Grape2>(); // Fruit�� �ڽ�

// FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // ����. Ÿ�� ����ġ

// FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // ����.

 fruitBox.add(new Fruit2());
 fruitBox.add(new Apple2());
 fruitBox.add(new Grape2());
 appleBox.add(new Apple2());
// appleBox.add(new Grape());  // ����. Grape�� Apple�� �ڼ��� �ƴ�
 grapeBox.add(new Grape2());

 System.out.println("fruitBox-"+fruitBox);
 System.out.println("appleBox-"+appleBox);
 System.out.println("grapeBox-"+grapeBox);

    }  // main
}




class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {}

class Box2 <T> {

 ArrayList<T> list = new ArrayList<T>();
 
 void add(T item)  { list.add(item);      }
 T get(int i)      { return list.get(i); }
 int size()        { return list.size();  }

 public String toString() { return list.toString();}

}