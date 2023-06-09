import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle() {

    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void areaRectangle() {
        System.out.println("Area: "+(length*breadth));
    }
    public void perimeterRectangle() {
        System.out.println("Perimeter: "+((length * 2) + (breadth * 2)));
    }
}

class Square extends Rectangle {
    int s;
    Scanner sc = new Scanner(System.in);
    Square() {

    }
    Square(int s) {
        super();
        this.s = s;
    }
    public void areaSquare() {
        System.out.println("Area: "+(s*s));
    }
    public void perimeterSquare() {
        System.out.println("Perimeter: "+((s * 4)));
    }

    public void input() {
        System.out.println("Enter the length of Rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle: ");
        breadth = sc.nextInt();
        System.out.println("Enter the side of Square: ");
        s = sc.nextInt();
    }
}
public class Q4 {
    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.areaRectangle();
        s.perimeterRectangle();
        s.areaSquare();
        s.perimeterSquare();
    }
}
