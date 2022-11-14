package Section5Arrays;

import java.util.Scanner;

public class splitSentence {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String[] arr1 = sentence.split(" ");

        for (int i =0 ; i <arr1.length ; i++) {


                System.out.println(arr1[i]);


        }
    }

}
