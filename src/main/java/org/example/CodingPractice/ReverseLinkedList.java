package org.example.CodingPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class ReverseLinkedList {

    public static void main(String[] args) {
        /*
        How do you reverse a linked list in Java
        */
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);

        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        LinkedList<Integer> list3 = new LinkedList<Integer>();

        System.out.println("Enter the elements of the LinkedList: ");
        while (!(list3.size() == 5)) {//size of the linkedlist is 5
            list3.add(sc.nextInt());
        }


        System.out.print("List 1 revered: ");
        reverse(l);
        System.out.println();
        System.out.print("List 2 revered: ");
        reverse(list2);
        System.out.println();
        System.out.print("List 3 revered: ");
        reverse(list3);



    }

    public static void reverse(LinkedList<Integer> list) {
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

}

