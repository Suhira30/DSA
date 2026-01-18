package org.example.Array;

public class ArrayQuestion_03 {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int left;
        int right;
        int index = nums.length - 1;
        while (leftIndex <= rightIndex) {
            left = nums[leftIndex] * nums[leftIndex];
            right = nums[rightIndex] * nums[rightIndex];
            if (left > right) {
                arr[index] = left;
                leftIndex++;
            } else {
                arr[index] = right;
                rightIndex--;
            }
            index--;
        }
        return arr;

    }
}
