package Week3.Day0725;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Order {
	private int orderNo;
	private Date orderDt;
	private HashMap products = new HashMap();

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Order(int orderNo, Date orderDt, HashMap products) {
		this.orderDt = orderDt;
		this.orderNo = orderNo;
		this.products = products;
	}

	public void addProduct(int ordProdNo, Product p) {
//		 Product pd = new Product(ordProdNo, productNm);
		this.orderNo = orderNo;
		this.products.put(ordProdNo, p);
	}

	public void delProduct(int ordProdNo) {
		this.products.remove(ordProdNo);
	}

	public void chgProduct(int orProdNo, Product p) {
		products.replace(orProdNo, p);
	}
//    	if(this.products.containsKey(ordProdNo)) {
//    		this.products.replace(ordProdNo, p);
//    	}else {
//    		System.out.println("해당 상품은 존재하지 않습니다.");
//    	}

	public void printKeyBySort(HashMap products) {
		System.out.println("====printKeyBySort====");
		HashMap<Integer, Product> hs = new HashMap<Integer, Product>(products);
		Iterator<Integer> it = products.keySet().iterator(); // 키값 오름차순 정렬(기본)
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("key 값 : " + (key) + ", 제품명 : " + hs.get(key).getProductNm() + ", 제품번호 : "
					+ hs.get(key).getProductNo());
		}
	}

	@SuppressWarnings("unchecked")
	public void printValueBySort(Comparator<Product> c) {
		System.out.println("====printValueBySort====");
		ArrayList<Product> l = new ArrayList<Product>();
		l.addAll(this.products.values());
		Collections.sort(l, c);
		for (Product p : l) {
			System.out.println(p.toString());
		}

	}

	public void ValueBySort(Compare1 c) {
		// TODO Auto-generated method stub
		
	}

}

class Compare1 implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getProductNo() > o2.getProductNo()) {
			return 1;
		} else if (o1.getProductNo() < o2.getProductNo()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Product {
	private int productNo;
	private String productNm;

	public Product(int productNo, String productNm) {
		this.productNo = productNo;
		this.productNm = productNm;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public int hashCode() {
		return Objects.hash(this.productNm, this.productNo);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product tmp = (Product) obj;
			return this.productNo == tmp.productNo && this.productNm.equals(tmp.productNm);
		}
		return false;
	}

	public String toString() {
		return "제품번호 : " + this.getProductNo() + "/" + "제품이름 : " + this.getProductNm();
	}
}

public class report0725 {

	public static void main(String[] args)  throws ParseException {

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

		Product p1 = new Product(1, "하나");
		Product p2 = new Product(22, "둘");
		Product p3 = new Product(333, "셋");
		Product p4 = new Product(4444, "넷");

		HashMap products = new HashMap();

		Order or = new Order(123, f.parse("2019-07-25"), products);

		or.addProduct(1, p1);
		or.addProduct(2, p2);
		or.addProduct(3, p3);
		or.addProduct(4, p4);

		or.delProduct(123);

		Product pr = new Product(9997, "아이패드");

		or.chgProduct(1, pr);

		or.printKeyBySort(products);

		Compare1 c = new Compare1();

		or.ValueBySort(c);

	}

}
