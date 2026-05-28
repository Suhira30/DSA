package org.example.CodingPractice;

import java.util.Scanner;

public class RemoveSpaceInString {
public static void main(String[] arr){
    //How do you remove spaces from a string in Java?
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println(removeSpace(str));
}
public static String  removeSpace(String str){
    StringBuilder s=new StringBuilder();
    for(int i=0;i<str.length();i++){
        if(!(str.charAt(i)==' ')){
            s.append(str.charAt(i));
        }
    }
    return s.toString();
}
}
