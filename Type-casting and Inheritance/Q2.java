import java.util.Scanner;

class Person {
    String name, nationality, address;
    int age;
    long CNIC;

    Scanner sc = new Scanner(System.in);
    Person() {
        System.out.println("I am person.");
    }

    public void input() {
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your address:");
        address = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your nationality:");
        nationality = sc.nextLine();

        do {
            System.out.println("Enter your CNIC: (not > 13 or < 13 digits)");
            CNIC = sc.nextLong();
        } while (String.valueOf(CNIC).length() != 13);
    }
        public void display () {
            System.out.println("Name:" +name);
            System.out.println("Age:"+age);
            System.out.println("Address:"+address);
            System.out.println("Nationality:"+nationality);
            System.out.println("CNIC:"+CNIC);
        }
    }

class Employee extends Person {
    String nameofCompany, companyLocation;
    int yearsWorked;

    Employee() {
        super();
        System.out.println("I am Employee.");
    }

    public void inputDetails() {
        sc.nextLine();
        System.out.println("Enter the name of the Company:");
        nameofCompany = sc.nextLine();
        System.out.println("Enter the company's location(city):");
        companyLocation = sc.nextLine();
        System.out.println("Enter the number of years worked in the company:");
        yearsWorked = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Name of company: "+nameofCompany);
        System.out.println("Company's location: "+companyLocation);
        System.out.println("Number of years worked: "+yearsWorked);
    }
}

class Manager extends Employee {
    int n;
    String[] employeeNames;
    Manager() {
        super();
        System.out.println("I am Manager.");
    }
    public void inputEmployeeNames() {
        System.out.println("Enter the number of employees:");
        n = sc.nextInt();

        employeeNames = new String[n];

        sc.nextLine();
        int j = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of Employee "+(j+1)+":");
            employeeNames[i] = sc.nextLine();
        }
    }
    public void displayEmployeeNames() {
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Name of Employee "+(i+1)+" is: "+employeeNames[i]);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {

        Manager m = new Manager();
        m.input();
        m.inputDetails();
        m.inputEmployeeNames();
        System.out.println("\n");
        m.display();
        System.out.println("\n");
        m.displayDetails();
        System.out.println("\n");
        m.displayEmployeeNames();
    }
}
