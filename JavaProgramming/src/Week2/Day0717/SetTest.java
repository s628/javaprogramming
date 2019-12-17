package Week2.Day0717;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		{
			HashSet set1 = new HashSet();
			set1.add("apple");
			set1.add("banana");
			System.out.println(set1.add("apple"));
			System.out.println("contains :" + set1.contains("apple"));
			//�߰�, ����
			
			HashSet set2 = (HashSet) set1.clone();
			set2.add("melon");
			set2.remove("apple");
			System.out.println("set2 :" + set2);
			
			//������, Collection Add, �ߺ����� �ʰ� set�� ������ result�� add��Ų��
			HashSet result  = (HashSet) set1.clone();
			result.addAll(set2);
			System.out.println("addAll :" + result);
			
			//������, result���� �� set�� �ִ� ���� �����.
			result = (HashSet)set1.clone();
			System.out.println("result : " + result);
			result.retainAll(set2);
			System.out.println("retainsAll :" + result);
			
			//������, result���� �� set2�� �ִ� ���� �����Ѵ�.
			result = (HashSet) set1.clone();
			result.removeAll(set2);
			System.out.println("removeAll :" + result);
		}

	}

}
