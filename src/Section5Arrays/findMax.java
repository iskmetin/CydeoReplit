package Section5Arrays;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //WRITE YOUR CODE BELOW
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);

    }
}