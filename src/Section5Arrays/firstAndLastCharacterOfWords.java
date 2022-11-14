package Section5Arrays;

import java.util.Scanner;

public class firstAndLastCharacterOfWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        //WRITE YOUR CODE BELOW:
        for (String str : words) {
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }

    }
}