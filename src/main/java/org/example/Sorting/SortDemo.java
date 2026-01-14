package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        System.out.println();
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorting(arr1);
        bubbleSort.sortingWithImprovement(arr1);

        //SELECTION SORT--------------------------------------------------------------------------------
        System.out.print("Enter the size of the array: ");
        System.out.println();
        int x = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        Integer[] arr2= new Integer[x];
        for (int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Before sorting : "+Arrays.toString(arr2));
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(arr2));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSortingUsingAddRemove(myArray);
    }


}
