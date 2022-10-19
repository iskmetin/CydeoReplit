package Section4Loops;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        String answer = "";
        String ItemPrice = "";
        String itemquantity = "";
        String shoppingList = "";
        double totalcost=0;

        int itemNo=0;

        while (true) {
            System.out.println("Enter the name of item "+(itemNo+1));

            name = input.nextLine();
            System.out.println("Enter the price of the "+name);

            ItemPrice=input.nextLine();
            System.out.println("How many "+name+" will you buy?");
            itemquantity=input.nextLine();

            System.out.println("Do you want to add more items to the shopping list?");
            answer = input.nextLine();
            totalcost+=Double.parseDouble(itemquantity)*Double.parseDouble(ItemPrice);
            shoppingList+=name+" x "+itemquantity+" - $"+(Double.parseDouble(itemquantity)*Double.parseDouble(ItemPrice));
            if (answer.equals("no")) {
                break;
            }
            shoppingList+="\n";

            itemNo++;
        }
        System.out.println("SHOPPING LIST:\n"+shoppingList+"\nTotal cost: $"+totalcost);
    }
}

