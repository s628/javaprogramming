package Week2.Day0717;

public class SearchTest {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");     //insert
		list.insertLastNode("월");
		list.insertLastNode("수");
		list.insertLastNode("일");
		list.printList();
		System.out.println();
		

		System.out.println("(2) \"수\"노드 뒤에 \"금\" 노드 삽입하기");     //뒤에 추가
		ListNode pre = list.searchNode("수");
		if (pre == null) {
		System.out.println("검색 실패 >> 찾는 데이터가 없습니다.");           
		} else {
			list.insertMiddleNode(pre, "금");
		}
		list.printList();
		System.out.println();
		
		

		System.out.println("(3) 리스트의 첫번째에 노드 추가하기");       //첫번째에 추가
		list.insertFirstNode("토");
		list.printList();
		System.out.println();
		

		System.out.println("(4) 리스트의 마지막 노드 삭제하기");          // 마지막 삭제
		list.deleteLastNode();
		list.printList();
		System.out.println();
		
		
		System.out.println("(5) 리스트의 중간 노드 \"수\" 삭제하기");      //중간 삭제
		list.deleteFirstNode();
		list.printList();
		System.out.println();
		
 
		System.out.println("(6) 리스트의 첫번째에 노드 삭제하기");          //첫번째 삭제
		list.deleteFirstNode();
		list.printList();
		System.out.println();
		

		System.out.println("(7) 리스트 역순으로 출력하기");             //역순
		list.reverseList();
		list.printList();
		System.out.println();
	}

}

class ListNode {
	String data;
	ListNode next;

	public ListNode() {
		this.data = null;
		this.next = null;
	}

	public ListNode(String data) {
		this.data = data;
		this.next = next;
	}

	public ListNode(String data, ListNode next) {
		this.data = data;
		this.next = next;
		this.next = null;
	}

	public String getData() {
		return this.data;

	}
}

class LinkedList {               //head는 시작점일뿐   다음 지점이 비어있으면 값을 넣어준다
	
	private ListNode head;

	public LinkedList() {
		this.head = null;
	}

	void insertLastNode(String str) {
		ListNode node = new ListNode(str);

		if (head == null) {
			head = node;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = node;
		}
	}

	void insertMiddleNode(ListNode pre, String str) {
		ListNode node = new ListNode(str);

		if (head == null) {
			head = node;
		} else {
			ListNode current = head;
			while (current.next != pre) {
				current = current.next;
			}
			current = current.next;
			node.next = current.next;
			current.next = node;
		}
	}

	void insertFirstNode(String str) {
		ListNode node = new ListNode(str);

		if (head == null) {
			head = node;
		} else {
			ListNode current = head;
			node.next = current;
			head = node;
		}
	}

	void deleteLastNode() {

		if (head == null) {
			System.out.println("지울 노드가 존재하지 않습니다.");
		} else {
			ListNode prev = head;
			ListNode current = head.next;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			prev.next = null;
		}
	}

	void deleteMiddleNode(String str) {

		ListNode node = new ListNode(str);
		if (head == null) {
			System.out.println("지울 노드가 존재하지 않습니다.");
		} else {
			ListNode prev = head;
			ListNode current = head.next;
			while (current.data != node.data) {
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		}
	}
	
	void deleteFirstNode() {

		if (head == null) {
			System.out.println("지울 노드가 존재하지 않습니다.");
		} else {
			head = head.next;
		}
	}

	ListNode searchNode(String str) {
		
		ListNode node = new ListNode(str);
		if (head == null) {
			System.out.println("노드가 비어있습니다.");
			return null;
		} else {

			ListNode current = head;
			while (current.data != node.data) {
				current = current.next;
			}
			return current;
		}
	}

	void reverseList() {

		ListNode next = head;
		ListNode current = null;
		ListNode prev = null;
		while (next != null) {

			prev = current;
			current = next;
			next = next.next;
			current.next = prev;
		}
		head = current;
	}

	void printList() {

		if (head == null) {
			System.out.println("출력할 리스트가 존재하지 않습니다.");
		} else {
			ListNode current = head;
			System.out.print("[");
			while (current.next != null) {

				System.out.print(current.data + " ");
				current = current.next;
				
			}
			
			System.out.print(current.data);
			System.out.print("]");
			System.out.println();

		}

	}

}
