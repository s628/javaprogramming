package Week2.Day0712;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		 int [] score  = {78, 80, 91, 95, 100, 55, 95};
		  // ����
		    Arrays.sort(score);
		   
		    reverseArrayInt(score);   // �迭 ���� �Ųٷ�

		    System.out.println(Arrays.toString(score));  // ���� �������� ���� �迭�� ���ڿ��� ��ȯ �� ���
		   
		  }
		  public static void reverseArrayInt(int[] array) {
		    int temp;

		    for (int i = 0; i < array.length / 2; i++) {
		      temp = array[i];
		      array[i] = array[(array.length - 1) - i];
		      array[(array.length - 1) - i] = temp;
		    }
		  }


		}


	


