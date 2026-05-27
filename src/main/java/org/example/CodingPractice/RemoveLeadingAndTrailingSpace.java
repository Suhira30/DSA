package org.example.CodingPractice;

import java.util.Scanner;

public class RemoveLeadingAndTrailingSpace {
    public static void main(String[] args) {
        /*
        How do you remove leading and trailing spaces from a string in Java?
            What is .trim()?
             Built-in Java method in String class
                It removes:
                leading spaces & trailing spaces
         */
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String: ");
String str=sc.nextLine();
System.out.println(str.trim());

    }

}
