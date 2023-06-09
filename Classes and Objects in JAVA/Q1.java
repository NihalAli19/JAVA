import java.util.Scanner;

class Item {
    public String name;
    public int item_ID;
    private float price;
    private int stock;

    public void setPrice(float p) {
        this.price = p;
    }

    public float getPrice() {
        return this.price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void checkStock(int n) {
        if (n > stock) {
            System.out.println("You cannot purchase more items than available in the stock!");
        }
    }
}
public class Q1 {
    public static void main(String[] args) {

        String name;
        char ch;
        int quantity;
        float bill = 0;

        Item item1 = new Item();
        item1.name = "Bat";
        item1.item_ID = 1;
        item1.setPrice(3000);
        item1.setStock(20);

        Item item2 = new Item();
        item2.name = "Ball";
        item2.item_ID = 2;
        item2.setPrice(150);
        item2.setStock(10);

        Item item3 = new Item();
        item3.name = "Helmet";
        item3.item_ID = 3;
        item3.setPrice(5000);
        item3.setStock(2);

        do {
            System.out.println("Enter the name of the item you want to purchase: ");
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();

            if (name.equals(item1.name)) {
                System.out.println("" + item1.getPrice());
                System.out.println("Enter the quantity of the item you want to purchase: ");
                quantity = sc.nextInt();
                item1.checkStock(quantity);
                bill = bill + (quantity* item1.getPrice());
            }
            else if (name.equals(item2.name)) {
                System.out.println("" + item2.getPrice());
                System.out.println("Enter the quantity of the item you want to purchase: ");
                quantity = sc.nextInt();
                item2.checkStock(quantity);
                bill = bill + (quantity* item2.getPrice());
            }
            else if (name.equals(item3.name)) {
                System.out.println("" + item3.getPrice());
                System.out.println("Enter the quantity of the item you want to purchase: ");
                quantity = sc.nextInt();
                item3.checkStock(quantity);
                bill = bill + (quantity* item3.getPrice());
            }


            System.out.println("Do you want to purchase any other item? (y/n): ");
            ch = sc.next().charAt(0);

        }while(ch == 'y' || ch == 'Y');

        System.out.println("Your Bill is: "+bill);

    }
}
