import java.util.Scanner;

class Details {
    String customer_name, product_name,supplier_name, clocation, slocation, date;
    long contact_no;
    int stock;
    static int cID = 0, pID = 0, sID = 0, saleID = 0;
    float price = 0;
    char category;

    Scanner sc = new Scanner(System.in);

    public void inputInfo() {
        System.out.println("Enter the date:(DD/MM/YYYY)");
        date = sc.nextLine();
        System.out.println("Enter Customer name:");
        customer_name = sc.nextLine();
        System.out.println("Enter customer's contact number: (XXXXXXXXXXX)");
        contact_no = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter customer's location:");
        clocation = sc.nextLine();
        System.out.println("Enter Product name:");
        product_name = sc.nextLine();
        System.out.println("Enter product price: ");
        price = sc.nextFloat();
        System.out.println("Enter products in stock:");
        stock = sc.nextInt();
        stock--;
        sc.nextLine();
        System.out.println("Enter Supplier's name:");
        supplier_name = sc.nextLine();
        System.out.println("Enter supplier's location:");
        slocation = sc.nextLine();
        System.out.println("Enter supplier category:(A,B,or C)");
        category = sc.next().charAt(0);
        cID++;
    }
    public void displaySales() {
        float total = 0;
        System.out.println("Date: "+date);
        System.out.println("Sale ID: "+(saleID++));
        System.out.println("Product name: "+product_name);
        System.out.println("Customer name: "+customer_name);
        System.out.println("Supplier name: "+supplier_name);
        System.out.println("Total price: "+(total+price));
    }
}
public class Q1 {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);

        Details sale = new Details();

        do {
            sale.inputInfo();
            sale.displaySales();
            System.out.println("Do you want to create new sales? (y/n)");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
