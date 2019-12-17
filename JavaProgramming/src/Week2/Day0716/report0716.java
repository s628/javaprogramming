package Week2.Day0716;

abstract class Project {
	private String name;
	private String startDt;
	private String endDt;
	private String location;
	private Developer[] dev;

	Project(String name, String startDt, String endDt, String location) {
		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
	}

	Project(String name, String startDt, String endDt, String location, Developer[] dev) {

		this.name = name;
		this.startDt = startDt;
		this.endDt = endDt;
		this.location = location;
		this.dev = dev;
	}

	public void Process() {
		plan();
		design();
		develop();

	}

	public void plan() {
		System.out.println("===================================");
		System.out.println("\t    프로젝트 준비");
		System.out.println("===================================");
	}

	public void join(Developer[] d) {
		this.dev = d;
	}

	public abstract void design();
//    System.out.println("설계작업수행");

	public abstract void develop();
//    System.out.println("개발작업수행");

	public int getPeriod() {
		int endDt1 = Integer.parseInt(endDt);
		int startDt1 = Integer.parseInt(startDt);
		int period = endDt1 - startDt1;
		return period;
	}

	public void getMMByDeveloper() {
		int sum = 0;
		for (int i = 0; i < dev.length; i++) {
			sum += dev[i].getPeriod();
		}
		System.out.println("Project에 참여한 개발자의 총 월간 개월수 = " + sum + " 개월");
	}

	public void printDeveloper() {
		for (int i = 0; i < dev.length; i++) {
			if (dev[i] instanceof HighDeveloper)
				System.out.println(
						"고급 개발자 : " + dev[i].getName() + ", 특기 : " + ((HighDeveloper) dev[i]).getSpecialSkill());
			else
				System.out.println("일반 개발자 : " + dev[i].getName());
		}
	}
}

class HrProject extends Project {

	HrProject(String name, String startDt, String endDt, String location) {
		super(name, startDt, endDt, location);

	}

	@Override
	public void design() {
		System.out.println("HR 설계작업수행");

	}

	@Override
	public void develop() {
		System.out.println("HR 개발작업수행");
		System.out.println("===================================");
	}
}

class Developer {
	private String name;
	private int period;

	public Developer(String name, int period) {
		this.name = name;
		this.period = period;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod() {
		this.period = period;
	}
}

class HighDeveloper extends Developer {

	private String specialSkill;

	HighDeveloper(String name, int period, String specialSkill) {
		super(name, period);
		this.specialSkill = specialSkill;
	}

	String getSpecialSkill() {
		return specialSkill;
	}

	void setSpecialSkill() {
		this.specialSkill = specialSkill;

	}
}

public class report0716 {

	public static void main(String[] args) {

		HrProject hr = new HrProject("가가가", "20190716", "20180716", "수원");

		Developer[] dev = new Developer[2];
		dev[0] = new Developer("가가가", 10);
		dev[1] = new Developer("나나나", 20);

		HighDeveloper dev2 = new HighDeveloper("다다다", 30, "가가가");
		dev[1] = dev2;

		hr.join(dev);
		hr.Process();
		hr.getMMByDeveloper();
		hr.printDeveloper();

	}

}
