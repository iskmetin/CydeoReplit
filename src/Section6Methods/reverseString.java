package Section6Methods;

import java.util.Scanner;

public class reverseString {
    public static String reverse(String input) {
        //WRITE YOUR CODE BELOW:
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }


}
