package org.example.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        System.out.print("Insert at Begin: ");
        list.Display();

        System.out.println();
        list.insertAtEnd(80);
        list.insertAtEnd(39);
        list.insertAtEnd(100);
        System.out.print("Insert at End: ");
        list.Display();

        System.out.println();
        list.insertAtPos(40,0);
        list.insertAtPos(1000,1);
        list.insertAtPos(10,0);
        list.insertAtPos(500,2);
        System.out.print("Insert at Pos: ");
        list.Display();

        System.out.println();
        list.deleteAtPos(0);
        list.deleteAtPos(9);
        System.out.print("Delete at Pos: ");
        list.Display();
        System.out.println();
        list.deleteAtPos(5);
        System.out.print("Delete at Pos: ");
        list.Display();

        System.out.println();
        System.out.println(list.lowestValue());

    }
}
