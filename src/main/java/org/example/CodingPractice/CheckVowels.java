package org.example.CodingPractice;

import java.util.Scanner;

public class CheckVowels {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any word: ");
    String input =sc.nextLine();
    int count=0;
    for(char ch: input.toLowerCase().toCharArray()){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
            System.out.println("Vowel exist:"+ch);
        }
    }
    System.out.println("Totally "+count+" vowels in given input ");
}
}
/*
| Method            | Score         | Why                           |
| ----------------- | -----         | ----------------------------- |
| ✔ if (ch=='a'...) | ⭐⭐⭐⭐⭐   | Fastest + simplest            |
| ✔ HashSet         | ⭐⭐⭐⭐     | Clean + scalable              |
| contains()        | ⭐⭐⭐        | Simple but slower             |
| Stream API        | ⭐⭐          | Fancy but not interview-first |

 */
