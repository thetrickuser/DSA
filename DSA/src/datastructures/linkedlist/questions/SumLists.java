package datastructures.linkedlist.questions;

import datastructures.linkedlist.MySinglyLinkedList;
import datastructures.linkedlist.Node;

public class SumLists {
    public static MySinglyLinkedList sumList(MySinglyLinkedList list1, MySinglyLinkedList list2) {
        int num1 = 0, num2 = 0;
        Node curr = list1.getHead();

        while (curr != null) {
            num1 = (num1 * 10) + curr.value;
            curr = curr.next;
        }

        curr = list2.getHead();

        while (curr != null) {
            num2 = (num2 * 10) + curr.value;
            curr = curr.next;
        }

        int sum = num2 + num1;
        MySinglyLinkedList resultList = new MySinglyLinkedList();
        for (; sum > 0;) {
            int r = sum % 10;
            resultList.add(r,0);
            sum /= 10;
        }

        return resultList;
    }

    public static void main(String[] args) {
        MySinglyLinkedList list1 = new MySinglyLinkedList();
        list1.add(2,0);
        list1.add(9,0);
        list1.add(4,0);
        list1.add(8,0);
        list1.printList();

        MySinglyLinkedList list2 = new MySinglyLinkedList();
        list2.add(3,0);
        list2.add(6,0);
        list2.add(7,0);
        list2.add(5,0);
        list2.printList();

        MySinglyLinkedList resultList = sumList(list1, list2);
        resultList.printList();
    }
}
