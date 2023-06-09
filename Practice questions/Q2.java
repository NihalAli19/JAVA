import java.util.Scanner;

class SmartNet {
    int packageNo;
    String fullName;
    long CNIC, tele_no;

    static int count;
    SmartNet(int packageNo, String fullName,long CNIC, long tele_no) {
        this.packageNo = packageNo;
        this.fullName = fullName;
        this.CNIC = CNIC;
        this.tele_no = tele_no;
        count++;
    }

    public void packageDetails(int packageNo) {
        if (packageNo == 1) {
            System.out.println("1. Monthly Super:\n25Mbps for Rs. 3500/month");
        }
        else if (packageNo == 2) {
            System.out.println("2. Monthly Plus:\n20Mbps for Rs. 2300/month");
        }
        else if (packageNo == 3) {
            System.out.println("3. Monthly Light:\n10Mbps for Rs. 1500/month");
        }
        else {
            System.out.println("Incorrect Internet Package selection.");
        }
    }
    public void authentication(int CNIC) {
        if (this.CNIC == CNIC) {
            System.out.println("Package Request Sent!");
        }
        else {
            System.out.println("Incorrect User. Package Request Rejected!");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        int packageNo;
        String fullName;
        long CNIC, tele_no;
        char ch;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Following are the available Internet Packages:");
            System.out.println("1. Monthly Super:\n25Mbps for Rs. 3500/month");
            System.out.println("2. Monthly Plus:\n20Mbps for Rs. 2300/month");
            System.out.println("3. Monthly Light:\n10Mbps for Rs. 1500/month");
            System.out.println("Package choice:");
            packageNo = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your full name:");
            fullName = sc.nextLine();
            System.out.println("Enter your CNIC Number:");
            CNIC = sc.nextLong();
            System.out.println("Enter your telephone number:");
            tele_no = sc.nextLong();

            SmartNet customer = new SmartNet(packageNo, fullName, CNIC, tele_no);

            customer.authentication((int) CNIC);
            customer.packageDetails(packageNo);
            System.out.println("Total Packages created: " + SmartNet.count);
            System.out.println("\nDo you want to select another package? (y/n)");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
