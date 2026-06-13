package org.example.Map;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
    HashMap<Integer, Hospital> map = new HashMap<>();
    map.put(1,new Hospital(1,"sha","cold"));
    map.put(2,new Hospital(2,"Ash","fever"));
    map.put(3,new Hospital(3,"basha","head ache"));
    System.out.println("map elements:" +map);

    //get
    System.out.println("map element by get: "+map.get(1));

    //remove
    System.out.println("map element remove: "+map.remove(3));
    System.out.println("map elements after remove:" +map);

    //duplicate insertion: this record will replace the existing record which has key 1
    map.put(1,new Hospital(1,"kuna","hand injury"));
    System.out.println("map elements after insert duplicate:" +map);



}
}
