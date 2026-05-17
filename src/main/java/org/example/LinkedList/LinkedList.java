package org.example.LinkedList;

public class LinkedList {

    Node head;
//    Insert at end
     public void insertAtEnd(int data) {
         Node newNode = new Node(data);
         if(head==null){
             head=newNode;
             return;
         }
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
         temp.next=newNode;
     }

//     Insert At Begin
    public void insertAtBegin(int data) {
         Node newNode = new Node(data);
         newNode.next=head;
         head=newNode;
    }
//Traversal
    public void Display() {
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
    }
    //Insert at middle
    public void insertAtPos(int data,int pos) {
         Node newNode = new Node(data);

         //position can be zero , normally using JAVA we called starting node position as 0
         if(pos==0){
             //insert at begin
             newNode.next=head;
             head=newNode;
             return;
         }
         Node temp=head;
         int i=0;
         while(i<pos-1){
             temp=temp.next;
             i++;
         }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //delete at begin
    public void deleteAtPos(int pos) {
         //begin
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<pos-1&&temp.next.next!=null){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
//
//        //End
//        Node temp =head;
//        while(temp.next.next!=null){
//            temp=temp.next;
//        }
//        temp.next=null;
    }

//    //Traversal
//    public void traverse(){
//         Node temp=head;
//         System.out.println("Traversal of Linked List");
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//         }
//    }

}
