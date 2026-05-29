package org.example.LinkedList;

public class DoublyLinkedList {

    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;

        }
    }

    public void insertAtEnd(int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

    }

    public void insertAtPos(int data, int pos) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        DoublyLinkedListNode temp = head;
        int i = 1;
        if (pos == 1) {
            insertAtBeginning(data);
        } else {
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            if (temp.next == null) {
                insertAtEnd(data);
            } else {
                temp.next.prev = node;
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
            }
        }
    }

    public void deletionAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            System.out.println("List have only one node -> going to delete");
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            System.out.println("List have only one node -> going to delete");
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }


    public void deleteAtPos(int pos) {
        if (pos == 1) {
            deletionAtBegin();
            return;
        } else {
            int i = 1;
            DoublyLinkedListNode temp = head;
            while (temp != null && i <= pos - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            if (temp.next == null) {
                deleteAtEnd();
                return;
            }
            //go to the node which is wanted to delete
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

        }
    }

    //Display
    public void display() {
        //Forward Traversal
        DoublyLinkedListNode temp = head;
        System.out.print("Forward traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        //Backward traversal
        temp = tail;
        System.out.print("Backward traversal: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
