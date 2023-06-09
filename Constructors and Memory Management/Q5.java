import java.util.Scanner;

class Tank {
    public void finalize() {
            System.out.println("Garbage Collection.");
    }
}
public class Q5 {
    public static void main(String[] args) {
        int capacity;

        Scanner sc = new Scanner(System.in);

        Tank c = new Tank();

        System.out.println("Enter the capacity in the water tank: ");
        capacity = sc.nextInt();

        if (capacity == 0) {
            c = null;
            System.gc();
        }
    }
}
