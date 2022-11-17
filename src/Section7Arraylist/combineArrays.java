package Section7Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class combineArrays {
    public static ArrayList<String> combine(String[] r1, String[] r2) {

        // your code here
        ArrayList<String> liste=new ArrayList<>();
        liste.addAll(Arrays.asList(r1));
        liste.addAll(Arrays.asList(r2));
        return liste;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        String[] strs2 = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for (int i = 0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs, strs2));

    }

}