package datastructures.linkedlist;

public class MySinglyLinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public MySinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void add(int value, int location) {
		Node node = new Node();
		node.value = value;
		
		if (head == null) {
			head = node;
			tail = node;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node currNode = head;
			int curr = 1;
			while (curr < location) {
				currNode = currNode.next;
				curr++;
			}
			
			node.next = currNode.next;
			currNode.next = node;
		}		

		size++;
	}
	
	public void printList() {
		if (head != null) {
			Node curr = head;
			while (curr != null) {
				System.out.println(curr.value);
				curr = curr.next;
			}
		}
		System.out.println("------------------------");
	}
	
	public boolean isPresent(int searchValue) {
		if (head == null) return false;
		
		Node currNode = head;
		while (currNode != null) {
			if (currNode.value == searchValue) return true;
			currNode = currNode.next;			
		}
		
		return false;
	}
	
	public void deleteAtIndex(int index) {
		if (head == null || index >= size) return;
		
		if (index == 0) {
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				head = head.next;	
			}
		} else {
			Node currNode = head;
			int curr = 1;
			while (curr < index) {
				currNode = currNode.next;
				curr++;
			}
			if (index == size - 1) {
				currNode.next = null;
				tail = currNode;
			} else {
				Node nextNode = currNode.next;
				currNode.next = nextNode.next;
			}				
		}
		
		size--;
	}
	
	public void deleteList() {
		head = null;
		tail = null;
		size = 0;
	}

}
