package run;

import lesson2.level1.MathOperationsDemo;
import lesson2.level2.RandomGeneratorDemo;

public class Application {

    public static void main(String[] args) {
        MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();
        System.out.println("Работа математических методов");
        mathOperationsDemo.printInfoMathOperationsDemo();
        System.out.println();

        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        randomGeneratorDemo.randomGeneration();
    }
}
