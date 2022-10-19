package Section4Loops;

import java.util.Scanner;

public class countHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        int index = 0;
        int count = 0;

        while (index != -1) {

            index = str.indexOf("hi",index);

            if (index != -1) {
                count++;
                index += 2;
            }
        }
        System.out.println(count);
    }
}
