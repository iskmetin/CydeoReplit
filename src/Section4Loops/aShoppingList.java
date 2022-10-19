package Section4Loops;

import java.util.Scanner;

public class aShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String r = "hi";

        //WRITE YOUR CODE BELOW
        int count = 0;
        String s = "";
        for (int i = 0; i < str.length()-1; i++) {
            s = str.substring(i, i+2);
            if(s.contains(r)){
                count+=1;
            }
        }
        System.out.println(count);

    }
}
