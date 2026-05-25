package org.example.recursion;

public class powerOfElementDemo {
public static void main(String[] args) {
    System.out.println(powerOfElement(2,3));
}
public static int powerOfElement(int n,int x)
{
    if(n==0){
        return 1;
    }
    return x*powerOfElement(n-1,x);
}
}
