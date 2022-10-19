package Section3String;

import java.util.Scanner;

public class hasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.indexOf("java")==0||word.indexOf("java")==1);
    }
}
