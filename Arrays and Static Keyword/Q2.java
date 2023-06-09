import java.util.Scanner;

class Marks {
    int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    float average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        return (float)sum / 5;
    }

}
public class Q2 {
    public static void main(String[] args) {
        int[] marks = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Marks of Subject "+(i+1)+" :");
            marks[i] = sc.nextInt();
        }
        Marks m = new Marks();

        System.out.println("The maximum marks obtained are: "+m.max(marks));
        System.out.println("The minimum marks obtained are: "+m.min(marks));
        System.out.println("The average marks obtained are: "+m.average(marks));
    }
}

