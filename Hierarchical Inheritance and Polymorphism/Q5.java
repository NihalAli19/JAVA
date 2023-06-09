import java.util.Arrays;
import java.util.Scanner;
class Sorting {
    public void sort(int[] array) {

        Arrays.sort(array);
        System.out.println(" "+Arrays.toString(array));
    }
    public void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(" "+Arrays.toString(array));
    }
    public void sort(int[] array, boolean descending) {
        if (descending == true) {
            Arrays.sort(array);
            for (int i = 4; i >= 0; i--) {
            System.out.println(" "+array[i]);
            }
        }
        else if (descending == false) {
            Arrays.sort(array);
            System.out.println(" "+Arrays.toString(array));
        }
    }
    public void sort(String[] array, boolean descending) {
        if (descending == true) {
            Arrays.sort(array);
            for (int i = 4; i >= 0; i--) {
                System.out.println(" "+array[i]);
            }
        }
        else if (descending == false) {
            Arrays.sort(array);
            System.out.println(" "+Arrays.toString(array));
        }
    }
}
public class Q5 {
    public static void main(String[] args) {
        int[] array = {10,5,6,8,9};
        String[] array1 ={"Nihal", "Ovaiz", "Ali", "Mark", "Elon"};
        char choice;

        Scanner sc = new Scanner(System.in);

        Sorting sorting = new Sorting();
        sorting.sort(array);
        sorting.sort(array1);

        System.out.println("Do you want to sort integer array in descending order? (y/n)");
        choice = sc.next().charAt(0);

        boolean descending = true;

        if (choice == 'Y' || choice == 'y') {
            descending = true;
        }
        else if (choice == 'N' || choice == 'n') {
            descending = false;
        }

        sorting.sort(array, descending);

        System.out.println("Do you want to sort string array in descending order? (y/n)");
        choice = sc.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            descending = true;
        }
        else if (choice == 'N' || choice == 'n') {
            descending = false;
        }

        sorting.sort(array1,descending);
    }
}
