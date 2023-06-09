class Course {
    protected String courseName, classAvenue, courseCode;
    protected int creditHours;

    Course(String courseName, String classAvenue, String courseCode, int creditHours) {
        this.courseName = courseName;
        this.classAvenue = classAvenue;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
}

class JavaCourse extends Course {
    String teacherName;

    JavaCourse(String courseName, String classAvenue, String courseCode, int creditHours, String teacherName) {
        super(courseName, classAvenue, courseCode, creditHours);
        this.teacherName = teacherName;
    }

    public void display() {
        System.out.println("Course name: "+courseName);
        System.out.println("Course code: "+courseCode);
        System.out.println("Class avenue: "+classAvenue);
        System.out.println("Course credit hours: "+creditHours);
        System.out.println("Course teacher's name: "+teacherName);
    }
}
public class Q1 {
    public static void main(String[] args) {
        String courseName = "Object Oriented Programming Lab", classAvenue = "CS-Block, Lab 10", teacherName = "Shafique Rehman", courseCode = "CL-1004";
        int creditHours = 1;

        JavaCourse cdetails = new JavaCourse(courseName, classAvenue, courseCode, creditHours, teacherName);

        cdetails.display();
    }
}