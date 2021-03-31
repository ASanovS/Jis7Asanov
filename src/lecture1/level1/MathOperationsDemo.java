package lecture1.level1;

public class MathOperationsDemo {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public void printInfoMathOperationsDemo() {
        System.out.println("Метод addition 5 + 5 = " + addition(5, 5));
        System.out.println("Метод subtraction 5 - 5 = " + subtraction(5, 5));
        System.out.println("Метод multiplication 5 * 5 = " + multiplication(5, 5));
        System.out.println("Метод division 5 / 5 = " + division(5, 5));

    }
}
