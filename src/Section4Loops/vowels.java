package Section4Loops;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String vowels="aeoui";
        for (int i = 0; i <word.length() ; i++) {
            if(vowels.contains(String.valueOf( word.charAt(i)))){
                System.out.print(word.charAt(i));

            }

        }
    }
}
