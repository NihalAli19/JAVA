class Courses {
    private String CourseName;
    private int courseCode, creditHours;

    public Courses(String courseName, int courseCode, int creditHours) {
        this.CourseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void displayCourseDetails() {
        System.out.println("Course: "+CourseName);
        System.out.println("Course code: "+courseCode);
        System.out.println("Course credit hours: "+creditHours);
    }
}

class Student extends Courses {
    private int coursesEnrolled, creditHours;
    private String sID;
    private String[] courseName;
    private String studentName;
    private String[] grade;
   boolean feesPaid = false;

    public Student(String courseName, int courseCode, int creditHours, int coursesEnrolled, String sID, String[] courseName1, String studentName, String[] grade, boolean feesPaid) {
        super(courseName, courseCode, creditHours);
        this.coursesEnrolled = coursesEnrolled;
        this.sID = sID;
        this.courseName = courseName1;
        this.studentName = studentName;
        this.grade = grade;
        this.feesPaid = feesPaid;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public void setCoursesEnrolled(int coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseName(String[] courseName) {
        this.courseName = courseName;
    }

    public void setGrade(String[] grade) {
        this.grade = grade;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public int getCreditHours() {
        return creditHours;
    }

    public String getsID() {
        return sID;
    }

    public String[] getcourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String[] getGrade() {
        return grade;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: "+studentName);
        System.out.println("Student ID: "+sID);
        System.out.println("Number of courses enrolled: "+coursesEnrolled);
        for (int i = 0; i < coursesEnrolled; i++) {
            System.out.println("Course :"+(i+1) + " "+courseName[i]);
        }
    }

    public int calcCreditHours(Courses[] course) {
        for (int i = 0; i < coursesEnrolled; i++) {
            for (Courses courses: course) {
                if (courses.getCourseName().equals("OOP")) {
                    creditHours += 3;
                }
                else if (courses.getCourseName().equals("CPS Lab")) {
                    creditHours += 1;
                }
                else if (courses.getCourseName().equals("ISL")) {
                    creditHours += 3;
                }
            }
        }
        return creditHours;
    }
    public float calcGPA(Student[] student) {
        float GPA = 0;
        for (int i = 0; i < coursesEnrolled; i++) {
            for (Student student1: student) {
                if (student1.getGrade().equals("A")) {
                    GPA += creditHours *4.00;
                }
                else if (student1.getGrade().equals("A-")) {
                    GPA += creditHours * 3.67;
                }
                else if (student1.getGrade().equals("B+")) {
                    GPA += creditHours * 3.33;
                }
                else if (student1.getGrade().equals("B")) {
                    GPA += creditHours * 3.00;
                }
                else if (student1.getGrade().equals("B-")) {
                    GPA += creditHours * 2.67;
                }
                else if (student1.getGrade().equals("C+")) {
                    GPA += creditHours * 2.33;
                }
                else if (student1.getGrade().equals("C")) {
                    GPA += creditHours * 2.00;
                }
                else if (student1.getGrade().equals("D")) {
                    GPA += creditHours * 1.00;
                }
                else if (student1.getGrade().equals("F")) {
                    GPA += creditHours * 0.00;
                }
            }
        }
        return GPA;
    }

    public double calcFees(Courses[] courses) {
        creditHours = calcCreditHours(courses);
        double tuitionRate = 5000;
        double fees = creditHours * tuitionRate;
        if (feesPaid) {
            fees += (0.05 * creditHours * tuitionRate);
        }

        return fees;
    }
}

public class A2_Q2_22K_4054 {
    public static void main(String[] args) {

    }
}
