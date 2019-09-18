package com.examples.zadacha1;

//Writing a string backwards
import java.util.ArrayList;
public class Main {
    public static void main (String [] args) {

        String str = "abcdefgh";

        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            list.add(c);
        }
        for (char x : list){
            System.out.print(x);
        }
    }
}
