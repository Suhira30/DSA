package org.example.CodingPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        /*
        : What type is it?
        Sorting depends on type:
            Array -->	Arrays.sort()
            List -->	Collections.sort()
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements you want to sort: ");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int[]  array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }

}
/*
Array methods

         1. ✅ Arrays.sort()
            Sorts array in ascending order
            int[] arr = {5, 2, 8, 1};
            Arrays.sort(arr);

        2. ✅ Arrays.toString()
            Prints array properly
            System.out.println(Arrays.toString(arr));
            Output:[1, 2, 5, 8]

        👉 Without this, you get memory address (not readable)

        3. ✅ Arrays.binarySearch()
            Search for element (must be sorted first)
            int index = Arrays.binarySearch(arr, 5);
            👉 Returns index of element

        4. ✅ Arrays.fill()
            Fills array with same value
            int[] arr = new int[5];
            Arrays.fill(arr, 10);
            Output:   [10, 10, 10, 10, 10]

        5. ✅ Arrays.copyOf()
            Copy array with new size
            int[] newArr = Arrays.copyOf(arr, 10);

        6. ✅ Arrays.equals()
            Compare two arrays
            Arrays.equals(arr1, arr2);

        7. (Advanced) Arrays.stream()
            Convert array to stream (Java 8+)
            Arrays.stream(arr).sum();
 */

