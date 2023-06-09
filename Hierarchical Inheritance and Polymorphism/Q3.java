import java.util.Scanner;

class Robot {
    int x, y;
    char direction;

    public Robot(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public void displayInitial() {
        System.out.println("Robot is initially at ("+x+" , "+y+") facing towards "+direction);
    }
}

class MovingRobot extends Robot {
    public MovingRobot(int x, int y, char direction) {
        super(x, y, direction);
    }

    public void moveRobot(int steps) {
        if (direction == 'N') {
            y += steps;
        }
        else if (direction == 'S') {
            y -= steps;
        }
        else if (direction == 'E') {
            x += steps;
        }
        else if (direction == 'W') {
            x -= steps;
        }
    }
    public void display() {
        System.out.println("The Robot is now at ("+x+" , "+y+") facing towards "+direction);
    }
}
public class Q3 {
    public static void main(String[] args) {
        int x, y, steps;
        char direction;

        Scanner sc = new Scanner(System.in);

        System.out.println("X: ");
        x = sc.nextInt();
        System.out.println("Y: ");
        y = sc.nextInt();
        System.out.println("Steps: ");
        steps = sc.nextInt();
        System.out.println("Direction: ");
        direction = sc.next().charAt(0);

        MovingRobot r1 = new MovingRobot(x,y,direction);
        r1.displayInitial();
        r1.moveRobot(steps);
        r1.display();
    }
}
