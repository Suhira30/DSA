package org.example.CodingPractice;

import java.util.Scanner;

public class ReverseString {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    System.out.println(reverse(str));

}
public static  String reverse(String str)
{
    StringBuilder sb=new StringBuilder();
    char[] chars = str.toCharArray();
    for(int i=chars.length-1;i>=0;i--){
        sb.append(chars[i]);
    }
    return sb.toString();
}
}
