package Section3String;

import java.util.Scanner;

public class caseSensitivity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        System.out.println("word: "+word+"\nuppercase: "+word.toUpperCase()+"\nlowercase: "+word.toLowerCase());

    }}
