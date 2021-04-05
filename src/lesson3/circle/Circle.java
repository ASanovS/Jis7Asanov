package lesson3.circle;
//*********Checked**************
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
