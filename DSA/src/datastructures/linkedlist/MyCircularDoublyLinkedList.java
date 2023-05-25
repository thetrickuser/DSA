package datastructures.linkedlist;

public class MyCircularDoublyLinkedList {
	
	DoublyNode head;
	DoublyNode tail;
	int size;
	
	public MyCircularDoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void add(int value, int location) {
		DoublyNode node = new DoublyNode();
		node.value = value;
		
		if (head == null) {
			head = node;
			tail = node;
			tail.next = head;
			head.prev = tail;
		} else if (location == 0) {
			head.prev = node;
			node.next = head;
			head = node;
			tail.next = head;
			head.prev = tail;
		} else if (location >= size) {
			tail.next = node;
			node.prev = tail;
			tail = node;
			tail.next = head;
			head.prev = tail;
		} else {
			DoublyNode currNode = head;
			int curr = 0;
			while (curr < location) {
				currNode = currNode.next;
				curr++;
			}
			
			node.prev = currNode.prev;
			currNode.prev.next = node;
			currNode.prev = node;
			node.next = currNode;
		}
		
		size++;
	}
	
	public void printList() {
		if (head != null) {
			DoublyNode curr = head;
			int currIndex = 0;
			while (curr != null && currIndex <= size - 1) {
				System.out.println(curr.value);
				curr = curr.next;
				currIndex++;
			}
		}
		System.out.println("------------------------");
	}
	
	public boolean isPresent(int searchValue) {
		if (head == null) return false;
		
		DoublyNode currNode = head;
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
				head.prev = null;
			}
		} else {
			if (index == size - 1) {
				tail = tail.prev;
				tail.next = null;
			} else {
				DoublyNode currNode = head;
				int curr = 0;
				while (curr < index) {
					currNode = currNode.next;
					curr++;
				}
				
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;				
			}
		}
		
		size--;
	}
	
	public void deleteList() {
		DoublyNode curr = head.next;
		for (int i=1; i<size; i++) {
			curr.prev = null;
		}
		head = null;
		tail = null;
		size = 0;
	}
	
	
	

}
