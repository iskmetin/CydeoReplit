package Section4Loops;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String answer = "";
        String guestList="Guests' list: ";

        while (true) {
            System.out.println("Please enter the guest's name:");
            name=  input.nextLine();
            guestList+=name;
            System.out.println("Do you want to enter another guest's name?");
            answer= input.nextLine();
            if(answer.equals("no")){
                break;
            }
            guestList+=", ";


        }
        System.out.println(guestList);
    }
}
