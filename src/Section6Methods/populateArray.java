package Section6Methods;

import java.util.Arrays;
import java.util.Scanner;

public class populateArray {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }

    private static void populate(int n) {
        int[] newArr=new int[n];
        for (int i = 1; i <=n ; i++) {
            newArr[i-1]=i  ;

        }
        System.out.println(Arrays.toString(newArr));
    }

}
