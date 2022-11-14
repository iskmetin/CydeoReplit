package Section5Arrays;

import java.util.Scanner;

public class secondElements {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        System.out.println("Second element: " + nums[1]);
        System.out.println("Second to last element: " + nums[nums.length - 2]);

    }
}

