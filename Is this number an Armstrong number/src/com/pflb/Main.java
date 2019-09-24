package com.pflb;

//Is this number an Armstrong number
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        String str = reader.readLine();
        int num = Integer.parseInt(str);

        ArrayList<Integer> list = new ArrayList<>();

        double count = 0.0;
        for(int i = 0; i < str.length(); i++) {
                String s = str.substring(i, i + 1);
                int n = Integer.parseInt(s);
                list.add(n);
                count++;
        }
       double sum = 0;
        for (int j = 0; j < list.size(); j++) {
            double x = (double)list.get(j);
            sum += Math.pow(x, count);
        }

        if (num == sum) {
            System.out.println(num + " - Armstrong number");
        } else {
            System.out.println(num + " - is not Armstrong number");
        }
    }
}
