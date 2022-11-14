package Section6Methods;

import java.util.Scanner;

public class countDuplicateElements {
    public static int getDup(String[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (frequency(arr, arr[i]) > 1) {
                count++;
            }
        }
        return count;
    }

    public static int frequency(String[] arr, String str) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}