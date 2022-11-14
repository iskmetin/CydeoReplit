package Section5Arrays;

import java.util.Scanner;

public class biggestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW
        String sentence="";
        int maxLength = -1;

        for (String a : words) {
            if (maxLength < a.length()) {

                maxLength = a.length();
            }
        }
        for (String a : words) {
            if (a.length() == maxLength) {
                sentence += a + " ";
            }
        }
        System.out.println(sentence.trim());


    }
}
