package Section5Arrays;

import java.util.Scanner;

public class averageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        // Do not touch above. Use array temps

        // from saim: please update to use a loop to have a different sized arrays

        double total = 0;
        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
        }
        System.out.println((total / temps.length));

    }
}