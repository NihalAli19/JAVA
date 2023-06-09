class Item {
    String title, author;
    int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return title +" "+ author +" "+ year;
    }
}

class Book extends Item {
    String publisher, ISBN;

    public Book(String title, String author, int year, String publisher, String ISBN) {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return publisher+" "+ ISBN+" "+ super.toString();
    }
}

class Magazine extends Item {
    String publisher;
    int issueNumber;

    public Magazine(String title, String author, int year, String publisher, int issueNumber) {
        super(title, author, year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return publisher+" "+issueNumber+" "+super.toString();
    }
}

class DVD extends Item {
    String director;
    int length;

    public DVD(String title, String author, int year, String director, int length) {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        return director +" "+ length+" "+ super.toString();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Book book = new Book("WookiePlays The Great", "Nihal Ali", 2023, "Oxford Publishers","4210256365637");
        System.out.println(" "+book.toString());
        Magazine mag = new Magazine("Coderz Den on YouTube", "Ovaiz Ali", 2020, "YouTube.com", 4054);
        System.out.println(" "+mag.toString());
        DVD dvd = new DVD("Hello World", "Nihal Ali", 2023, "Basim Baqai", 20);
        System.out.println(" "+dvd.toString());

    }
}
