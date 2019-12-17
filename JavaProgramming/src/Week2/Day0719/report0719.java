package Week2.Day0719;

import java.sql.Date;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Car {
	private String model;
	private int efficiency;
	private int distance;
	private HashMap fixHis = new HashMap();
	private String nowOwner;
	private HashSet accidentHis = new HashSet();

	Car(String model, int efficiency, int distance, String nowOwner) {
		this.model = model;
		this.efficiency = efficiency;
		this.distance = distance;
		this.nowOwner = nowOwner;
	}

	public void addAccidentHis(String info) throws Exception {

		String data[] = info.split("/");

		if (Util.validationDate(data[1] + " " + data[2])) {
			AccidentHis ac = new AccidentHis(data[0], data[1], data[2]);
			accidentHis.add(ac);
		} else {
			throw new Exception("��¥ Format�� ��Ȯ���� �ʽ��ϴ�.");
		}
	}

	public void printAccidentHis() throws ParseException {
		SimpleDateFormat original_format = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat new_format = new SimpleDateFormat("yyyy.MM.dd");

		Iterator it = accidentHis.iterator();

		while (it.hasNext()) {
			AccidentHis a = (AccidentHis) it.next();

			java.util.Date original_date = original_format.parse(a.getDate());
			String new_date = new_format.format(original_date);
			System.out.println(a.getLocation() + "-" + new_date + "-" + a.getTime());
		}
	}

	public void addFixHis(String date, String item, String fixcmt) throws Exception {
		FixHis fh = new FixHis(date, item, fixcmt);

		String strKey = date + "/" + item;
		String strFixinfo = date + "/" + item + "/" + fixcmt;
		if (fixHis.containsKey(strKey)) {
			throw new Exception("���� ������ǰ�� �ߺ� �� �� �����ϴ�.");
		} else {
			fixHis.put(strKey, strFixinfo);
		}
	}

	public void printFixHis() {
		Set set = fixHis.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			System.out.println(e.getValue());

		}
	}
}

class Util {
	public static boolean validationDate(String date) {
		// setLenient(boolean lenient) :��¥�� �Ľ̵� �� ����ϰ� ���������� ����.
		// �̷��� üũ�� ���, ��ȿ�� ��¥�� �ƴϸ� ParseException�� �������̰�, ��ȿ�� ��¥��� true�� ��ȯ.
		try {
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd HH:mm");
			dateformat.setLenient(false);
			dateformat.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		}

	}
}

class FixHis {
	private String date;
	private String item;
	private String fixcmt;

	FixHis(String date, String item, String fixcmt) {
		this.date = date;
		this.item = item;
		this.fixcmt = fixcmt;
	}

	public char[] getName() {
		return null;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFixcmt() {
		return fixcmt;
	}

	public void setFixcmt(String fixcmt) {
		this.fixcmt = fixcmt;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof FixHis) {
			String thisTmp = date + "/" + item;
			String tmp = ((FixHis) obj).getDate() + "/" + ((FixHis) obj).getItem();

			return thisTmp.equals(tmp);
		} else
			return false;
	}

	public int hashCode() {
		return Objects.hash(date, item, fixcmt);
	}

	public String toString() {
		return date + " ? " + item;
	}

}

class AccidentHis {
	String location;
	String date;
	String time;

	AccidentHis(String location, String date, String time) {
		this.location = location;
		this.date = date;
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int hashCode() {
		return Objects.hash(location, date, time);
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof AccidentHis) { // obj�� AccidentHis�� Instance
			return location.equals(((AccidentHis) obj).location) && date.equals(((AccidentHis) obj).date)
					&& time.equals(((AccidentHis) obj).time); // ���� ������ ��
		} else {
			return false;
		}
	}

}

public class report0719 {

	public static void main(String[] args) throws Exception {

		Car ac = new Car("������", 500, 100, "ȫ�浿");

		try {
			ac.addAccidentHis("������/20190719/09:00");
			ac.addAccidentHis("������/20190720/18:00");
			ac.printAccidentHis();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ac.addFixHis("20190718", "�����", "��ü");
			ac.addFixHis("20190719", "������", "��ü");
			ac.printFixHis();
//			ac.addFixHis("20190719", "������", "��ü"); 	    //���� ��¿�
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//		try {
//			ac.addFixHis("20150908", "â��", "����");
//			ac.addFixHis("20170607", "����", "��ü");
//			ac.printAccidentHis();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
