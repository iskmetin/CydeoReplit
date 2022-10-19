package Section4Loops;

import java.util.Scanner;

public class eachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        for (char b:word.toCharArray()){
            System.out.println(b);
        }

    }
}
