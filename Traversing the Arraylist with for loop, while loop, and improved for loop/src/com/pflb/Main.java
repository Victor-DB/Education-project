package com.pflb;

//Traversing the Arraylist with for loop, while loop, and improved for loop
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
    List<Integer> list = Arrays.asList(1, 11, 33, 22, 14, 15, 3, 6, 7);

        System.out.print("using \"for\" loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        } System.out.print("\n");

        System.out.print("using \"while\" loop: ");
        int j = 0;
        while (j < list.size()) {
            System.out.print(list.get(j) + " ");
            j++;
        } System.out.print("\n");

        System.out.print("using \"for-each\" loop: ");
        for (Integer x : list) {
            System.out.print(x + " ");
        } System.out.print("\n");
    }
}
