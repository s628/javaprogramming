package Week2.Day0712;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		int [] score  = {78, 80, 91, 95, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			
			if(score[i] > max) {  // ���簪�� �ִ밪�̸� �� ���� �ִ밪���� update
				max = score[i];
			} else if (score[i] < min) {  // ���簪�� �ּҰ��̸� �� ���� �ּҰ����� update
				min = score[i];
			}
		}
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);

		
	                     
		  			    
		  				 
		  				    }
		
		
	}

