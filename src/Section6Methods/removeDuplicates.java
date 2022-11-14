package Section6Methods;

import java.util.Scanner;

public class removeDuplicates { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(uniqueChars(in.next()));
}

    public static String uniqueChars(String str) {
        //TODO: write your code
        char[] chr = str.toCharArray();
        String returnStr = "";
        for (int i = 0; i < chr.length; i++) {
            if (!returnStr.contains(Character.toString(chr[i]))) {
                returnStr += chr[i];
            }


        }


        return returnStr;
    }

}
