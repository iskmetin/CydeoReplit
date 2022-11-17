package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class timesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (Integer i : nums) {
            liste.add(i * 2);
        }
        return liste;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}