package Section4Loops;

import java.util.Scanner;

public class eachLetter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }

    }
}
