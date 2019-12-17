package Week2.Day0712;

import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		int [] score  = {78, 80, 91, 95, 100, 55, 95};
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			
			if(score[i] > max) {  // 현재값이 최대값이면 그 값을 최대값으로 update
				max = score[i];
			} else if (score[i] < min) {  // 현재값이 최소값이면 그 값을 최소값으로 update
				min = score[i];
			}
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);

		
	                     
		  			    
		  				 
		  				    }
		
		
	}

