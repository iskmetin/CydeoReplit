package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class fuel {
    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {
        int total=0;
        for (Integer i:deliveries){
            total+=i;
        }
        if (total%gasTank==0){
            return total/gasTank;
        }
        else{
            return total/gasTank+1;
        }

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }

}