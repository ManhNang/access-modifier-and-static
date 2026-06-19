public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        double pi = 3.14;
        return pi * Math.pow(radius, 2);
    }
}
