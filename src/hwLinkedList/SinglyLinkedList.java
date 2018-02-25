package hwLinkedList;
public class SinglyLinkedList {

	// inner class
	public static class ListNode {
		public int data;
		public ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = next;
		}
	}
	
	public ListNode insertAtBeginning(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public void display(ListNode head) {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public int length(ListNode head) {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public ListNode deleteAtPosition(ListNode head, int position) {
		int size = length(head);
		if(position > size || position < 1) {
			System.out.println("Invalid position.");
			return head;
		}
		if(position == 1) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
			return current;
		}
	}
	
	public ListNode insertAtPosition(ListNode head, int data, int position) {
		int size = length(head);
		if(position > size + 1 || position < 1) {
			System.out.println("Invalid position.");
			return head;
		}
		ListNode newNode = new ListNode(data);
		if(position == 1) {
			newNode.next = head;
			return newNode;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
			return head;
		}
	}	
	
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			System.out.print(current.data + " --> ");
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
}


















