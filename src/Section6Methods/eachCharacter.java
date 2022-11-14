package Section6Methods;

import java.util.Scanner;

public class eachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));

    }

    public static String countLetters(String str) {
        int freq = 1;
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                freq++;

            } else {
                newStr += freq + "" + str.charAt(i - 1);
                freq = 1;
            }
            if (i == str.length() - 1) {
                newStr += freq + "" + str.charAt(i);
            }
        }

        return newStr;
    }

//3o1p1e1n1d1r
}

