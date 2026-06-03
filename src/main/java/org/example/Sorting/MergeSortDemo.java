package org.example.Sorting;

import java.util.Arrays;

public class MergeSortDemo {
public static void main(String [] arr){
    MergeSort mergeSort=new MergeSort();
    int[] array={10,7,3,100,40,90,73};
    System.out.println(Arrays.toString(mergeSort.mergeSort(array)));
}
}
