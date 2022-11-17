package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class appendPositiveSum {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
        ArrayList<Integer> intArrList=new ArrayList<>();
       Integer total=0;
        for (Integer a: list){

            if(a>0){
                intArrList.add(a);
                total+=a;
            }
        }
        intArrList.add(total);
return intArrList;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

}