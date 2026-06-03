package org.example.Sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int mid = arr.length / 2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(leftArr, rightArr);
    }
public static int[] merge(int[] leftArr, int[] rightArr) {
        int i=0,j=0,k=0;
        int[] arr = new int[leftArr.length+rightArr.length];
        while(i<leftArr.length&&j<rightArr.length){
            if(leftArr[i]<rightArr[j]){
                arr[k++]=leftArr[i++];
            }else{
                arr[k++]=rightArr[j++];
            }
        }
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
        }
        while(j<rightArr.length){
            arr[k++]=rightArr[j++];
        }
        return arr;
}
}
