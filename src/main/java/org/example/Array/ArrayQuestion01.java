package org.example.Array;

public class ArrayQuestion01 {

public static void main(String[] args) {
   /*Given a binary array nums, return the maximum number of consecutive 1's in the array.
    * Example 1:
        Input: nums = [1,1,0,1,1,1]
        Output: 3
        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    */
    int[] nums=new int[]{1,1,0,0,0,1,1,1,1,0,1};
   ArrayQuestion_01 obj = new ArrayQuestion_01();

   System.out.println(obj.findMaxConsecutiveOnes(nums));

}
}
