package Week2.Day0712;

public class ClassTest extends Object{     //Object�� �ڵ� ���

	
		private int[] sub;
		private float avg;
		
		public ClassTest() {
			sub = new int[4];
			avg = 0.0f;
		}
		
		public void calc() {
			int tot = 0;
			 for (int a = 0; a < sub.length; a++) {
				 tot +=sub[a];
			 }
			 avg = tot / sub.length;
		}
		
		public static class ClassTest_Inner{
			private String[] subname =  { "����", "����", "����"};
			
			public String getSubname(int x) {
				return subname[x];
			}
		}
	
	
	public static void main(String[] args) {
      

		
	}

}
