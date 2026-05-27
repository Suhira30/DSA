package org.example.CodingPractice;

import org.example.Array.Array;

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
