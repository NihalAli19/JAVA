import java.util.Scanner;
class Holiday {
    String name;
    int day;
    String month;

    Holiday(String name ,int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    Holiday(Holiday obj) {
        name = obj.name;
        day = obj.day;
        month = obj.month;
    }

    void display() {
        System.out.println("Name: " +this.name);
        System.out.println("Day: " +this.day);
        System.out.println("Month: " +this.month);
    }
}
public class Q4 {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\"Original\"");

        Holiday h1 = new Holiday("Tuesday",13,"December");
        h1.display();

        System.out.println("\"Using Copy Constructor\"");

        Holiday h2 = h1;
        h1.display();
    }
}

