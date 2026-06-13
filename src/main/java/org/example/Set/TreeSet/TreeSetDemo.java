package org.example.Set.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        System.out.println(treeSet);

        //first
        System.out.println(treeSet.first());
        //last
        System.out.println(treeSet.last());
        //remove
        System.out.println(treeSet.remove("A"));
        System.out.println("After removing element:"+treeSet);
        //headSet : value lower than given value
        System.out.println(treeSet.headSet("B"));
        //tailSt: value higher than/equal to given value
        System.out.println(treeSet.tailSet("C"));


        //Explore with custom object

        TreeSet<Student> treeSet2 = new TreeSet<>(
                (p1,p2)->p1.marks-p2.marks
        );

        treeSet2.add(new Student(100,"Suhi"));
        treeSet2.add(new Student(89,"Suhan"));
        treeSet2.add(new Student(88,"Suhan"));

        System.out.println("Student record:"+treeSet2);
        //duplicate does not allow
        treeSet2.add(new Student(88,"Suhan"));
        System.out.println("Student record after add duplicate:"+treeSet2);

       // treeSet2.add(null);//Null values not allowed : NullPointerException

    }

}
