package org.example.CodingPractice.PyramidPattern;

import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }

    public static void pattern(int number) {
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i <= number - j; i++) {
                System.out.print(" ");
            }
            for (int a =1; a <= 2*j-1; a++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
    /*
    Formula :
        spaces = n - row
        stars = 2 * row - 1

    Printing Pattern 1
                1
               2 2
              3 3 3
             4 4 4 4
            5 5 5 5 5
           6 6 6 6 6 6
          7 7 7 7 7 7 7
         8 8 8 8 8 8 8 8
        9 9 9 9 9 9 9 9 9     //white space in front =0

 | Row | Spaces | Stars |
| --- | ------ | ----- |
| 1   | 4      | 1     |
| 2   | 3      | 3     |
| 3   | 2      | 5     |
| 4   | 1      | 7     |
| 5   | 0      | 9     |


     */



