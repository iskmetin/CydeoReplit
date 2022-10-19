package Section3String;

import java.util.Scanner;

public class startAndEndWith {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        System.out.println("Starts with a: "+word.startsWith("a")+"\nEnds with e: "+word.endsWith("e"));
    }
}
