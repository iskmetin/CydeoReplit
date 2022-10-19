package Section3String;

import java.util.Scanner;

public class withoutFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()>0){
            System.out.println("without first letter: "+word.substring(1)+"\nwithout last letter: "+word.substring(0,word.length()-1));
        }
    }
}