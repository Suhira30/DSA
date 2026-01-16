package org.example.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDemo {

    public static void main(String[] args) {
        //BUBBLE SORT--------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        System.out.println();
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);// int[] arr2 =arr1.clone();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorting(arr1);
        bubbleSort.sortingWithImprovement(arr2);

    }


}
