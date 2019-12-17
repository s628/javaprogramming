package Week2.Day0716;

import java.text.MessageFormat;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This \t is a \n String"); 
		while (st.hasMoreTokens()) System.out.println(st.nextToken()); 
		System. out .println("============================================="); 

		//���ڷ� �־��� ���ڿ��� :�� �����ڷμ� �����Ѵ�.
		String str = "80::95:70";
		StringTokenizer st2 = new StringTokenizer(str, ":", false);
		int i = 0 ;
				while(st2.hasMoreTokens()) {
					System.out.println(i + ":" + st2.nextToken());
					i++;
				}
		System. out .println("============================================="); 

		//StringTokenizer�� �����ڳ��� �پ��ִ� ��� ���� ���� ������ ���� ���ϴ� ��찡 �ִ�.
		String[] result = str.split(":");
		for( int x = 0; x < result.length; x++) {
			System.out.println(x + ":" + result[x]);
		}
		System. out .println("============================================="); 
		// ������ split�� �������� �����ڰ� ���� �� �̸� ó������ ���� => 2���� ���ڸ� �޴� split��� 
		
		String str2 = "81-2-010-1234-5678"; 
		String[] arr2 = str2.split("-", 4); 
		for( int x = 0; x < arr2.length; x++ ) { 
			System.out.println(x+":"+arr2[x] ); 
			} 
		
		
		//MessageFormat
		String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";
		Object[] arguments = { "���ڹ�","02-123-1234", "27", "07-09" };
		String result2 = MessageFormat.format(msg, arguments); 
		System.out.println(result2);

		}
		
}
