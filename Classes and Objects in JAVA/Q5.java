import java.util.Scanner;
class Employee {
    private int salary;
    String empName;
    int empNo;
    int empPhNo;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
}
public class Q5 {
    public static void main (String[] args) {

        int highest;

        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        System.out.println("\n** Enter the details of First Employee ** \n");

        System.out.println("Name: ");
        emp1.empName = sc.nextLine();
        System.out.println("Employee Number: ");
        emp1.empNo = sc.nextInt();
        System.out.println("Employee's Phone Number: ");
        emp1.empPhNo = sc.nextInt();
        System.out.println("Employee's Salary: ");
        emp1.setSalary(sc.nextInt());

        System.out.println("\n** Enter the details of First Employee ** \n");

        System.out.println("Name: ");
        emp2.empName = sc.nextLine();
        System.out.println("Employee Number: ");
        emp2.empNo = sc.nextInt();
        System.out.println("Employee's Phone Number: ");
        emp2.empPhNo = sc.nextInt();
        System.out.println("Employee's Salary: ");
        emp2.setSalary(sc.nextInt());

        System.out.println("\n** Enter the details of First Employee ** \n");

        System.out.println("Name: ");
        emp3.empName = sc.nextLine();
        System.out.println("Employee Number: ");
        emp3.empNo = sc.nextInt();
        System.out.println("Employee's Phone Number: ");
        emp3.empPhNo = sc.nextInt();
        System.out.println("Employee's Salary: ");
        emp3.setSalary(sc.nextInt());

        System.out.println("\"Employee 1\"\n");
        System.out.println("Name: "+emp1.empName);
        System.out.println("Employee Number: " +emp1.empNo);
        System.out.println("Phone Number: " +emp1.empPhNo);
        System.out.println("Employee Salary: " +emp1.getSalary());

        System.out.println("\"Employee 2\"\n");
        System.out.println("Name: "+emp2.empName);
        System.out.println("Employee Number: " +emp2.empNo);
        System.out.println("Phone Number: " +emp2.empPhNo);
        System.out.println("Employee Salary: " +emp2.getSalary());

        System.out.println("\"Employee 3\"\n");
        System.out.println("Name: "+emp3.empName);
        System.out.println("Employee Number: " +emp3.empNo);
        System.out.println("Phone Number: " +emp3.empPhNo);
        System.out.println("Employee Salary: " +emp3.getSalary());

        if (emp1.getSalary() > emp2.getSalary() && emp1.getSalary() > emp3.getSalary())
        {
            highest = emp1.getSalary();
            System.out.println("Employee No. 1 has the highest salary which is "+highest);
        } else if (emp2.getSalary() > emp1.getSalary() && emp2.getSalary() > emp3.getSalary())
        {
            highest = emp2.getSalary();
            System.out.println("Employee No. 2 has the highest salary which is "+highest);
        }
        else if (emp3.getSalary() > emp1.getSalary() && emp3.getSalary() > emp2.getSalary())
        {
            highest = emp3.getSalary();
            System.out.println("Employee No. 3 has the highest salary which is "+highest);
        }

    }
}
