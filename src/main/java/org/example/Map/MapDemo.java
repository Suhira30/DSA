package org.example.Map;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //put
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println("Map before adding duplicate key: " + map);
        map.put("key1", "value3");
        System.out.println("Map after adding duplicate key: " + map);
        map.put("key3", "value4");
        map.put("key4", "value4");
        System.out.println("Map after adding duplicate value: " + map);

        //get
        System.out.println("Read: " + map.get("key1"));

        //remove
        map.remove("key4");
        System.out.println("After remove" + map);

        //containsKey()
        System.out.println("ContainsKey: " + map.containsKey("key1"));

        //containsValue()
        System.out.println("ContainsValue: " + map.containsValue("value1"));

        //entrySet()
        System.out.println("Get all key value pairs: " + map.entrySet());

        //keySet()
        System.out.println("get all key : " + map.keySet());

        //values()
        System.out.println("get all values: " + map.values());
    }
}