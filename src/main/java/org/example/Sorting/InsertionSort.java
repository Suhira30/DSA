package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    //Way :1 -GOOD
    public void insertionSortingBestWay(int[] array){
        System.out.println("Before sorting :" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        System.out.println("After sorting :" + Arrays.toString(array));
    }
    //way :2
    public void insertionSorting(int[] array) {
        System.out.println("Before sorting :" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int currentIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];//shift
                    currentIndex = j;
                } else {
                    break;
                }
            }
            array[currentIndex] = key;
        }
        System.out.println("After sorting :" + Arrays.toString(array));
    }

    //way 3:
    public void insertionSortUsingAddRemove(int[] array) {
        System.out.println("Before sorting :" + Arrays.toString(array));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            arrayList.add(i);
        }
        for (int i = 1; i < arrayList.size(); i++) {
            int currentValue = arrayList.remove(i);
            int insertIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arrayList.get(j)> currentValue) {
                    insertIndex = j;
                }
                else {
                    break;
                }
            }
            arrayList.add(insertIndex, currentValue);
        }
        System.out.println("After sorting :" + arrayList);
    }

}
