package Section3String;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length=word.length();
        if (length%2==0){
            System.out.println(word.substring(length/2-1,length/2+1));
        }else{
            System.out.println(word.substring(length/2,length/2+1));
        }



    }
}
