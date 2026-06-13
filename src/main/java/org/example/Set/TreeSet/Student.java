package org.example.Set.TreeSet;

public class Student {
    int marks;
    String name;
    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    public String toString(){
        return marks+ "-"+name;
    }

}
