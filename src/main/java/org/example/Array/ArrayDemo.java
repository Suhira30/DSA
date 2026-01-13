package org.example.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        //Ways of declare and initialize arrays
        int[] arr1 = {10, 20, 55, 12, 5, 40, 11, 3};
        int[] arr2 = new int[]{50, 74, 89, 12, 56, 3, 45, 10};
        int[] arr3 = new int[arr1.length];
        System.out.println("Array 1 is " + Arrays.toString(arr1));

        System.out.print("Array 1 th : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Array 2 th : ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Array 3rd : ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();

        //1. Find The Lowest Value in an Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter"+i +" number : ");
            arr[i - 1] = sc.nextInt();
        }
        //using static method call findLowestValue method or create object to Array class , using that object call findLowestMethod method passing array
        Array arrayObj = new Array();
        arrayObj.findLowestValue(arr);
    }
}
