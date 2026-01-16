package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    //way 1: pop and insert method for that we need arrayList
    public void selectionSortingUsingAddRemove(ArrayList<Integer>myArray) {
        for (int i = 0; i < myArray.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.size(); j++) {
                if (myArray.get(minIndex) > myArray.get(j)) {
                    minIndex = j;
                }
            }
            Integer minvalue=myArray.remove(minIndex);
            myArray.add(i, minvalue);
        }
        System.out.println("After Selection Sort using add & remove : " + Arrays.toString(myArray.toArray()));
    }
    //way 2: GOOD way
    public void selectionSorting(Integer[] array){
        System.out.println("Before sorting : " + Arrays.toString(array));
        for (int i = 0; i < (array.length - 1); i++) {
            int minIndex = i;
            for (int j = i + 1; j < (array.length - 1); j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[minIndex];
                array[minIndex]=array[i];
                array[i]=temp;
            }
        }
        System.out.println("After Selection Sort : " + Arrays.toString(array));
    }

}
