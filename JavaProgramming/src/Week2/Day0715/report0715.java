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
		throw new Exception("Project History�� 5������ �����մϴ�.");
	}
}
void getNowProject() {
	 System.out.println(name +"�� ���� ���� ���� Project�� " + now.getName() + " �Դϴ�.");
}

void printProjectHistory() {
	for (int i = 0; i < history.length; i++) {
		System.out.println(" ������Ʈ�� : " + history[i].getName() + 
				           ", ������Ʈ�Ⱓ : " + history[i].getMonth() +  " ����");
	}
}
void getTotalHistory() {
	int sum = 0;
	for(int i = 0; i<history.length; i++) {
		sum += history[i].getMonth();
	}
	if(sum/12 == 0)
		System.out.println(name + "���� �� ��±Ⱓ�� : " + sum/12 + "�� 0���� �Դϴ�.");
	else
		System.out.println(name + "���� �� ��±Ⱓ�� : " + sum/12 + "�� " + sum%12 + "���� �Դϴ�.");

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
		
		Project[] p = new Project[6];            //�޸� ũ�⸦ ���ϴ� �κ�
		p[0] = new Project("ȫ����", 10, "����");        //p[0] ��° �ּҰ�
		p[1] = new Project("ȫ���", 20, "����");
		p[2] = new Project("ȫ�渮", 30, "ȫ��");
		p[3] = new Project("ȫ�汸", 40, "��ġ");
		p[4] = new Project("ȫ�浿", 50, "����");
		
		Project p1 = new Project();
		p1 = new Project("�� ����", 2, "�Ƹ���");
		

		Programmer pg = new Programmer("�ȳ�", 1, p1, p);
		pg.getNowProject();
		pg.joinProject(p1);
		pg.addProjectHistory(p1);
		pg.printProjectHistory();
		pg.getTotalHistory();
		
        
        
	}

}
