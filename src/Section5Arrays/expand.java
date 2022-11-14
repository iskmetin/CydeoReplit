package Section5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class expand {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        int[] nums2=new int[6];
        for (int i = 0; i <3; i++) {
            nums2[i]=nums[i];


        }
        System.out.println(Arrays.toString(nums2));
    }
}

