package org.example.Array;

public class ArrayQuestion_02 {
        public int findNumbers(int[] nums) {
            int total=0;
            for (int num : nums) {
                int a = num;
                int count = 1;
                while (a >= 10) {
                    count++;
                    a = a / 10;
                }
                if (count % 2 == 0) {
                    total++;
                }
            }
            return total;
        }
    }

