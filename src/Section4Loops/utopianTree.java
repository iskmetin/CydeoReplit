package Section4Loops;

public class utopianTree {
    public static void main(String[] args) {
        int size = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 4) {
                size++;
                System.out.println("year " + i + " - growth 1 cm\ntree size: " + size + " cm");
            } else {
                size = size + 2;
                System.out.println("year " + i + " - growth 2 cm\ntree size: " + size + " cm");
            }

        }
    }
}
