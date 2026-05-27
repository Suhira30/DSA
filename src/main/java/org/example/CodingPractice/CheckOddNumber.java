package org.example.CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckOddNumber {

    public static void main(String[] args) {
    /*
    . How do you check if a list of integers contains only odd numbers in Java?
     */
        //ways of add elements
        //method 1:
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // method2:
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 1, 3, 9, 11));

        //method 3:
        List<Integer> list3 = List.of(21, 23, 27, 29);


        System.out.println("List of Integers contain only odd numbers(using method 1): " + checkOddNumber(list));
        System.out.println("List of Integers contain only odd numbers(using method 2): " + checkOddNumber(list2));
        System.out.println("List of Integers contain only odd numbers(using method 3): " + checkOddNumber(list3));

    }

    public static boolean checkOddNumber(List<Integer> arr) {
        boolean isOdd = true;
        for (int a : arr) {
            if (a % 2 == 0) {
                isOdd = false;
                break;
            }
        }
        return isOdd;
    }

 //method 2: without flag
//    public static boolean checkOddNumber(List<Integer> arr) {
//        for (int a : arr) {
//            if (a % 2 == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
