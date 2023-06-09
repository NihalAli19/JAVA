import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String plangName;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Enter the name of the Programming Language you want to add: ");
        for (int i = 0; i < 5; i++) {
            plangName = sc.nextLine();
            list.add(plangName);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(2));
    }
}
