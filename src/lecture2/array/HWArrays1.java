package lecture2.array;

import java.util.Arrays;
import java.util.Random;

public class HWArrays1 {
    public static void main(String[] args) {
        Random random = new Random();
        int lengthMas = 5;
        int[] mas = new int[lengthMas];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
        Arrays.sort(mas);
        printMas(mas);
        printMas(copyMass(mas));
    }

    private static int[] copyMass(int[] mas) {
        int[] copyMas = new int[mas.length];
        System.arraycopy(mas, 0, copyMas, 0, mas.length);
        for (int i = 0; i < copyMas.length - 1; i++) {
            if (copyMas[i] < copyMas[i + 1]) {
                int tmp = copyMas[i];
                copyMas[i] = copyMas[i + 1];
                copyMas[i + 1] = tmp;
            }
        }
        return copyMas;
    }

    private static void printMas(int[] mas) {
        for (int ma : mas) {
            System.out.printf("%s, ", ma);
        }
        System.out.println();
    }
}
