package Section4Loops;

import java.util.Scanner;

public class javaAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int indexPython = 0;
        int indexJava = 0;
        int countPython = 0;
        int countJava = 0;

        while (indexPython != -1) {

            indexPython = sentence.indexOf("python", indexPython);

            if (indexPython != -1) {
                countPython++;
                indexPython += 2;
            }
        }
        while (indexJava != -1) {

            indexJava = sentence.indexOf("java", indexJava);

            if (indexJava != -1) {
                countJava++;
                indexJava += 2;
            }
        }

        System.out.println(countPython == countJava);
    }
}


