package org.example.LinkedList;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("Insertion At Beginning:............");
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.display();

        System.out.println();
        System.out.println();
        System.out.println("Insertion At End:..............");
        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);
        list.display();

        System.out.println();
        System.out.println();
        System.out.println("Insertion At Position:..............");
        list.insertAtPos(999, 4);
        list.display();

        System.out.println();
        System.out.println();
        System.out.println("Deletion At Begin:..............");
        list.deletionAtBegin();
        list.display();

        System.out.println();
        System.out.println();
        System.out.println("Deletion At End:..............");
        list.deleteAtEnd();
        list.display();

        System.out.println();
        System.out.println();
        System.out.println("Deletion At End:..............");
        list.deleteAtPos(4);
        list.display();
    }
}
