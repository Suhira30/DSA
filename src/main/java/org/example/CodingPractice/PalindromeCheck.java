package org.example.CodingPractice;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        /*
        How do you check whether a string is a palindrome in Java?
        A palindrome is a word, number, or sequence that reads the same forward and backward.

        Examples:
        "madam" → palindrome
        "racecar" → palindrome
        "hello" → not a palindrome
        "121" → palindrome
        "123" → not palindrome
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Is the String palindrome: "+checkPalindrome(str.toLowerCase()));

    }
public static boolean checkPalindrome(String str){
    int j;
    int i;
        for( i=0,j=str.length()-1;i<=j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
}

}
