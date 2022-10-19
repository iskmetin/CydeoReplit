package Section3String;

import java.util.Scanner;

public class badWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(word.replace("dumb","cool"));
    }
}
