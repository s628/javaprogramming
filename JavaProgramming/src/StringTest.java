
public class StringTest {

	public static void main(String[] args) {
		
		
//		String(char[] value)
		char[] c = {'H','e','l','l','o'};
		String s1 = new String(c);
		System.out.println(c);
		
//		String(StringBuffer buf)
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(sb);
		
		
//		char charAt(int index)
		String s3 = "Hello";
		char c2 = s3.charAt(1);
		System.out.println(c2);
		
		//int compareTo(String str)
		int I = "aaa".compareTo("aaa");
		System.out.println(I);
		
		
//		String concat(String str)
		String s = "Hello";
		String s4 = s.concat(" World");
		System.out.println(s4);
		
//		boolean contains(CharSequences)
		String s5 = "abcdefg";
		boolean b = s5.contains("bc");
		System.out.println(b);
		
//		boolean endsWith(String suffix) 
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");
		System.out.println(b2);
		
//		int indexOf(int ch)
		String s6 = "Hello"; 
		int idx1 = s6.indexOf('o'); // 4
		System.out.println(idx1);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//int indexOf(int ch, int pos)
		
		String s7 = "Hello"; 
		int idx2 = s.indexOf('e', 0); // 1 
		int idx3 = s.indexOf('e', 2); // -1 
		System.out.println(idx2);
		System.out.println(idx3);
		
//		int indexOf(String str)
		String s8 = "ABCDEFG"; 
		int idx4 = s.indexOf("CD"); // 2
		System.out.println(s8);
	
		//int lastIndexof(int ch)
		String s9 = "java.lang.Object"; 
		int idx5 = s.lastIndexOf('.'); // 9, index순서는 왼쪽부터
		System.out.println(idx5);
		
		//String replace(char old, char nw)
		String s10 = "Hello"; 
		String s11 = s.replace('H','C');
		System.out.println(s10);
		System.out.println(s11);
		
		
		//String replaceAll(String regex, String nw) 
		String sb2 = "AABBAABB";
		String r = sb2.replaceAll("BB","bb");
		System.out.println(r);
		
		//String replaceFirst(String regex, String nw) 
		String sb3 = "AABBAABB"; 
		String r2 = sb3.replaceFirst("BB","bb");
		System.out.println(r2);
		
		//String[] split (String regex)
		String animals1 = "dog,cat,bear";
		String[] arr1 = animals1.split(",");
		System.out.println(arr1);
		
		//String[] split(String argex, int limit)
		 String animals2 = "dog,cat,bear"; 
		 String[] arr2 = animals2.split(",",2); 
		 // arr[0]: dog, arr[1]: cat,bear
		 
		 //boolean startWith(String prefix)
		 String s12 = "java.lang.Object"; 
		 boolean b1 = s12.startsWith("java"); // true
		 System.out.println(s12);
		 
//		 String trim()
		 String s13 = "Hello World";
		 String s14 = s.trim();
		 System.out.println(s13);
		 System.out.println(s14);
		 
		 //static String valueOf(boolean b); 
//		 char/int/long/float/double/Object 
		 
		 String b3 = String.valueOf(true) ; // “true”
		 System.out.println(b3);
		 
		 //static String join(CharSequence arg0, CharSequence… arg1)
		 
		 String[] arr = {"A","B","C"}; 
		 String s15 = String.join("-", arr); // A-B-C
		 System.out.println(s15);
		 
		 //StringBuffer(String str)
		 StringBuffer sb4 = new StringBuffer("H1");
         System.out.println(sb4);
         
         //StringBuffer append(boolean b)
         StringBuffer sb5 = new StringBuffer("abc"); 
         sb5.append("abc"); // abcabc
         System.out.println(sb5);
         
         //char charAt(int index)
         StringBuffer sb6 = new StringBuffer("abc"); 
         char c3 = sb6.charAt(2);
         System.out.println(c3);
         
         //StringBuffer delete(int start, int end) 
         StringBuffer sb7 = new StringBuffer("0123456"); 
         char c4 = sb7.charAt(2);
         System.out.println(c4);
         
         //StringBuffer deleteCharAt(int index) 
         StringBuffer sb8 = new StringBuffer("0123456"); 
         char c5 = sb8.charAt(2);
         System.out.println(c5);
         
         //StringBuffer insert(int pos, boolean b) char/char[], 
         //double/float/int/long/Object/String 
         StringBuffer sb9 = new StringBuffer("0123456"); 
         sb9.insert(4, ',');
         System.out.println(sb9);
         
         //StringBuffer replace(int start, int end, String  str) 
         StringBuffer sb10 = new StringBuffer("0123456"); 
         sb10.replace(3, 6, "AB");
         System.out.println(sb10);
         
         //StringBuffer reverse()) 
         StringBuffer sb11 = new StringBuffer("0123456"); 
         sb11.reverse(); // 6543210
         System.out.println(sb11);
         
         // String substring(int start) 
         // String  substring(int start, int end)
         StringBuffer sb12 = new StringBuffer("0123456");
         String str = sb12.substring(3);
         String str2 = sb12.substring(3,5);
         System.out.println(str);
         System.out.println(str2);
         
	}

}
