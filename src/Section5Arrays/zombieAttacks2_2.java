package Section5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class zombieAttacks2_2 {
    //cananTuncs solution


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int[] extinction = new int[inhabitants.length];
        if (Arrays.equals(inhabitants, extinction))
            System.out.println("---- EXTINCT ----");
        else {
            int day = 0;
            while (!Arrays.equals(inhabitants, new int[8])) {
                int[] temp = new int[inhabitants.length];
                System.arraycopy(inhabitants, 0, temp, 0, inhabitants.length); // copy inhabitants into temp
                for (int i = 0; i < inhabitants.length; i++) {

                    if (inhabitants[i] == 0) {
                        if (i == 0) {

                            if (temp[i + 1] == inhabitants[i + 1]) {
                                temp[i + 1] = temp[i + 1] / 2;
                            }

                        } else if (i == inhabitants.length - 1) {

                            if (temp[i - 1] == inhabitants[i - 1])
                                temp[i - 1] = temp[i - 1] / 2;
                        } else {

                            if (temp[i - 1] == inhabitants[i - 1])
                                temp[i - 1] = temp[i - 1] / 2;
                            if (temp[i + 1] == inhabitants[i + 1])
                                temp[i + 1] = temp[i + 1] / 2;
                        }
                    }

                }
                inhabitants = temp;


                System.out.println("Day " + (day + 1) + " " + Arrays.toString(inhabitants));
                day++;
                if (Arrays.equals(inhabitants, extinction))
                    System.out.println("---- EXTINCT ----");
            }
        }
    }
}