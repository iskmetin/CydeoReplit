package Section5Arrays;

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:
        String[] arr1 = sentence.split(" ");

        for (int i = arr1.length-1; i >=0 ; i--) {

            if (i !=0) {
                System.out.print(arr1[i]+" ");
            }
            else{
                System.out.print(arr1[i]);
            }

        }



    }
}