package org.example.Array;

public class ArrayQuestion_01 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
                continue;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
