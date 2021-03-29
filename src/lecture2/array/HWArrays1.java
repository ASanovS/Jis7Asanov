package lecture2.array;

import java.util.Random;

public class HWArrays1 {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthMas = 5;
        int[] mas = new int[lengthMas];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }

        for (int ma : mas) {
            System.out.printf("%s, ", ma);
        }

    }
}
