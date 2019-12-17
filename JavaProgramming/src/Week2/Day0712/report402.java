package Week2.Day0712;



abstract class Book {
	private int number;
	private String title;
	private String author;
	abstract int getLateFee(int day);

	public Book() {
		this.number = 0;      //초기화
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
		// 실습 2
		// 책을 대여해주는 업체를 위한 Book이라는 클래스를 작성한다
		// Book는 관리자번호(number), 제목(title), 저자(author)를필드로 가진다
		// Book 클래스는 접근자(GetMethod)와 설정자(SetMethod)를 가진다.
		// Object클래스의 equals() 메소드를 재정의 해서 관리자 번호가 동일하면 동일한
		// 책으로 간주한다.
		// Book으로부터 상속받은 Animation,Science 클래스를 작성한다
		// 이들 클래스는 연체된 날짜에 따라서 연체료를 계산하는 getLateFee()메소드를
		// 재정의한다. 연체료는Animation은 300원/일,Science는 200원/일 이다
		// 클래스 Book, Animation, Science를 작성하라
		Animation am = new Animation();
		am.setMethod(1, "해리포터", "조앤롤링");
		Science sc = new Science();
		sc.setMethod(2, "지구과학", "홍길동");
		
		System.out.println("책 번호:" + am.getMethod());
		System.out.println("책 번호:" + sc.getMethod());
		System.out.println("해리포터 연체료:" + am.getLateFee(2));
		System.out.println("지구과학 연체료:" + sc.getLateFee(3));
		System.out.println("두 책의 번호 비교:" + am.equals(sc));
	}

}
