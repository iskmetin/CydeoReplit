package Section3String;

import java.util.Scanner;

public class alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        if(email.toLowerCase().contains("project")){
            System.out.println("priority");
        } else if (email.toLowerCase().contains("alejandro")) {
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }
    }
}
