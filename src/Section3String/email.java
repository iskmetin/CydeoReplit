package Section3String;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String name=email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("@")+2).toUpperCase()+email.substring(email.indexOf("@")+2,email.indexOf("."));
        System.out.println("First name: "+name);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
    }
}
