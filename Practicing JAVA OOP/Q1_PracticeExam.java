import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Employer {
    static int employer_ID;

    Employer() {
        employer_ID++;
    }

    public abstract void post_vacancy();

    public void receive_application(Candidate candidate) {
        select_candidate(candidate);
    }

    public void select_candidate(Candidate candidate) {
        if (candidate.experience >= 5) {
            System.out.println("Vacancy closed!");
        }
    }
}

class EducationalInstitute extends Employer {
    int num_of_campus;
    int years;
    String ability;

    EducationalInstitute(int num_of_campus) {
        super();
        this.num_of_campus = num_of_campus;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void post_vacancy() {
        System.out.println("How many years did you teach?");
        years = sc.nextInt();
        System.out.println("Your ability to cope up with pressure?");
        ability = sc.nextLine();
    }

}

class ConstructionCompany extends Employer {

    int num_of_active_proj;
    String ability;
    Scanner sc = new Scanner(System.in);
    ConstructionCompany(int num_of_active_proj) {
        super();
        this.num_of_active_proj = num_of_active_proj;
    }

    public void post_vacancy() {
        System.out.println("Your ability to work in remote areas?");
        ability = sc.nextLine();
    }
}

class PharmaceuticalCompany extends Employer {

    double annualBudget;
    String skills;
    Scanner sc = new Scanner(System.in);
    PharmaceuticalCompany(double annualBudget) {
        super();
        this.annualBudget = annualBudget;
    }

    public void post_vacancy() {
        System.out.println("Do you posses good analytical skills?");
        skills = sc.nextLine();
    }
}

class Bank extends Employer {

    int num_of_branches;
    String skills, largeTeam;

    Scanner sc = new Scanner(System.in);
    Bank(int num_of_branches) {
        super();
        this.num_of_branches = num_of_branches;
    }

    public void post_vacancy() {
        System.out.println("Do you posses good communication skills?");
        skills = sc.nextLine();
        System.out.println("Can you work in large team?");
        largeTeam = sc.nextLine();
    }
}

class Moderator {
    static int mod_ID;
    int num_of_job_app;

    Moderator() {
        mod_ID++;
    }

    public void countJobApplication(ArrayList<Candidate> candidates) {
        num_of_job_app = candidates.size();
        System.out.println("Total job applications are: "+num_of_job_app);
    }

    public void write_data() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
            bw.write("Total number of job applications: " + num_of_job_app);
            System.out.println("Data successfully written in file!");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write_data(String message) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("messages.txt"));
            bw.write("Message: " + message);
            System.out.println("Data successfully written in file!");
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Candidate {
    static int candidate_ID;
    String fullname, NIC, DOB, permanent_address;
    int experience;
    double expectedSalary;

    public Candidate(String fullname, String NIC, String DOB, String permanent_address, int experience, double expectedSalary) {
        this.fullname = fullname;
        this.NIC = NIC;
        this.DOB = DOB;
        this.permanent_address = permanent_address;
        this.experience = experience;
        this.expectedSalary = expectedSalary;
        candidate_ID++;
    }
}

public class Q1_PracticeExam {
    public static void main(String[] args) {
        EducationalInstitute educationalInstitute = new EducationalInstitute(50);
        ConstructionCompany constructionCompany = new ConstructionCompany(120);
        PharmaceuticalCompany pharmaceuticalCompany = new PharmaceuticalCompany(560000);
        Bank bank = new Bank(2000);

        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Nihal Ali","4210164556458","19th Feb", "Karachi", 8, 250000));
        candidates.add(new Candidate("Ovaiz Ali","4210165626228","11th July", "Karachi", 15, 350000));
        candidates.add(new Candidate("Rozina Ali","421016455852","20th Nov", "Karachi", 5, 650000));
        candidates.add(new Candidate("Sadruddin Ali","421016885542","18th July", "Karachi", 20, 950000));

        educationalInstitute.post_vacancy();
        constructionCompany.post_vacancy();
        pharmaceuticalCompany.post_vacancy();
        bank.post_vacancy();

        ArrayList<Employer> employers = new ArrayList<>();
        employers.add(educationalInstitute);
        employers.add(constructionCompany);
        employers.add(constructionCompany);
        employers.add(bank);

        for (Employer employer : employers) {
            for (Candidate candidate : candidates) {
                employer.receive_application(candidate);
            }
        }
        Moderator moderator = new Moderator();
        moderator.countJobApplication(candidates);
        moderator.write_data();
        moderator.write_data("Message Passed!");
    }
}
