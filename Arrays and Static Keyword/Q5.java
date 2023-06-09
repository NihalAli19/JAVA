import java.util.Scanner;

class Student {
    String name;
    static String university_name;
    int rollno;
    static int counter = 0;

    Student(String name) {
        this.name = name;
        this.rollno = set_rollno();
    }
    static int set_rollno() {
        return counter++;
    }
    static void set_universityName(String university_name) {
        Student.university_name = university_name;
    }
    public void display() {
        System.out.println("Student's information: ");
        System.out.println("Name: " +this.name);
        System.out.println("Roll Number: " +this.rollno);
        System.out.println("University Name: " +university_name);
    }
}
public class Q5 {
    public static void main(String[] args) {
        String name;

        Scanner sc = new Scanner(System.in);

        Student.set_universityName("FAST University");

        System.out.println("Enter your name:");
        name = sc.nextLine();
        Student s1 = new Student(name);
        s1.display();

        System.out.println("\nEnter your name:");
        name = sc.nextLine();
        Student s2 = new Student(name);
        s2.display();

        System.out.println("\nEnter your name:");
        name = sc.nextLine();
        Student s3 = new Student(name);
        s3.display();
    }
}
