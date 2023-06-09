class Student{
    String name;
    int age;
    String Course;
    Student(String name , int age , String course){
        this.Course = course;
        this.name = name;
        this.age = age;
    }
    public void studentDetails(){
        System.out.println("My name is "+this.name+", I am "+this.age+" Years old. "+" I am studying "+this.Course);
    }

}
public class Q4 {
    public static void main(String[] args){
        Student std = new Student("Nihal",18,"\"OOP in JAVA\"");
        std.studentDetails();
    }
}


