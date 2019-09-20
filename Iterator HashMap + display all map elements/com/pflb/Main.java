package com.pflb;

//iterator HashMap + display all map elements

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "table");
        map.put(2, "knife");
        map.put(3, "spoon");
        map.put(4, "plate");
        map.put(5, "cup");

        //display elements with iterator
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<Integer, String> pair = itr.next();
                Integer key = pair.getKey();
                String value = pair.getValue();
                System.out.println(key + "-" + value);
        }

        //display elements with iterator
        for (Map.Entry<Integer, String> itr1 : map.entrySet()) {
            System.out.println("Key = " + itr1.getKey() + "  " + "Value = " + itr1.getValue());
        }
    }
}
