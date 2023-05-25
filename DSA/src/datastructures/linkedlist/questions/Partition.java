package datastructures.linkedlist.questions;

import datastructures.linkedlist.MySinglyLinkedList;
import datastructures.linkedlist.Node;

public class Partition {

    /**
     * partition using second list
     */
    public static MySinglyLinkedList partition(MySinglyLinkedList list, int x) {
        MySinglyLinkedList partitionList = new MySinglyLinkedList();
        Node curr = list.getHead();

        while (curr != null) {
            if (curr.value < x) {
                partitionList.add(curr.value, 0);
            } else {
                partitionList.add(curr.value, partitionList.getSize());
            }
            curr = curr.next;
        }

        return partitionList;
    }

    /**
     * partition in place
     */
    public static void partitionInPlace(MySinglyLinkedList list, int x) {

        Node curr = list.getHead();
        list.tail = list.head;

        while (curr != null) {
            Node next = curr.next;
            if (curr.value < x) {
                curr.next = list.head;
                list.head = curr;
            } else {
                list.tail.next = curr;
                list.tail = curr;
            }
            curr = next;
        }
        list.tail.next = null;
    }

    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.add(2,0);
        list.add(9,0);
        list.add(4,0);
        list.add(8,0);
        list.add(3,0);
        list.add(6,0);
        list.add(7,0);
        list.add(5,0);

        list.printList();

        MySinglyLinkedList list2 = partition(list, 5);
        list2.printList();

        partitionInPlace(list, 5);
        list.printList();
    }
}
