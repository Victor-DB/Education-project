package com.pflb;

//Find duplicate characters in the string
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "aaaccdbbdeegggh";
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            list.add(s);
        }

        for (int j = 0; j < list.size(); j++) {
            String st = list.get(j);
            if (!map.containsKey(st)) {
                map.put(st, 1);
            } else if (map.containsKey(st)) {
                map.replace(st, map.get(st) + 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
             String key = pair.getKey();
             Integer value = pair.getValue();
             System.out.print(key + " " + value + "\n");
        }
    }
}
