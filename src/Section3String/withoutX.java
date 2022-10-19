package Section3String;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.startsWith("x") || word.startsWith("X") || word.endsWith("x") || word.endsWith("X")) {
            if (word.startsWith("x") || word.startsWith("X")) {
                word = word.substring(1);
            }
            if (word.endsWith("x") || word.endsWith("X")) {
                word = word.substring(0, word.length() - 1);
            }
        }
        System.out.println(word);
    }
}
