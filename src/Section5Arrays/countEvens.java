package Section5Arrays;

import java.util.Scanner;

public class countEvens {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        int evens=0;
        for (int a:nums){
            if(a%2==0){
                evens++;
            }
        }
        System.out.println(evens);

    }
}

