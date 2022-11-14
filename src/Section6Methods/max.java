package Section6Methods;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


    public static int max(int x, int y) {
        // WRITE YOUR METHOD BELOW
        return x>y?x:y;

    }
}

