package Section6Methods;

import java.util.Scanner;

public class coverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here

        return main.indexOf(coverMe)>=0?main.replace(coverMe, "[" + coverMe + "]"):"["+main+"]";

    }

}