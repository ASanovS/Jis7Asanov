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
        printMas(printDoubleMas(mas, copyMass(mas)));
    }

    private static int[] copyMass(int[] mas) {
        int[] copyMas = new int[mas.length];
        System.arraycopy(mas, 0, copyMas, 0, mas.length);
        bubbleSort(copyMas);
        return copyMas;
    }

    private static int[] printDoubleMas(int[] mas1, int[] mas2) {
        int[] doubleMassive = new int[mas1.length + mas2.length];
        System.arraycopy(mas1, 0, doubleMassive, 0, mas1.length);
        if (doubleMassive.length - mas2.length >= 0)
            System.arraycopy(mas2, mas2.length - mas2.length, doubleMassive, mas2.length, doubleMassive.length - mas2.length);
        return doubleMassive;
    }

    private static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    private static void printMas(int[] mas) {
        for (int ma : mas) {
            System.out.printf("%s, ", ma);
        }
        System.out.println();
    }
}
