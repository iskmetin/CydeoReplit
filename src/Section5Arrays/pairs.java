package Section5Arrays;

import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODE BELOW:
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.println(arr[i]+", "+arr[i+1]);

        }

    }
}