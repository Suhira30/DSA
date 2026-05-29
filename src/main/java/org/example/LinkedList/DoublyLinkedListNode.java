package org.example.LinkedList;

public class DoublyLinkedListNode {

    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;// don't need to assign this to null= automatically these will assign to null by JVM
        this.prev = null;
    }


}
