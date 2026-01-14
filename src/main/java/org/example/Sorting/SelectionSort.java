package org.example.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        System.out.println("After Selection Sort : " + Arrays.toString(myArray.toArray()));
    }
}
