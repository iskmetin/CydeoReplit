package Section3String;

import java.util.Scanner;

public class burgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String order = s.next();

        String cost=order.equals("burger")?"$12.50":"$9.75";

        System.out.println("Your total is "+cost);
    }
}
