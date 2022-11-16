package Section7Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class extractNumber {
    public static String extractNum(String s) {
        char[] chArr=s.toCharArray();
        String rtnStr="";

        for (char ch:chArr){
            if(Character.isDigit(ch)){
                rtnStr+=ch;
            }
        }
        return rtnStr;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

}