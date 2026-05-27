package org.example.CodingPractice;

import java.util.Scanner;

public class CheckPrimeNumber {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number: ");
int number=sc.nextInt();
System.out.println("Number is prime :"+checkPrimeNumber(number));
}
public static boolean checkPrimeNumber(int number){
/*
step 1: 0,1 is not prime number therefore n>1 have to consider to this calculation
step 2: divide n from 2 to n-1 if something divide n then it is not prime number
 */
    boolean isPrime=true;
    if(number<=1) {
        System.out.println("number is less than or equal to 1");
        isPrime=false;

    }else{
        for(int i=2;i<number-1;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
    }
return isPrime;
}
}
