package com.pflb;

//Find the second largest number in the array
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {0, 3, 7, 1, 2, 5, 8, 4, 5, 2, 6, 9, 13, 64, 57, 13, 56};
        Arrays.sort(arr, Collections.reverseOrder());
        int numMax2 = arr[1];
        System.out.println(numMax2);
    }
}
