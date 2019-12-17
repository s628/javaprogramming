package Week2.Day0719;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Plane {

	private String model;
	private String airline;
	private HashSet fixHis = new HashSet();

	Plane(String model, String airline) {
		this.model = model;
		this.airline = airline;
	}

	public void addFixHis(FixHis2 his) {
		this.fixHis.add(his);

	}

	public void printFixHis() {
		Iterator it = this.fixHis.iterator();
		while (it.hasNext()) {
			FixHis2 fh = (FixHis2) it.next();
			System.out.println(fh);
		}
	}
}


class FixHis2 {
	private String airport;
	private String date;
	private String cmt;

	FixHis2(String airport, String date, String cmt) {
		this.airport = airport;
		this.date = date;
		this.cmt = cmt;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public boolean equals(Object obj) {
		if (obj instanceof FixHis2) {
			FixHis2 tmp = (FixHis2) obj;
			return this.airport.equals(tmp.airport) && this.date.equals(tmp.date) && this.cmt.equals(tmp.cmt);
		}
		return false;
	}

	public int hashCode() {
		return Objects.hash(this.airport, this.date, this.cmt);
	}

	public String toString() {
		return this.airport + "-" + this.date + "-" + this.cmt;
	}
}

public class report07192 {

	public static void main(String[] args) throws Exception {

		Plane p = new Plane("A300", "에어버스");
		FixHis2 f1 = new FixHis2("EMIRATES", "20190719", "날개수리");
		FixHis2 f2 = new FixHis2("진에어", "20190719", "엔진수리");
		FixHis2 f3 = new FixHis2("대한항공", "20190719", "도어수리");

		p.addFixHis(f1);
		p.addFixHis(f2);
		p.addFixHis(f3);

		p.printFixHis();

	}
}
