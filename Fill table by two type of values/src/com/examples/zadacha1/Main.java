package com.examples.zadacha1;

import java.io.FileWriter;
public class Main {
    public static void main (String [] args) {
        String[] var1 = {"refgfer","rwfwf","gdfgggd","flggr","frwff"};
        String[] var2 = {"341341", "623525","726465", "424155", "9473621545"};
        try (FileWriter wr = new FileWriter("endLocation.txt");){
                for (int i = 0; i < var1.length; i++) {
                    for (int j = i; j < var2.length; j++) {
                    String text1 = var1[i];
                    String text2 = var2[j];
                         if (i == j) {
                             wr.write(text1 + " " + text2);
                             wr.append('\n');
                         }
                    }
                }
           System.out.println("It is good! File is written");
        } catch (Exception e) {
           System.out.println("Error can see");
       }
    }
}
