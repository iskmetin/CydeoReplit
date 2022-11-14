package Section5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:
        String[] arr1 = new String[arr.length];

        for (int i = arr1.length-1; i >=0 ; i--) {
            arr1[i]=arr[arr1.length-1-i];


        }
        System.out.println(Arrays.toString(arr1));

    }
}