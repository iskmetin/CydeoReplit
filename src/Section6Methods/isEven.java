package Section6Methods;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num){
        //WRITE YOUR METHOD
return num%2==0;


    }




}