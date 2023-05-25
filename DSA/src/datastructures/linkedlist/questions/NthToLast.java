package datastructures.linkedlist.questions;

import datastructures.linkedlist.MySinglyLinkedList;
import datastructures.linkedlist.Node;

public class NthToLast {

    /**
     * In this approach we assumed that the size of list is known
     */
    public static int findNthToLast(MySinglyLinkedList list, int n) {
        int index = list.getSize() - n + 1;

        Node curr = list.getHead();
        for (int i=1; i<index; i++) {
            curr = curr.next;
        }

        return curr.value;
    }

    /**
     * In this approach we don't know the size of linked list
     * Two - pointer approach
     */
    public static int findNthToLast2(MySinglyLinkedList list, int n) {
        Node n1 = list.getHead();
        Node n2 = list.getHead();
        for (int i=0; i<n; i++) {
            n2 = n2.next;
        }

        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1.value;
    }

    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        list.add(23,0);
        list.add(24,0);
        list.add(25,0);
        list.add(26,0);
        list.add(27,0);
        list.add(28,0);
        list.printList();

        System.out.println(findNthToLast(list, 5));
        System.out.println(findNthToLast2(list, 5));
    }
}
