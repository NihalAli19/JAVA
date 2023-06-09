import java.util.Arrays;
import java.util.Scanner;

class GenericMethods <T> {
    public <T extends Comparable<T>> int Compare(T[] array1, T[] array2) {

        return array1[0].compareTo(array2[0]);
    }
}
public class Q3 {
    public static void main(String[] args) {
        GenericMethods <Integer> genericMethods = new GenericMethods();

        char ch;
        int num1, num2;

        Integer array1[] = new Integer[10];
        Integer array2[] = new Integer[10];

        Scanner sc = new Scanner(System.in);

        int i = 0, j = 0;

        System.out.println("Array 1");
        do {
            System.out.println("Enter number: ");
            num1 = sc.nextInt();
            array1[i] = num1;
            System.out.println("Do you want to add more?(y/n):");
            ch = sc.next().charAt(0);
            i++;
        }while(ch == 'Y' || ch == 'y');

        sc.nextLine();

        System.out.println("Array 2");
        do {
            System.out.println("Enter number:");
            num2 = sc.nextInt();
            array2[j] = num2;
            System.out.println("Do you want to add more?(y/n)");
            ch = sc.next().charAt(0);
            j++;
        }while(ch == 'Y' || ch == 'y');

       if(genericMethods.Compare(array1,array2) == 0) {
           System.out.println("Element is similar.");
       }
       else {
           System.out.println("Element is different.");
       }
    }
}
