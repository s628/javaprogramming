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
			throw new Exception("날짜 Format이 정확하지 않습니다.");
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
			throw new Exception("같은 수리부품은 중복 될 수 없습니다.");
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
		// setLenient(boolean lenient) :날짜가 파싱될 때 허술하게 할지말지를 설정.
		// 이렇게 체크할 경우, 유효한 날짜가 아니면 ParseException을 던질것이고, 유효한 날짜라면 true로 반환.
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
		if (obj != null && obj instanceof AccidentHis) { // obj가 AccidentHis의 Instance
			return location.equals(((AccidentHis) obj).location) && date.equals(((AccidentHis) obj).date)
					&& time.equals(((AccidentHis) obj).time); // 값이 같은지 비교
		} else {
			return false;
		}
	}

}

public class report0719 {

	public static void main(String[] args) throws Exception {

		Car ac = new Car("포르쉐", 500, 100, "홍길동");

		try {
			ac.addAccidentHis("강남역/20190719/09:00");
			ac.addAccidentHis("논현역/20190720/18:00");
			ac.printAccidentHis();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ac.addFixHis("20190718", "썬루프", "교체");
			ac.addFixHis("20190719", "와이퍼", "교체");
			ac.printFixHis();
//			ac.addFixHis("20190719", "와이퍼", "교체"); 	    //오류 출력용
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//		try {
//			ac.addFixHis("20150908", "창문", "수리");
//			ac.addFixHis("20170607", "범퍼", "교체");
//			ac.printAccidentHis();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
