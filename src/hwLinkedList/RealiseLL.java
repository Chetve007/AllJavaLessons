package hwLinkedList;
import hwLinkedList.SinglyLinkedList.ListNode;
public class RealiseLL {

	public static void main(String[] args) {
		
		ListNode one = new ListNode(20);
		ListNode two = new ListNode(30);
		ListNode three = new ListNode(40);
		ListNode four = new ListNode(50);
		ListNode five = new ListNode(60);
		ListNode six = new ListNode(70);
		
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.display(one);
		System.out.println(singlyLinkedList.length(one));
		ListNode newNodeOne = singlyLinkedList.insertAtBeginning(one, 10);
		singlyLinkedList.display(newNodeOne);
		System.out.println(singlyLinkedList.length(newNodeOne));
		singlyLinkedList.insertAtPosition(newNodeOne, 55, 5);
		singlyLinkedList.display(newNodeOne);
		System.out.println(singlyLinkedList.length(newNodeOne));
		singlyLinkedList.deleteAtPosition(newNodeOne, 5);
		singlyLinkedList.display(newNodeOne);
		System.out.println(singlyLinkedList.length(newNodeOne));
//		singlyLinkedList.reverse(newNodeOne);
		
	}

}
