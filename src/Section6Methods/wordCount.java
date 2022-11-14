package Section6Methods;

import java.lang.reflect.Array;
import java.util.Scanner;

public class wordCount {

    public static int wordCount(String words) {
        // your code
        String[] arrStr = words.split(" ");
        return arrStr.length;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }


}
