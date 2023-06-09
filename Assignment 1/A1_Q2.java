import java.util.Scanner;

class DataScientist {
    String first_name, last_name, country;
    private String high_education;
    int age;
    private int num_qn, num_ans;
    Scanner sc = new Scanner(System.in);
    public void setNum_qn(int num_qn) {
        this.num_qn = num_qn;
    }
    public int getNum_qn() {
        return this.num_qn;
    }
    public void setNum_ans(int num_ans) {
        this.num_ans = num_ans;
    }
    public int getNum_ans() {
        return this.num_ans;
    }

    public void setHigh_education(String high_education) {
        this.high_education = high_education;
    }
    DataScientist (String first_name, String last_name, String high_education, String country, int age) { //int num_ans, int num_qn) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.high_education = high_education;
        this.country = country;
        this.age = age;
       // this.num_qn = num_qn;
        //this.num_ans = num_ans;
    }

    public void AskQuestion() {
        System.out.println("Your question: ");
        String qn = sc.nextLine();
        this.num_qn++;
    }
    public void AnswerProblem() {
        String ans;
        System.out.println("Your answer: ");
        ans = sc.nextLine();
        this.num_ans++;
    }
}

class Admin {
    String first_name, last_name, country;
    int age, AdminID, adminUser;
    private int dataSci_User;

    Admin (int AdminID) {//value of admin???
        this.AdminID = AdminID;
    }

    public void setDataSci_User(int dataSci_User) {
        this.dataSci_User = dataSci_User;
    }

    public int getDataSci_User() {
        return this.dataSci_User;
    }
    private int TotalUser() {
        this.getDataSci_User();
        return 0;
    }
    
    public int getTotal_User() {
        return this.TotalUser();
    }
}
public class A1_Q2_22K_4054 {
    public static void main(String[] args) {
        String select, first_name, last_name, high_education, country;
        int AdminID = 0, age, num_ans, num_qn, dataSci_User = 0, TotalUser = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Are you a Data Scientist or Admin?");
        select = sc.nextLine();
        if (select.equals("Data Scientist") || select.equals("Data scientist") || select.equals("data scientist")) {
            System.out.println("Enter your First Name: ");
            first_name = sc.nextLine();
            System.out.println("Enter your Last Name: ");
            last_name = sc.nextLine();
            System.out.println("Enter your Higher Education: ");
            high_education = sc.nextLine();
            System.out.println("Enter you Country: ");
            country = sc.nextLine();
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            dataSci_User++;
            DataScientist ds1 = new DataScientist(first_name, last_name, high_education, country, age);
            
            char ch;
            do {
                System.out.println("Do you want to ask a question? (y/n)");
                ch = sc.next().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    ds1.AskQuestion();
                    System.out.println("Do you want to ask another question? (y/n)");
                    ch = sc.next().charAt(0);
                }
            } while (ch == 'y' || ch == 'Y');

            do {
                System.out.println("Do you want to answer a problem? (y/n)");
                ch = sc.next().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    ds1.AnswerProblem();
                    System.out.println("Do you want to answer another problem? (y/n)");
                    ch = sc.next().charAt(0);
                }
            } while (ch == 'y' || ch == 'Y');
        }
        else if (select.equals("Admin") || select.equals("admin")) {
            System.out.println("Enter your First Name: ");
            first_name = sc.nextLine();
            System.out.println("Enter your Last Name: ");
            last_name = sc.nextLine();
            System.out.println("Enter you Country: ");
            country = sc.nextLine();
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            
            Admin admin = new Admin(AdminID);
            
            admin.setDataSci_User(dataSci_User);
            admin.getTotal_User();
        }
    }
}
