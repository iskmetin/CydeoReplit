package Section3String;

import java.util.Scanner;

public class verifyEquals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        System.out.println(word1.equals(word2));
    }
}
