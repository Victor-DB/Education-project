package com.pflb;

//Find a number of substrings in the string, using HashMap

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        String str = "Wellcome to the new world, guys!";
        String[] arr = str.split(" ");

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            map.put(j,arr[i]);
        }
        int numbOfStr = map.size();
        System.out.println("Number of substrings in the string is: " + numbOfStr);
    }
}
    