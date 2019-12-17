package Week2.Day0718;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


public class report0718 {

	public static void main(String[] args) {
		
		
		  Dog d = new Dog("ĳ��", 10, "���۵�");
		

		  try {
		   d.shotInoculate("��Ƽ����", Date.valueOf("2019-07-01"));
		   // d.shotInoculate("��Ƽ����", Date.valueOf("2019-07-01"));
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		  d.printInoculateHistory();

		  d.addHandler("ȫ�浿", "2019-01-05", "2019-02-01");
		  d.addHandler("ȫ�浿", "2019-01-05", "2019-02-01");
		  d.addHandler("��浿", "2019-05-09", "2019-05-30");
		  try {
		   System.out.println("Period:" + d.getTotalHandlerPeriod());
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		 }
		}

		class Dog {
		 private String name;
		 private int age;
		 private String kind;
		 private ArrayList inoculate = new ArrayList();
		 private HashSet handler = new HashSet();
		 private HashMap family = new HashMap();

		 Dog(String name, int age, String kind) {
		  this.name = name;
		  this.age = age;
		  this.kind = kind;
		 }

		 public void shotInoculate(String name, Date date) throws Exception {
		  Inoculate in = new Inoculate(name, date);

		  // ���� ������ �ִ��� Check
		  if (inoculate.contains(in)) {
		   throw new Exception("�ߺ��� ���������Դϴ�");
		  }

		  // ǰ���� �������� ���� �Ⱓ�� �ƴ��� Check
		  Collections.sort(inoculate);

		  Inoculate max = null;
		  if (inoculate.size() > 0) {
		   max = (Inoculate) inoculate.get(inoculate.size() - 1);

		   long day = 0;
		   if ("���۵�".equals(this.kind)) {
		    day = diffOfDate(max.getDate().toString(), date.toString());
		    
		    if (day < 7)
		     throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�");
		   
		   } else if ("������".equals(this.kind)) {
		    day = diffOfDate(max.getDate().toString(), date.toString());
		    
		    if (day < 10)
		     throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�");
		    
		   } else if ("�����ݸ�".equals(this.kind)) {
		    day = diffOfDate(max.getDate().toString(), date.toString());
		    
		    if (day < 15)
		     throw new Exception("�������� ���ɱⰣ�� �ƴմϴ�");
		   }
		  }
		  inoculate.add(in);
		 }
		 
		 
		 public void printInoculateHistory() {
		  Iterator it = inoculate.iterator();
		  while (it.hasNext()) {
		   System.out.println(((Inoculate) it.next()).getName());
		  }
		 }

		 public void addHandler(String name, String strDt, String endDt) {
		  Handler h = new Handler(name, strDt, endDt);
		  handler.add(h);
		 }

		 public int getTotalHandlerPeriod() throws Exception {
		  Iterator it = handler.iterator();

		  int sum = 0;

		  while (it.hasNext()) {
		   Handler h = (Handler) it.next();

		   String strDt = h.getStrDt();
		   String endDt = h.getEndDt();

		   long lo = diffOfDate(strDt, endDt);

		   sum += lo;
		  }
		  return sum;
		 }

		 
		 public long diffOfDate(String begin, String end) throws Exception {
		  System.out.println(begin + "~" + end);
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		  java.util.Date beginDate = formatter.parse(begin);
		  java.util.Date endDate = formatter.parse(end);

		  long diff = endDate.getTime() - beginDate.getTime();
		  long diffDays = diff / (24 * 60 * 60 * 1000);

		  return diffDays;
		 }
		}
		class Handler {
		 private String name;
		 private String strDt;
		 private String endDt;

		 Handler(String name, String strDt, String endDt) {
		  this.name = name;
		  this.strDt = strDt;
		  this.endDt = endDt;
		 }

		 public String getName() {
		  return name;
		 }

		 public void setName(String name) {
		  this.name = name;
		 }

		 public String getStrDt() {
		  return strDt;
		 }

		 public void setStrDt(String strDt) {
		  this.strDt = strDt;
		 }

		 public String getEndDt() {
		  return endDt;
		 }

		 public void setEndDt(String endDt) {
		  this.endDt = endDt;
		 }

		 public boolean equals(Object obj) {
		  String thisTmp = name + strDt + endDt;
		  String tmp = ((Handler) obj).getName() + ((Handler) obj).getStrDt() + ((Handler) obj).getEndDt();

		  System.out.println("equals ȣ��");
		  if (obj != null && obj instanceof Handler) { // obj�� Person2�� Instance
		   boolean b = thisTmp.equals(tmp);
		   System.out.println("��:" + b);
		   return b; // ���� ������ ��
		  } else {
		   return false;
		  }
		 }

		 public int hashCode() {
		  return Objects.hash(name, strDt, endDt);
		 }

		 public String toString() {
		  // Card�ν��Ͻ��� kind�� number�� ���ڿ��� ��ȯ�Ѵ�.
		  return "name : " + name + ", startDt : " + strDt + ", endDt : " + endDt;
		 }

		}

		class Inoculate implements Comparable {
		 String name;
		 Date date;

		 Inoculate(String name, Date date) {
		  this.name = name;
		  this.date = date;
		 }

		 public String getName() {
		  return name;
		 }

		 public void setName(String name) {
		  this.name = name;
		 }

		 public Date getDate() {
		  return date;
		 }

		 public void setDate(Date date) {
		  this.date = date;
		 }

		 public boolean equals(Object obj) {
		  if (obj != null && obj instanceof Inoculate) { // obj�� Person2�� Instance
		   return name.equals(((Inoculate) obj).name); // ���� ������ ��
		  } else {
		   return false;
		  }
		 }

		 @Override
		 public int compareTo(Object arg) {
		  Inoculate param = (Inoculate) arg;

		  return date.toString().compareTo(param.getDate().toString());
		 }
		}