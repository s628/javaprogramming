package Week2.Day0715;



class Programmer {
	
private int age;
private Project now;
private Project[] history;
private String sum;
private String name;
private int count;
	
public Programmer(String name, int age, Project now, Project[] history) {
	
	this.name = name;
	this.age = age;
	this.now = now;
	this.history = history;
	
	
}

void joinProject(Project p) {
	this.now = p;
}

void addProjectHistory(Project p) throws Exception {
	this.history[5] = p;
	if(count > 4) {
		throw new Exception("Project History는 5개까지 가능합니다.");
	}
}
void getNowProject() {
	 System.out.println(name +"의 현재 진행 중인 Project는 " + now.getName() + " 입니다.");
}

void printProjectHistory() {
	for (int i = 0; i < history.length; i++) {
		System.out.println(" 프로젝트명 : " + history[i].getName() + 
				           ", 프로젝트기간 : " + history[i].getMonth() +  " 개월");
	}
}
void getTotalHistory() {
	int sum = 0;
	for(int i = 0; i<history.length; i++) {
		sum += history[i].getMonth();
	}
	if(sum/12 == 0)
		System.out.println(name + "님의 총 경력기간은 : " + sum/12 + "년 0개월 입니다.");
	else
		System.out.println(name + "님의 총 경력기간은 : " + sum/12 + "년 " + sum%12 + "개월 입니다.");

}
}

class Project  {
	private String name;
	private int month;
	private String company;
	
	Project(String name, int month, String company){
		this.name = name;
		this.month = month;
		this.company = company;
	}
	
	public Project() {
		
	}

	String getName() { 
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getMonth() { 
		return month;
	}
	
	void setMonth(int month) { 
		this.month = month;
	}
 
}


public class report0715 {

	public static void main(String[] args) throws Exception {
		
		Project[] p = new Project[6];            //메모리 크기를 정하는 부분
		p[0] = new Project("홍길읍", 10, "개발");        //p[0] 번째 주소값
		p[1] = new Project("홍길면", 20, "진행");
		p[2] = new Project("홍길리", 30, "홍보");
		p[3] = new Project("홍길구", 40, "설치");
		p[4] = new Project("홍길동", 50, "관리");
		
		Project p1 = new Project();
		p1 = new Project("웹 개발", 2, "아마존");
		

		Programmer pg = new Programmer("안녕", 1, p1, p);
		pg.getNowProject();
		pg.joinProject(p1);
		pg.addProjectHistory(p1);
		pg.printProjectHistory();
		pg.getTotalHistory();
		
        
        
	}

}
