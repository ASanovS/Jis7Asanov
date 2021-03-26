package lesson2.level2;

import java.util.Random;

public class RandomGeneratorDemo {
    Random random = new Random();

    public void randomGeneration() {
        int rndTemp = 0;
        for (int i = 1; i < 4; i++) {
            int randNumb = random.nextInt(100);
            System.out.printf("Случайное число №%s = %s \n", i, randNumb);
            rndTemp += randNumb;
        }
        System.out.println("Сумма случайных чисел = " + rndTemp);
    }
}
