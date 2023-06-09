/*class Job {
    private int ID;
    private String role;
    private double salary;

    public Job(int ID, String role, double salary) {
        this.ID = ID;
        this.role = role;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    class Person {
       Job job;

        public Person(Job job) {
            this.job = job;
            job.setSalary(900000);
            job.getSalary();
        }
    }
}
public class Q1_Nested_Inner_Class {
    public static void main(String[] args) {

        Job job = new Job(4054,"Head of Dept - Data Analytics",50000);
        Job.Person person1 = job.new Person(job);
        System.out.println("Salary: "+person1.job.getSalary());
    }
}*/
