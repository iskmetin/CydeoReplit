package Section4Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum =1;
        //WRITE YOUR CODE HERE:
        for(int i=n;i>0;i--){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
