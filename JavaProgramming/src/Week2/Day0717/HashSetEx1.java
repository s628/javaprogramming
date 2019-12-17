package Week2.Day0717;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet�� objArr�� ��ҵ��� �����Ѵ�.
		} // HashSet�� ����� ��ҵ��� ����Ѵ�.
		System.out.println(set);
		
		
	}
}

class HashSetLotto {
	public static void main(String[] args) 
	
{ 
		Set set = new HashSet();

	for(int i = 0;set.size()<6;i++)
	{
		int num = (int) (Math.random() * 45) + 1;
		set.add(new Integer(num));
	}
	List list = new LinkedList(set); // LinkedList(Collection c) 
	Collections.sort(list); // Collections.sort(List// list) 
	System.out.println(list);
}
}
