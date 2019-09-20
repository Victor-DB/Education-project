package Paket;

//Is the entered text a palindrome?!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i-- ) {
            char c1 = str.charAt(i);
            list2.add(c1);
        }
        String str2 = list2.toString();
        System.out.println(str2);

        ArrayList<Character> list1 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++ ) {
            char c2 = str.charAt(i);
            list1.add(c2);
        }
        String str1 = list1.toString();
        System.out.println(str1);

        if (str1.equals(str2)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}

