package Week1.Day0709;

import java.util.Arrays;

public class Clone {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		//�迭 arr�� �����ؼ� ���� ������ ���ο� �迭�� �����.
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
