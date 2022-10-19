package Section3String;

import java.util.Scanner;

public class prefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String strPrefix=str.substring(0,n);

        if(str.indexOf(strPrefix,n)!=-1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
