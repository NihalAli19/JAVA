import java.util.Scanner;
class Books {
    protected int BookID, BookISBN;
    protected String BookName, BookAuthor;
    protected float BookPrice;

    Books() {

    }
}

class category1 extends Books {
    String category;

    category1() {

    }
    category1(String category) {
        super();
        this.category = category;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID:");
        BookID = sc.nextInt();
        System.out.println("Enter Book Name:");
        BookName = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Book Author:");
        BookAuthor = sc.nextLine();
        System.out.println("Enter Book ISBN:");
        BookISBN = sc.nextInt();
        System.out.println("Enter Book Price:");
        BookPrice = sc.nextFloat();
    }

    public void display() {
        System.out.println("BookID: " + BookID);
        System.out.println("BookName: " + BookName);
        System.out.println("BookAuthor: " + BookAuthor);
        System.out.println("BookISBN: " + BookISBN);
        System.out.println("BookPrice: " + BookPrice);

    }
}

public class Q5 {
    public static void main(String[] args) {

        category1 c1 = new category1("Comedy");
        c1.input();
        c1.display();
        category1 c2 = new category1();
        c2.input();
        c2.display();
        category1 c3 = new category1();
        c3.input();
        c3.display();
    }
}
