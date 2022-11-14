package Section5Arrays;

import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TYPE YOUR CODE BELOW:
        boolean ifThere=false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==5){
                if (nums[i+1]==5){
                    ifThere=true;
                }
            }

        }
        System.out.println(ifThere);

    }

}
