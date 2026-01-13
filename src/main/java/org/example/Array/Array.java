package org.example.Array;

public class Array {
//1. Find The Lowest Value in an Array
public void findLowestValue(int[] arr){
    int minVal=arr[0];
    for(int i:arr){
        if(i<minVal){
            minVal=i;
        }
    }
    System.out.println("Min value is :" + minVal);

}
}
