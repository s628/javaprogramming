package Week1.Day0711;

public class Break문예제 {

	public static void main(String[] args) {
		 int sum = 0;
		  int i   = 0;

		  while(true) {
		   if(sum > 100)
		    break;
		   ++i;
		   sum += i;
		  } // end of while

		  System.out.println("i=" + i);
		  System.out.println("sum=" + sum);

		 }   

		}

	
