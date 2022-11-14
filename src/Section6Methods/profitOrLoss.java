package Section6Methods;

import java.util.Scanner;

public class profitOrLoss {
    public static String profit(int buyPrice, int sellPrice) {
        //WRITE YOUR CODE BELOW

return buyPrice>=sellPrice?buyPrice>sellPrice?"loss":"no loss":"profit";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}

