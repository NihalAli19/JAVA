class Job {
    private String role;
    private int ID;
    private double salary;

    public Job(String role, int ID, double salary) {
        this.role = role;
        this.ID = ID;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Person extends Job {
    Job job;

    public Person(String role, int ID, double salary, Job job) {
        super(role, ID, salary);
        this.job = job;
        setSalary(909909);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Job job = new Job("Owner", 4054,809999);
        Person person = new Person("Owner", 786, 809999,job);
        System.out.println("Salary: "+person.getSalary());
    }
}
