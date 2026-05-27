package org.example.CodingPractice;

import java.util.Scanner;

public class Swap {

    /*
    swap two numbers without using a third variable in Java?
    02 ways
        1. Addition,subtraction --- not good
        2.XOR----- BEST
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Before swap: a=" + a);
        System.out.println("Before swap: b=" + b);

        //1. Addition,subtraction
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a=" + a);
        System.out.println("After swap: b=" + b);

        //2. XOR
        System.out.println("Enter the first number(XOR method)");
        int c = sc.nextInt();
        System.out.println("Enter the second number(XOR method)");
        int d = sc.nextInt();
        System.out.println("Before swap(XOR method) c=:" + c);
        System.out.println("Before swap(XOR method) d=:" + d);
        c=c^d;
        d=c^d;
        c=c^d;
        System.out.println("After swap (XOR method) c=:" + c);
        System.out.println("After swap (XOR method) d=:" + d);

    }
}
