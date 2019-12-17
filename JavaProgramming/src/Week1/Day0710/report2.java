package Week1.Day0710;




import java.util.Scanner;

public class report2 {

	private int move;
	private int arr[];

	public report2 (int move, int arr[]) {
		this.move = move;
		this.arr = arr;
		ArrMove();
	}

	public void ArrMove() {
		for (int y = 0; y < move; y++) {
			int temp;
			temp = arr[0];
			for (int x = 1; x < arr.length; x++) {
				arr[x - 1] = arr[x];
			}
			arr[arr.length - 1] = temp;
		}
	}

	public String toString() {
		return arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6] + " ";
	}
	
	public static void main(String[] args) {
		// 실습2 : 배열원소 이동
//		- 입력 : 1~10
//		- 출력 : [2,3,4,5,6,7,1]
		Scanner input = new Scanner(System.in);
		System.out.println("칸수입력");
		int move = input.nextInt();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		report2  am = new report2 (move, arr);
		System.out.println(am.toString());









		//실습1: 일반화, 추상화
		//1. Transformation 교통통합시스템
		//속성: 이름, 평균속도, 이동거리, 이동수단
		//메소드: 이동하다(추), 고장나다, 수리하다
		
		//2. Food : 배달
		//속성:배달방법, 이동거리, 소요시간, 배달비, 그릇의 종류
		//메소드:초인종을 누르다, 그릇을 찾으러 온다.
		
		//3. Transformation 추상화:
		//속성: 현재위치, 혼잡도
		//메소드: 이동하다, 환승하다
	    //4. Food 추상화
		//속성: 먹을거리
		//메소드: 상하다, 떨어지다
		
		
		
		
		
		
		//실습2: 배열 원소 이동
		//입력: 1~10;
		//출력: {2, 3, 4, 5, 6, 7, 1}
        //int[] arr = {1, 2, 3, 4, 5, 6, 7};
		//ArrayMove am = new ArrayMove(move.irr);   1234567   2345671
//		System.out.println(am);
		
		
	   

		
	
		//실습3: 동물 찾기
		//Animal 클래스를 설계한다
		//생성자로 AnimalType을 파라미터 받는다
		//bark() 메서드를 통해 동물의 짖는 소리를 출력한다 Dog는 멍멍, Cat는 야옹
		//현재 Dog와 Cat의 클래스만 존재하는데 향후 추가될 수 없다.
	

   
		
		
		
	}
}


		
		
		
		

	
	


		
