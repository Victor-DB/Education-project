package Paket;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Delete all spaces in the line without replace()
public class Main {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s = "Put your hands up in the air";

        for (int i = 0; i < s.length(); i++) {
            String sNew = s.substring(i, i+1);
            list.add(sNew);
        }

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).equals(" ")) {
                list.remove(list.get(j));
            }
        }
        for (String x : list)
        System.out.print(x);
    }
}

