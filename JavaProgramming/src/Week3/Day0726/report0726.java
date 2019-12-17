package Week3.Day0726;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.sql.Date;
import java.util.Iterator;
import java.util.LinkedList;




class AutoFood {

	private int orderFoodNo;
	private Date orderDt;
	private LinkedList foods = new LinkedList();
	private ArrayList serviceFoods = new ArrayList();

	public AutoFood(int orderFoodNo, Date orderDt) {
		this.orderFoodNo = orderFoodNo;
		this.orderDt = orderDt;
	}

	public void orderFood(Food f) {
              foods.add(f);
              Collections.sort(foods);;
	}

	public void printOrderFood() {
		Iterator it = foods.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void serviceFood(Food f) {
		foods.remove(f);
		serviceFoods.add(f);
	}

	public void printTotalCount() {
		System.out.println("국수 주문량 합계 :" + Noodle.count + "개");
		System.out.println("볶음밥 주문량 합계: " + FriedRice.count + "개");
	}
}



abstract class Food implements Comparable<Food>{
	private int foodNo;
	private String foodNm;
	private int time;
	
	Food(int foodNo, String foodNm){
		this.foodNo = foodNo;
		this.foodNm = foodNm;
	}

	public int getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}

	public String getFoodNm() {
		return foodNm;
	}

	public void setFoodNm(String foodNm) {
		this.foodNm = foodNm;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}


class Noodle extends Food{
	private int time;
	static int count = 0;

	public Noodle(int foodNo, String foodNm) {
		super(foodNo, foodNm);
		// TODO Auto-generated constructor stub
	}
	public Noodle(int foodNo, String foodNm,int time) {
		super(foodNo, foodNm);
	  this.time = time;
	  count++;
}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	public String toString() {
		return  super.getFoodNm() + " 조리시간 : " + time + "분";
	}
	@Override
	public int compareTo(Food f) {
		if(this.time > f.getTime())
			return 1;
		else if(this.time < f.getTime())
			return -1;
		else
			return 0;
	}
}


class FriedRice extends Food{

	private int time;
	static int count = 0;

	FriedRice(int foodNo, String foodNm) {
		super(foodNo, foodNm);
		// TODO Auto-generated constructor stub
	}
	public FriedRice(int foodNo, String foodNm, int time) {
		super(foodNo, foodNm);
		this.time = time;
		count++;
}
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public String toString() {
		return  super.getFoodNm() + " 조리시간 : " + time + "분";
	}
	@Override
	public int compareTo(Food f) {
		if(this.time > f.getTime())
			return 1;
		else if(this.time < f.getTime())
			return -1;
		else
			return 0;
	}
}

public class report0726 {

	public static void main(String[] args) {
		
		
		AutoFood af = new AutoFood(101, Date.valueOf("2019-07-01"));
		
		FriedRice fr = new FriedRice(2, "볶음밥", 15);
		Noodle n = new Noodle(1, "국수", 20);
		Noodle n2 = new Noodle(1, "비빔국수", 5);
		
		af.orderFood(n);
		af.orderFood(fr);
		af.orderFood(n2);
		af.printOrderFood();
		
		System.out.println();
		af.serviceFood(n2);
		af.printOrderFood();
		
		System.out.println();
		af.printTotalCount();
	}
}
