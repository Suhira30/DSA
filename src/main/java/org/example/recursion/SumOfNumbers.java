package org.example.recursion;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5));
    }

    public static int sumOfNumbers(int n) {
        if (n == 0)
            return 0;
        return n + sumOfNumbers(n - 1);
    }
}
