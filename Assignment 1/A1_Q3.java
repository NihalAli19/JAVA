import java.util.Scanner;
class HeartRates {
    String first_name;
    int ID, day, month, year;

    HeartRates (String first_name, int ID, int day, int month, int year) {
        this.first_name = first_name;
        this.ID = ID;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getAge(int year) {
        int age = 2023 - year;
        return age;
    }
    public int getMaximumHeartRate(int age) {
        int maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }
    public int[] getTargetHeartRate(int maximumHeartRate, int[] targetHeartRate) {

        targetHeartRate[0] = (maximumHeartRate / 100) * 50;
        targetHeartRate[1] = (maximumHeartRate / 100) * 85;

        return targetHeartRate;
    }
}
public class A1_Q3_22K_4054 {
    public static void main(String[] args) {
        String first_name, sID;
        int day, month, year, age, maximumHeartRate;
        int[] targetHeartRate = new int[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        first_name = sc.nextLine();
        System.out.println("Enter you ID:");
        sID = sc.nextLine();
        System.out.println("Enter your date of birth");
        System.out.println("Day:");
        day = sc.nextInt();
        System.out.println("Month:");
        month = sc.nextInt();
        System.out.println("Year:");
        year = sc.nextInt();

        String str = sID;
        String s = str.replaceAll("[^0-9]", "");
        int wID = Integer.parseInt(s);
        wID = wID / 100;
        int ID = wID % 10;
        System.out.println("Your ID:" + ID);

        HeartRates person = new HeartRates(first_name, ID,day,month,year);
        age = person.getAge(year);
        System.out.println("Age: "+age);
        maximumHeartRate = person.getMaximumHeartRate(age);
        System.out.println("Maximum Heart Rate: " +maximumHeartRate);
        person.getTargetHeartRate(maximumHeartRate, targetHeartRate);
        System.out.println("Target Heart Rate should be between: ");
        for (int i : targetHeartRate) {
            System.out.println(" " + i);
        }
    }
}
