package org.example.Sorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSort {

    public void sorting(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
        Instant start = Instant.now();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);
    }

    /*If the algorithm goes through the array one time without swapping any values,
    the array must be finished sorted, and we can stop the algorithm */
    //Way 2: GOOD way
    public void sortingWithImprovement(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
        Instant start = Instant.now();
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                //way 1:
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
                //way 2:
                /* without creating temp variable using XOR */
//                if (arr[j] > arr[j + 1]) {
//                    arr[j] = arr[i]^arr[j + 1];
//                    arr[j + 1] = arr[j + 1]^arr[j];
//                    arr[j] = arr[i]^arr[j + 1];
//                    flag = true;
//                }

                if(!flag)
                    break;
            }
        }
        System.out.println("Sorted Array follow improvements : " + Arrays.toString(arr));
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);
    }
}
