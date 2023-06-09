import java.util.Scanner;
class Book {
    private String title;
    private String authorName;
    private double price;
    public Book(String title, String authorName, double price) {
        this.authorName = authorName;
        this.price = price;
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String authorName) {
        this.authorName = authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return authorName;
    }
    public double getPrice() {
        return price;
    }
    public void bookDetails() {
        System.out.println("Book Title: " +this.getTitle());
        System.out.println("Author's Name: " +this.getAuthor());
        System.out.println("Book's Price: " +this.getPrice());
    }

}
public class Q2 {
    public static void main(String[] args) {

        String name;
        double p;

        Scanner sc = new Scanner(System.in);

        Book book = new Book("Great Expectations", "Charles Dickens",79.75);
        System.out.println("Choose the options below\n1)Set book's title\n2)Set book's author name\n3)Set book's price\n4)Get book's title\n5)Get book's author name\n6)Get book's price\n7)Book's details\n\nYour choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            name = sc.next();
            book.setTitle(name);
        }
        else if (choice == 2) {
            name = sc.next();
            book.setAuthor(name);
        }
        else if (choice == 3) {
            p = sc.nextDouble();
            book.setPrice(p);
        }
        else if (choice == 4) {
            book.getTitle();
        }
        else if (choice == 5) {
            book.getAuthor();
        }
        else if (choice == 6) {
            book.getPrice();
        }
        else if (choice == 7) {
            book.bookDetails();
        }
        else {
            System.out.println("Your input is incorrect!");
        }
    }
}
