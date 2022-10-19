package Section4Loops;

import java.util.Scanner;

public class catsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        int indexCat = 0;
        int indexDog = 0;
        int countCat = 0;
        int countDog = 0;

        while (indexCat != -1) {

            indexCat = str.indexOf("cat", indexCat);

            if (indexCat != -1) {
                countCat++;
                indexCat += 2;
            }
        }
        while (indexDog != -1) {

            indexDog = str.indexOf("dog", indexDog);

            if (indexDog != -1) {
                countDog++;
                indexDog += 2;
            }
        }

        System.out.println(countCat == countDog);
    }
}

