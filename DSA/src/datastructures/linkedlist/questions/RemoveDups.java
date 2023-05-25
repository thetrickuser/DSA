package datastructures.linkedlist.questions;

import datastructures.linkedlist.DoublyNode;
import datastructures.linkedlist.MyDoublyLinkedList;
import datastructures.linkedlist.MySinglyLinkedList;
import datastructures.linkedlist.Node;

import java.util.HashSet;

public class RemoveDups {

    public static void removeDuplicates(MyDoublyLinkedList list) {
        HashSet<Integer> set = new HashSet<>();

        DoublyNode curr = list.getHead();

        while (curr != null) {
            if (set.contains(curr.value)) {
                curr.prev.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
            } else {
                set.add(curr.value);
            }

            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.add(1,0);
        list.add(2,0);
        list.add(3,0);
        list.add(2, 0);
        list.add(5, 0);
        list.printList();
        removeDuplicates(list);
        list.printList();
    }
}
