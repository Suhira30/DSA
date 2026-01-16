package org.example.Sorting;

import java.util.Scanner;

public class InsertionSortDemo {

    public static void main(String[] args) {
        //INSERTION SORT--------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] arr3=array.clone();
        int[] arr4=array.clone();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSorting(array);
        insertionSort.insertionSortingBestWay(arr4);
        insertionSort.insertionSortUsingAddRemove(arr3);
    }
}
