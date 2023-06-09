class Person {
    String name, email;
    String phoneNo;

    public Person(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String toString() {
        return name+" "+email+" "+phoneNo;
    }
}

class Student extends Person {
    String major;
    int studentID;

    public Student(String name, String email, String phoneNo, String major, int studentID) {
        super(name, email, phoneNo);
        this.major = major;
        this.studentID = studentID;
    }

    public float getGPA(float GPA) {
        return GPA;
    }

    public void display() {
        System.out.println("\n** Student Details **");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNo);
        System.out.println("Major: "+major);
        System.out.println("Student ID: "+studentID);
        System.out.println("GPA: "+getGPA(4.00F));
    }
}

class Faculty extends Person {
    String department;
    int facultyID;

    public Faculty(String name, String email, String phoneNo, String department, int facultyID) {
        super(name, email, phoneNo);
        this.department = department;
        this.facultyID = facultyID;
    }

    public String getRank(String rank) {
        return rank;
    }

    public void display() {
        System.out.println("\n** Faculty Details **");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNo);
        System.out.println("Department: "+department);
        System.out.println("Faculty ID: "+facultyID);
        System.out.println("Rank: "+getRank("OOP Theory Lab Professor"));
    }
}

class Staff extends Person {
    String jobTitle;
    int staffID;

    public Staff(String name, String email, String phoneNo, String jobTitle, int staffID) {
        super(name, email, phoneNo);
        this.jobTitle = jobTitle;
        this.staffID = staffID;
    }
    public double getSalary(double salary) {
        return salary;
    }

    public void display() {
        System.out.println("\n** Staff Details **");
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNo);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Staff ID: "+staffID);
        System.out.println("Salary: "+getSalary(54000.500));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student std = new Student("Nihal Ali", "k224054@nu.edu.pk", "03316556440", "Aerospace Engineering", 4054);
        std.display();

        Faculty faculty = new Faculty("Sir Shafique Rehman","shafique.rehman@nu.edu.pk","03152564475","Artificial Intelligence",45452442);
        faculty.display();

        Staff staff = new Staff("Charles", "charles.mashall@nu.edu.pk", "03215624656", "Worker",55421);
        staff.display();
    }
}
