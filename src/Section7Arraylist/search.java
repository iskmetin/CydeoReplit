package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class search {

    public static String search(ArrayList<String> strs, String find) {
        // complete the method

        String str = "";

        for (String a : strs) {
            if (a.contains(find)) {
                str = a;
            }
        }

        return !str.isEmpty() ? str : "search failed";


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}