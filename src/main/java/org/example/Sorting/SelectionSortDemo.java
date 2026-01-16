package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortDemo {

    public static void main(String[] args) {
        //SELECTION SORT--------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        System.out.println();
        int x = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        Integer[] arr2 = new Integer[x];
        for (int i = 0; i < x; i++) {
            arr2[i] = sc.nextInt();
        }
        Integer[] arr3=arr2.clone();
        System.out.println("Before sorting : " + Arrays.toString(arr2));
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(arr2));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSortingUsingAddRemove(myArray);
        selectionSort.selectionSorting(arr3);
    }
}
