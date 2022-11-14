package Section6Methods;

import java.util.Scanner;

public class countAppearence {
    public static int countAppearance(String[] arr, String word) {
        int freq = 0;
        for (String a : arr) {
            if (a.equals(word)){
                freq++;
            }
        }
        return freq;

    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        String[] strs = new String[in.nextInt()];
        System.out.println("Enter the search word:");
        String word = in.next();
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs, word));

    }
}

