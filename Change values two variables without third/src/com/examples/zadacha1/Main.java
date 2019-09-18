package com.examples.zadacha1;

//Change values two variables without third
public class Main {
    public static void main (String [] args) {
       int  a = 1, b = 7;
       b = b + a;
       a = b - a;
       b =  b - a ;
    System.out.print("a = " + a + "\n" + " b = " + b);
    }
}
