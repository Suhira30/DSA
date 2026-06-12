package org.example.Set.HashSet;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Patient> set1 = new HashSet<>();
        set1.add(new Patient(1, "Anjali"));
        set1.add(new Patient(2, "Bass"));
        set1.add(new Patient(1, "Anjali")); //duplicate not allowed
        set1.add(new Patient(1, "Hay"));
        
        for (Patient p : set1) {
            System.out.println(p);
        }


    }

}
