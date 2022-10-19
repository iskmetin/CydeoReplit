package Section3String;

import java.util.Scanner;

public class verifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        System.out.println(sentence.contains(word));
    }
}
