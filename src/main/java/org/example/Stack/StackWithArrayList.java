package org.example.Stack;

import java.util.ArrayList;

public class StackWithArrayList {

    ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        StackWithArrayList stack = new StackWithArrayList();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();
        stack.display();

        stack.pop();
        System.out.println();
        stack.display();

        System.out.println();
        stack.peek();

       System.out.println(stack.isEmpty());

    }

    public void push(int value) {
        arrayList.add(value);
    }

    public void pop() {
        arrayList.remove(arrayList.size() - 1);
    }

    public void peek() {
        int result=arrayList.get(arrayList.size() - 1);
        System.out.println(result);
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
    public void display(){
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}
