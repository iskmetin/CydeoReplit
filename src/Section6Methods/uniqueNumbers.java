package Section6Methods;

import java.util.Scanner;

public class uniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        first:
        for (int i = 0; i < nums.length; i++) {
            second:
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue second;
                }
                if (nums[i]==nums[j]){
                    continue first;
                }


            }
            System.out.println(nums[i]);

        }
    }


}
