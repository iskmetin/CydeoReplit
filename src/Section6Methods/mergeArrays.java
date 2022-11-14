package Section6Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mergeArrays {
    public static int[] merge(int[] a, int[] b) {


        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {

                newList.add(a[i]);

        }
        for (int i = 0; i < b.length; i++) {

                newList.add(b[i]);

        }
        int[] arr = new int[newList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newList.get(i);
        }
        return arr;
    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}