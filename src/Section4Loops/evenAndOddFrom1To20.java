package Section4Loops;

public class evenAndOddFrom1To20 {
    public static void main(String[] args) {
        for(int i=2;i<21;i=i+2){

            System.out.print(i);
            if(i<20){
                System.out.print(" ");
            }

        }
        System.out.println();
        for(int i=1;i<21;i=i+2){
            System.out.print(i);
            if(i<19){
                System.out.print(" ");
            }

        }
    }
}
