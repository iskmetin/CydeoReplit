package Section3String;

import java.util.Scanner;

public class firstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //System.out.println("first letter: "+word.charAt(0)+"\nlast letter: "+word.charAt(word.length()-1));
        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));

    }
}
