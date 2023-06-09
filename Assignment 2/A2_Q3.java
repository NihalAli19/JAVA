abstract class Product implements VIPCustomer {
    protected String name;
    protected float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    abstract public void getDiscountedPrice(int discount);
    abstract public void printDetails();

    public Product add(Product p2) {
        if (p2.name.equals("Ovaiz")) {
            float averagePrice = (this.price + p2.price) / 2;
            String newName = this.name + "&" + p2.name;
            Product p3 = new Book(newName, averagePrice);
            return p3;
        }
        else if (p2.name.equals("Ali")) {
            float averagePrice = (this.price + p2.price) / 2;
            String newName = this.name + "&" + p2.name;
            Product p3 = new Electronic(newName, averagePrice);
            return p3;
        }
        else {
            return null;
        }
    }
}

class Book extends Product {
    private String author;

    public Book(String name, float price) {
        super(name, price);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Author: "+author);
    }
    @Override
    public void getDiscountedPrice(int discount) {
        float discountedPrice;
        if  (balance > 2500) {
            discountedPrice = (price / 100) * discount;
            System.out.println("Discounted Price: "+discountedPrice);
            float balance1 = this.balance;
                  balance1  -= discountedPrice;
            System.out.println("" +name+ " has bought the product.\nBalance: "+balance1);
        }
        else {
            System.out.println("" +name+ " can not buy the product.");
        }
    }

    @Override
    public void buyProduct(Product p1, boolean VIP) {
        if (VIP == true) {
            getDiscountedPrice(10);
        }
        else {
            getDiscountedPrice(5);
        }
    }
}
class Electronic extends Product {
    private String brand;

    public Electronic(String name, float price) {
        super(name, price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void getDiscountedPrice(int discount) {
        float discountedPrice;
        if  (balance > 2500) {
            discountedPrice = (price / 100) * discount;
            System.out.println("Discounted Price: "+discountedPrice);
            float balance1 = this.balance;
            balance1  -= discountedPrice;
            System.out.println("" +name+" has bought the product.\nBalance: "+balance1);
        }
        else {
            System.out.println("" +name+ " can not buy the product.");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Brand: "+getBrand());
    }

    @Override
    public void buyProduct(Product p1, boolean VIP) {
        if (VIP == true) {
            getDiscountedPrice(10);
        }
        else {
            getDiscountedPrice(5);
        }
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, float price) {
        super(name, price);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Size: "+size);
    }

    @Override
    public void getDiscountedPrice(int discount) {
        float discountedPrice;

        if  (balance > 5600) {
            discountedPrice = (price / 100) * discount;
            System.out.println("Discounted Price: "+discountedPrice);
            float balance1 = this.balance;
            balance1  -= discountedPrice;
            System.out.println("" +name+ " has bought the product.\nBalance: "+balance1);
        }
        else {
            System.out.println("" +name+ " can not buy the product.");
        }
    }

    @Override
    public void buyProduct(Product p1, boolean VIP) {
        if (VIP == true) {
            getDiscountedPrice(10);
        }
        else {
            getDiscountedPrice(5);
        }
    }
}
interface Customers {
     String name = "22K-4054";
     float balance = 150000;

    public void buyProduct(Product p1, boolean VIP);
}

interface VIPCustomer extends Customers {
    @Override
    public void buyProduct(Product p1, boolean VIP);
}
public class A2_Q3_22K_4054 {
    public static void main(String[] args) {
        Product b1 = new Book("Nihal", 999);
        ((Book) b1).setAuthor("WookiePlays");
        Product e1 = new Electronic("Zoha", 45933);
        ((Electronic)e1).setBrand("Nvidia");
        Product c1 = new Clothing("Rozina", 569);
        ((Clothing)c1).setSize("Medium");
        b1.buyProduct(b1, true);
        c1.buyProduct(c1, false);

        Product p1 = new Book("Ovaiz", 590);
        Product p2 = new Electronic("Ali", 15230);
        Product p3 = p1.add(p2);
        p3.name = "GOAT";
        ((Electronic)p3).setBrand("Asus");
        p3.buyProduct(p3, true);
        p3.printDetails();

    }
}
