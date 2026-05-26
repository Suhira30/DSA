package org.example.CodingPractice;

import java.util.Scanner;

public class ReverseString {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();

    //method 1
    StringBuilder s=new StringBuilder(str)
            .reverse();
    System.out.println(s);

    //method 2
    System.out.println(reverse(str));

    //method 3 : using loop
    System.out.println("reverse using loop:"+reverseUsingLoop(str));

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

public static   String reverseUsingLoop(String str)
{
    String result="";
  for(int i=str.length()-1;i>=0;i--){
      result+=str.charAt(i);
  }
  return result;
}
}
        /*
        ** space is definitely considered a character in Java strings
        (including StringBuilder).

        String Builders
        Important Methods
        🔹 1. append() : Add text at end
             StringBuilder sb = new StringBuilder("hello");
                sb.append(" Java");
                System.out.println(sb);

               output:  hello Java
        -------------------------------------------------------
        🔹 2. insert(): Insert at specific index
            StringBuilder sb = new StringBuilder("hello");
            sb.insert(1, "abc");
            System.out.println(sb);

            output: habcello
         -------------------------------------------------------
        🔹 3. delete(): Remove part of string
            StringBuilder sb = new StringBuilder("hello world");
            sb.delete(2, 5);
            System.out.println(sb);

            output: he world
         -------------------------------------------------------
        🔹 4. replace(): Replace part of string
            StringBuilder sb = new StringBuilder("hello world");
            sb.replace(0, 5, "Hey");
            System.out.println(sb);

            output: Hey world
         -------------------------------------------------------
        🔹 5. reverse(): Reverse content
            StringBuilder sb = new StringBuilder("hello");
            sb.reverse();
            System.out.println(sb);

            output: olleh
         -------------------------------------------------------
        🔹 6. toString():Convert to String
            StringBuilder sb = new StringBuilder("hello");
            String s = sb.toString();
            System.out.println(s);

            output: hello
         -------------------------------------------------------
        🔹 7. length()
            StringBuilder sb = new StringBuilder("hello");
            System.out.println(sb.length());

            output: 5
         -------------------------------------------------------
        🔹 8. charAt()
            StringBuilder sb = new StringBuilder("hello");
            System.out.println(sb.charAt(1));

            output: e

         -------------------------------------------------------

         */
