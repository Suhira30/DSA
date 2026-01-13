package org.example.Sorting;

import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        System.out.println();
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorting(arr);
        bubbleSort.sortingWithImprovement(arr);
    }

}
