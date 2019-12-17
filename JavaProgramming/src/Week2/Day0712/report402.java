package Week2.Day0712;



abstract class Book {
	private int number;
	private String title;
	private String author;
	abstract int getLateFee(int day);

	public Book() {
		this.number = 0;      //�ʱ�ȭ
		this.title = "";
		this.author = "";
	}
	
	int getMethod(){
		return this.number;
	}
	void setMethod(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}

public boolean equals(Book book) {
	if (book !=null && book instanceof Book) {
	return number == ((Book)book).number;
	} else {
		return false;
	}
}
}
class Animation extends Book{
	@Override
	int getLateFee(int day) {
		
		return 300*day;
	}
}
class Science extends Book{
	@Override
	int getLateFee(int day) {
		return 200*day;
	}
}


public class report402 {

	public static void main(String[] args) {
		// �ǽ� 2
		// å�� �뿩���ִ� ��ü�� ���� Book�̶�� Ŭ������ �ۼ��Ѵ�
		// Book�� �����ڹ�ȣ(number), ����(title), ����(author)���ʵ�� ������
		// Book Ŭ������ ������(GetMethod)�� ������(SetMethod)�� ������.
		// ObjectŬ������ equals() �޼ҵ带 ������ �ؼ� ������ ��ȣ�� �����ϸ� ������
		// å���� �����Ѵ�.
		// Book���κ��� ��ӹ��� Animation,Science Ŭ������ �ۼ��Ѵ�
		// �̵� Ŭ������ ��ü�� ��¥�� ���� ��ü�Ḧ ����ϴ� getLateFee()�޼ҵ带
		// �������Ѵ�. ��ü���Animation�� 300��/��,Science�� 200��/�� �̴�
		// Ŭ���� Book, Animation, Science�� �ۼ��϶�
		Animation am = new Animation();
		am.setMethod(1, "�ظ�����", "���طѸ�");
		Science sc = new Science();
		sc.setMethod(2, "��������", "ȫ�浿");
		
		System.out.println("å ��ȣ:" + am.getMethod());
		System.out.println("å ��ȣ:" + sc.getMethod());
		System.out.println("�ظ����� ��ü��:" + am.getLateFee(2));
		System.out.println("�������� ��ü��:" + sc.getLateFee(3));
		System.out.println("�� å�� ��ȣ ��:" + am.equals(sc));
	}

}
