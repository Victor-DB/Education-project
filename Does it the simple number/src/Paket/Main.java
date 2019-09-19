package Paket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter the number: ");
          String s = reader.readLine();
          int n = Integer.parseInt(s);
          boolean a = true;
             for (int i = 2; i < n; i++) {  
                 if (n % i == 0) {
                	 a = false;
                	 break;
                 }          	  
              }                         
        reader.close();
            String aswer = (a == true) ? n + " is a simple number" : n + " is not a simple number";
            System.out.println(aswer);
    }
}