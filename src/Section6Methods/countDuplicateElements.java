package Section6Methods;

import java.util.Scanner;

public class countDuplicateElements {
    public static int getDup(String[] arr) {
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    freq++;
                }

            }
            if (freq>1){
                return freq;

            }


        }
        return freq;

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