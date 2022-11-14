package Section5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class shortestWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        String sentence = "";
        String[] arr = str.split(", ");
        int minLength = 150000;

        for (String a : arr) {
            if (minLength > a.length()) {

                minLength = a.length();
            }
        }
        for (String a : arr) {
            if (a.length() == minLength) {
                sentence += a + " ";
            }
        }
        System.out.println(Arrays.toString(sentence.trim().split(" ")));


    }

}
