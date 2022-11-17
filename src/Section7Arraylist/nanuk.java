package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class nanuk {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {
        int total = 0;
        int count = 0;
        for (String str : result) {
            if (str.equals("nanuk")) {
                count++;
            } else {
                total += Integer.parseInt(str);
            }
        }

        return wayStones >= count && total >= boast ? true : false;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

}