class Shape {
    double area;
    public double calculateArea() {
        return area;
    }
}

class Circle extends Shape {
    double Area;
    @Override
    public double calculateArea() {
        return Area;
    }

    public double calculateArea(int radius) {
        Area = 3.14 * radius * radius;
        return Area;
    }
}

class Rectangle extends Shape {
    double Area;

    @Override
    public double calculateArea() {
        return Area;
    }

    public double calculateArea(int l, int b) {
        return l*b;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circle");
        System.out.println("Without parameters:" +circle.calculateArea());
        System.out.println("With parameters: " +circle.calculateArea(5));

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle");
        System.out.println("Without parameters:" +rectangle.calculateArea());
        System.out.println("With parameters: " +rectangle.calculateArea(5,6));
    }
}
