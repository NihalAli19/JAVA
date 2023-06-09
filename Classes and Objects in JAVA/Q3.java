import java.util.Scanner;
class EmployeeE{
    String firstName;
    String lastName;
    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary * 12;
    }
    public double Increment() {
        double value = this.getSalary();
        value = value * 12;
        return  ( (value * 10) / 100 );
    }
}
public class Q3 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp11 = new Employee();
        Employee emp21 = new Employee();



        System.out.println("** Enter details for First Employee **");

        System.out.println("First Name: ");
        emp11.firstName = sc.nextLine();
        System.out.println("Last name: ");
        emp11.lastName = sc.nextLine();
        System.out.println("Enter your Monthly Salary: ");
        emp11.setSalary(sc.nextDouble());

        System.out.println("\n** Enter details for Second Employee **");

        sc.nextLine();
        System.out.println("First Name: ");
        emp21.firstName = sc.nextLine();
        System.out.println("Last name: ");
        emp21.lastName = sc.nextLine();
        System.out.println("Enter your Monthly Salary: ");
        emp21.setSalary(sc.nextDouble());

        System.out.println("Salary of Employee 1 (without Increment): " +emp11.getSalary());
        System.out.println("Salary of Employee 1 (without Increment): " +emp21.getSalary());
        System.out.println("Salary of Employee 2 (with Increment): " +emp11.Increment());
        System.out.println("Salary of Employee 2 (with Increment): " +emp21.Increment());

    }
}
