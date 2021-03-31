package lesson3.circle;

/*1. Разработать класс - круг, у которого должны быть следующие характеристики:
    Свойства:
        Радиус (double radius)
    Методы:
        Расчет площади (double calculateArea())
    2. Свойства можно задавать через оператор ".", либо через конструктор.
 */

public class CircleDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(2);

        System.out.println(circle.calculateArea());
    }
}
