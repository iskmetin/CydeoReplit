package Section2Statements;

import java.util.Scanner;

public class findMiddleNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = input.nextInt();


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (secondNumber > thirdNumber) {

                System.out.println("middle number is: " + secondNumber);
            } else {
                System.out.println("middle number is: " + thirdNumber);
            }

        } else if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            if (firstNumber > thirdNumber) {

                System.out.println("middle number is: " + firstNumber);
            } else {
                System.out.println("middle number is: " + thirdNumber);
            }


        } else {

            if (secondNumber > firstNumber) {

                System.out.println("middle number is: " + secondNumber);
            } else {
                System.out.println("middle number is: " + firstNumber);
            }

        }
    }

}