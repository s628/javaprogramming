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
		// �ǽ�2 : �迭���� �̵�
//		- �Է� : 1~10
//		- ��� : [2,3,4,5,6,7,1]
		Scanner input = new Scanner(System.in);
		System.out.println("ĭ���Է�");
		int move = input.nextInt();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		report2  am = new report2 (move, arr);
		System.out.println(am.toString());









		//�ǽ�1: �Ϲ�ȭ, �߻�ȭ
		//1. Transformation �������սý���
		//�Ӽ�: �̸�, ��ռӵ�, �̵��Ÿ�, �̵�����
		//�޼ҵ�: �̵��ϴ�(��), ���峪��, �����ϴ�
		
		//2. Food : ���
		//�Ӽ�:��޹��, �̵��Ÿ�, �ҿ�ð�, ��޺�, �׸��� ����
		//�޼ҵ�:�������� ������, �׸��� ã���� �´�.
		
		//3. Transformation �߻�ȭ:
		//�Ӽ�: ������ġ, ȥ�⵵
		//�޼ҵ�: �̵��ϴ�, ȯ���ϴ�
	    //4. Food �߻�ȭ
		//�Ӽ�: �����Ÿ�
		//�޼ҵ�: ���ϴ�, ��������
		
		
		
		
		
		
		//�ǽ�2: �迭 ���� �̵�
		//�Է�: 1~10;
		//���: {2, 3, 4, 5, 6, 7, 1}
        //int[] arr = {1, 2, 3, 4, 5, 6, 7};
		//ArrayMove am = new ArrayMove(move.irr);   1234567   2345671
//		System.out.println(am);
		
		
	   

		
	
		//�ǽ�3: ���� ã��
		//Animal Ŭ������ �����Ѵ�
		//�����ڷ� AnimalType�� �Ķ���� �޴´�
		//bark() �޼��带 ���� ������ ¢�� �Ҹ��� ����Ѵ� Dog�� �۸�, Cat�� �߿�
		//���� Dog�� Cat�� Ŭ������ �����ϴµ� ���� �߰��� �� ����.
	

   
		
		
		
	}
}


		
		
		
		

	
	


		
