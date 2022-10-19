package Section4Loops;

import java.util.Scanner;

public class zombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day=0;
        for (int i = inhabitants; i >=1 ; i=i/2) {
            System.out.println("Day "+day+" ["+i+"]");
            day++;
        }
        System.out.println("---- EXTINCT ----");

    }
}
