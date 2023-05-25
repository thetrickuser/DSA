package datastructures.linkedlist;

public class LinkedListRunner {
	public static void main(String[] args) {
//		MySinglyLinkedList sll = new MySinglyLinkedList();
//		System.out.println(sll.isPresent(89));
//		
//		sll.add(12, 0);
//		sll.printList();
//		sll.add(21, 0);
//		sll.printList();
//		sll.add(31,1);
//		sll.add(42,2);
//		sll.add(23,3);
//		sll.add(89,4);
//		sll.add(34,5);
//		sll.printList();
//		sll.add(34, 3);
//		sll.printList();
//		
//		System.out.println(sll.isPresent(89));
//		
//		sll.deleteAtIndex(0);
//		sll.printList();
//		sll.deleteAtIndex(sll.size - 1);
//		sll.printList();
//		sll.deleteAtIndex(3);
//		sll.printList();
//		System.out.println(sll.head.next.value);
		
//		MyCircularSinglyLinkedList csll = new MyCircularSinglyLinkedList();
//		csll.add(23, 7);
//		csll.printList();
//		csll.add(34, 1);
//		csll.add(30, 0);
//		csll.printList();
//		csll.add(32, 1);
//		csll.printList();
//		csll.add(45, 10);
//		csll.add(54, 11);
//		csll.add(64, 12);
//		csll.printList();
//		csll.deleteAtIndex(0);
//		csll.printList();
//		csll.deleteAtIndex(csll.size - 1);
//		csll.printList();
//		csll.deleteAtIndex(2);
//		csll.printList();
		
//		MyDoublyLinkedList dll = new MyDoublyLinkedList();
//		dll.add(23, 45);
////		dll.add(24, 32);
////		dll.add(35, 0);
////		dll.add(90, 1);
//		dll.printList();
//		dll.deleteAtIndex(0);

		MyCircularDoublyLinkedList cdll = new MyCircularDoublyLinkedList();
		cdll.add(2,3);
		cdll.printList();
		cdll.add(23,1);
		cdll.add(34,0);
		cdll.add(32,1);
		cdll.printList();
		cdll.deleteAtIndex(2);
		cdll.printList();
		cdll.deleteList();
		cdll.printList();
		
		
		
		
	}

}
