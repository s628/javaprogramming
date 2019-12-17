package Week2.Day0712;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		 int [] score  = {78, 80, 91, 95, 100, 55, 95};
		  // 정렬
		    Arrays.sort(score);
		   
		    reverseArrayInt(score);   // 배열 순서 거꾸로

		    System.out.println(Arrays.toString(score));  // 순서 뒤집어진 정수 배열을 문자열로 변환 후 출력
		   
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


	


