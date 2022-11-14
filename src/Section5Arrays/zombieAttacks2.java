package Section5Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class zombieAttacks2 {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int day = 0;
        System.out.println("Day " + day + Arrays.toString(inhabitants));

        dongu:
        while (true) {

            for (int i = 0; i <= inhabitants.length - 1; i++) {
                if (i == 0) {
                    if (inhabitants[0] == 0) {
                        inhabitants[1] = inhabitants[1] / 2;
                    }

                } else if (i > 0 && i < inhabitants.length - 1) {

                    if (inhabitants[i] == 0) {

                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                        if (inhabitants[i + 1] == 0) {
                            i++;
                        }
                    }


                }
                if (i == inhabitants.length - 1) {
                    if (inhabitants[7] == 0) {
                        inhabitants[6] = inhabitants[6] / 2;
                    }
                }

            }
            day++;
            System.out.println("Day " + day + Arrays.toString(inhabitants));
            for (int i = 0; i <= inhabitants.length - 1; i++) {
                if ((inhabitants[i] > 0)) {
                    continue dongu;
                }
                break dongu;
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}
