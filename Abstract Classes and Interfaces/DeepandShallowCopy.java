// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Student {
    String name;
    int stdID;
    Student (String name, int stdID) {
        this.name = name;
        this.stdID = stdID;
    }
    Student (Student ob1) {
        this.name = ob1.name;
        this.stdID = ob1.stdID;
    }

}
public class DeepandShallowCopy {
    public static void main(String[] args) {

        //Deep Copy
        Student std1 = new Student("Nihal", 4054);
        Student std2 = new Student(std1);

        System.out.println(std1.name);
        System.out.println(std2.name);
        System.out.println(std2.stdID);

        std1.name = "Ali";
        System.out.println(std2.name);
        System.out.println(std1.name);

        //Shallow Copy
        Student std3 = std1;
        System.out.println(std1.name);
        System.out.println(std3.name);
        std1.name = "Ovaiz";
        System.out.println(std3.name);

    }
}
