package Week1.Exception;

public class Exception3 {

	public static void main(String[] args) {
		try { 
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;  //���ܸ� �߻���Ŵ
			//throw new Exception ("���Ƿ� �߻�������.");
		}catch (Exception e ) {
			System.out.println("���� �޽���:" + e.getMessage()); //�߻��� ���� Ŭ������ �ν��Ͻ��� ����� �޽����� ����
			e.printStackTrace();     //���ܹ߻� ����� call stack�� �־��� �޼����� ������ ���� �޽����� ���
		}
             System.out.println("���α׷��� ���� ����Ǿ���.");
	}

}
