package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, Hospital> map = new HashMap<>();
        map.put(1, new Hospital(1, "sha", "cold"));
        map.put(2, new Hospital(2, "Ash", "fever"));
        map.put(3, new Hospital(3, "basha", "head ache"));
        map.put(4, new Hospital(4, "harsh", "fever"));
        System.out.println("map elements:" + map);

        //get
        System.out.println("map element by get: " + map.get(1));

        //remove
        System.out.println("map element remove: " + map.remove(3));
        System.out.println("map elements after remove:" + map);

        //duplicate insertion: this record will replace the existing record which has key 1
        map.put(1, new Hospital(1, "kuna", "hand injury"));
        System.out.println("map elements after insert duplicate:" + map);

        //containsKey
        System.out.println("check a key in map: " + map.containsKey(1));
        System.out.println("check a key in map: " + map.containsKey(3));

        //containsValue
        System.out.println("check a value in map: " + map.containsValue("kuna"));

        //values
        System.out.println("get all values in map: " + map.values());

        //keySet
        System.out.println("Get all keys: " + map.keySet());

        //entrySet
        System.out.println("All key values in map: " + map.entrySet());

        for (Map.Entry<Integer, Hospital> e : map.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
