package Section3String;

import java.util.Scanner;

public class mergeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String newStr="";
        if(word1.length()==word2.length()&&word1.length()==3){

            for (int i = 0; i <3 ; i++) {
                newStr+=word1.charAt(i);
                newStr+=word2.charAt(i);
            }
            System.out.println(newStr);
        }else{
            System.out.println("cannot merge");
        }

    }
}
