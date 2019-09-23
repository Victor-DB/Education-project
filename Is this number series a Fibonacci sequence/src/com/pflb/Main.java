package com.pflb;
//Is this number series a Fibonacci sequence
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();
    String s;

    while ( (s = reader.readLine()) != null) {

        if (s.contains("next") ) {
            continue;
        }
        else if (s.contains("exit")) {
            break;
        }
        int n = Integer.parseInt(s);
        list.add(n);
    }
    boolean a = true;
    for (int i = 0; i < list.size(); i++) {
        if (i > 1) {
            int x = list.get(i);
            int y = list.get(i-1);
            int z = list.get(i-2);
           if (x != y + z) {
               a = false;
               break;
           }
        }
     }

     for (Integer i : list) {
         System.out.print(i + " ");
     }

     if (a) {
         System.out.println("Fibonacci sequance");
     } else {
         System.out.println(" is not Fibonacci sequance");
     }
    }
}
