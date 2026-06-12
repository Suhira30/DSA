package org.example.Set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
    /*
    Set:
    1. HashSet
    2. LinkedHashSet
    3.SortedSet -> TreeSet
     */
//HashSet---------------------------------------------------------------
    Set<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(null);
    set.add(3);
    set.add(2); //duplicates not allowed
    set.add(10);
    set.add(0);//duplicate not allowed , one null allowed
    System.out.println("HashSet: "+set);
    System.out.println("HashSet size: "+set.size());
    System.out.println("HashSet contains: "+set.contains(2));
    /*
    Output: [null, 0, 1, 2, 3, 10]
    No insertion order maintain
    here  based on bucket order:
    bucket for null
    bucket for 0
    bucket for 1
    bucket for 2
    bucket for 3
    bucket for 10
     */

    Set <String> stringSet=new HashSet<>();
    stringSet.add("Anjali");
    stringSet.add("Bass");
    stringSet.add("Kasun");
    stringSet.add("Bass");
    System.out.println("String in hashSet:"+ stringSet);
//HashLinkedList---------------------------------------------------------------
    Set<Integer>  set1=new LinkedHashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(null);
    set1.add(3);
    set1.add(2); //duplicates not allowed
    set1.add(10);
    set1.add(0);
    System.out.println("LinkedHashSet: "+set1);
    /*
    Output: LinkedHashSet: [1, 2, null, 3, 10, 0]
    LinkedHashList maintain insertion order
     */

//SortedSet: TreeSet--------------------------------------------------------------
    Set <Integer>  set2=new TreeSet<>();
    set2.add(1);
    set2.add(2);
//    set2.add(null);//Null not allowed :NullPointException Arise
    set2.add(3);
    set2.add(2);//No duplicate allowed
    set2.add(10);
    set2.add(0);
    System.out.println("TreeSet: "+set2);
    /*
    Output: TreeSet: [0, 1, 2, 3, 10]
    Sorted order maintain
     */

    /*
    REAL-LIFE THINKING
        🟢 HashSet
            Example:
                login sessions
                IDs check

        🟡 LinkedHashSet
             Example:
                recently viewed products
                browser history
        🟡 TreeSet
             Example:
                leaderboard
                ranking system
                sorted student marks
     */
}
}
