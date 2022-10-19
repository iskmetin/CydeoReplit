package Section3String;

import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String longest=word1.length()>word2.length()?word1:word2;
        System.out.println(longest);
    }
}
