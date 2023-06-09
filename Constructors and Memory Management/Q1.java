import java.util.Scanner;

class Box {
    Scanner sc = new Scanner(System.in);
    int width,height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Object Box1 created successfully for positive height and width.");
    }

    public Box(int height) {
        this.height = height;
        System.out.println("Enter width of the Box: ");
        width  = sc.nextInt();
        System.out.println("Object Box2 created successfully and width is " + width);
    }

    public Box () {
        int  width, height;

        System.out.println("Enter width of the Box: ");
        width = sc.nextInt();
        System.out.println("Enter height of the Box: ");
        height = sc.nextInt();

        System.out.println("Object Box3 created successfully and width is " + width + " height is " + height);
    }
}

public class Q1 {
    public static void main(String[] args) {
        int w, h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the Box: ");
        w = sc.nextInt();

        System.out.println("Enter the height of the Box: ");
        h = sc.nextInt();

        if (w >= 0 && h >= 0) {
            Box Box1 = new Box(w,h);
        }

        Box Box2 = new Box(w);
        Box Box3 = new Box();
    }
}
