package Section6Methods;

import java.util.Scanner;

public class simpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // WRITE YOUR CODE BELOW:
        if (isAvailable && year == 2018) {
            if (month == 7) {
                if (day >= 1 && day <= 8) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
