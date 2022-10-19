package Section3String;

import java.util.Scanner;

public class halfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        System.out.println(word.substring(0,word.length()/2).repeat(2));
    }
}
