import java.util.Arrays;
import java.util.Scanner;

class Juice {
    private float price;
    private String[] ingredients;
    private String taste;
    public static int obj = 0;
    String sID, sName;

    public Juice() {}
    public Juice(float price, String[] ingredients, String taste, String sID, String sName) {
        this.price = price;
        this.ingredients = ingredients;
        this.taste = taste;
        this.sID = sID;
        this.sName = sName;
        obj++;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public float getPrice() {
        return price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getTaste() {
        return taste;
    }

    public void print() {
        System.out.println("Price: "+price);
        System.out.println("Ingredients: "+ Arrays.toString(ingredients));
        System.out.println("Taste: "+taste);
    }
}
class Sales {
    private String saleID;
    private String customerName;
    private double totalBill;
    private static int numFruitJuices, numVegetableJuice,numMixedJuices;

    public Sales(String customerName, double totalBill) {
        this.customerName = customerName;
        this.totalBill = totalBill;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public static void setNumFruitJuices(int numFruitJuices) {
        Sales.numFruitJuices = numFruitJuices;
    }

    public static void setNumVegetableJuice(int numVegetableJuice) {
        Sales.numVegetableJuice = numVegetableJuice;
    }

    public static void setNumMixedJuices(int numMixedJuices) {
        Sales.numMixedJuices = numMixedJuices;
    }

    public String getSaleID() {
        return saleID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public static int getNumFruitJuices() {
        return numFruitJuices;
    }

    public static int getNumVegetableJuice() {
        return numVegetableJuice;
    }

    public static int getNumMixedJuices() {
        return numMixedJuices;
    }

    public Sales sum(Sales obj) {
        if(!this.customerName.equals(obj.customerName)) {
            throw new IllegalArgumentException("Names are different.");
        }
        int totalJuiceCount = ((this.numFruitJuices + this.numVegetableJuice + this.numMixedJuices) + (obj.numFruitJuices + obj.numVegetableJuice + obj.numMixedJuices));
        return new Sales(customerName, totalBill);
    }
}

class FruitJuice extends Juice {
    private String season;
    public static int numOfFruitJuice = 0;

    public FruitJuice() {}

    public FruitJuice(float price, String[] ingredients, String taste, String season, String sID, String sName) {
        super(price, ingredients, taste, sID, sName);
        this.season = season;
        numOfFruitJuice++;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Fruit juice.");
    }
}

class VegetableJuice extends Juice {
    private String origin;
    public static int numOfVegetableJuice = 0;

    public VegetableJuice() {}
    public VegetableJuice(float price, String[] ingredients, String taste, String origin, String sID, String sName) {
        super(price, ingredients, taste, sID, sName);
        this.origin = origin;
        numOfVegetableJuice++;
    }

   @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Vegetable juice.");
    }
}

class MixedJuice extends Juice {

    public MixedJuice() {}

    public MixedJuice(float price, String[] ingredients, String taste, String sID, String sName) {
        super(price, ingredients, taste, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Mixed juice.");
    }
}

class CitrusJuice extends FruitJuice {
    public CitrusJuice(float price, String[] ingredients, String taste, String season, String sID, String sName) {
        super(price, ingredients, taste, season, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Citrus juice.");
    }
}
class BerryJuice extends FruitJuice {
    public BerryJuice(float price, String[] ingredients, String taste, String season, String sID, String sName) {
        super(price, ingredients, taste, season, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" like Berry juice.");
    }
}
class TropicalJuice extends FruitJuice {
    public TropicalJuice(float price, String[] ingredients, String taste, String season, String sID, String sName) {
        super(price, ingredients, taste, season, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Tropical juice.");
    }
}

class LeafyGreenJuice extends VegetableJuice {
    public LeafyGreenJuice(float price, String[] ingredients, String taste, String origin, String sID, String sName) {
        super(price, ingredients, taste, origin, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Leafy Green juice.");
    }
}
class RootVegetableJuice extends VegetableJuice {
    public RootVegetableJuice(float price, String[] ingredients, String taste, String origin, String sID, String sName) {
        super(price, ingredients, taste, origin, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Root Vegetable juice.");
    }
}
class MixedVegetableJuice extends VegetableJuice {
    public MixedVegetableJuice(float price, String[] ingredients, String taste, String origin, String sID, String sName) {
        super(price, ingredients, taste, origin, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Mixed Vegetable juice.");
    }
}

class FruitAndVeggieJuice extends MixedJuice {
    public FruitAndVeggieJuice(float price, String[] ingredients, String taste, String sID, String sName) {
        super(price, ingredients, taste, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Fruit and Veggie juice.");
    }
}
class SmoothieJuice extends MixedJuice {
    public SmoothieJuice(float price, String[] ingredients, String taste, String sID, String sName) {
        super(price, ingredients, taste, sID, sName);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" "+sID+", "+sName+" likes Smoothie juice.");
    }
}
public class A2_Q1_22K_4054 {
    public static void main(String[] args) {

        String sID, sName;
        String[] ingredients = new String[3];
        int choice, flavour;
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("**Welcome to the Juice Shop**\n");
        System.out.println("Enter your student ID:");
        sID = sc.nextLine();
        System.out.println("Enter your name:");
        sName = sc.nextLine();

        System.out.println("Here are the juices we offer:");
        System.out.println("1. Fruit Juice\n2. Vegetable Juice\n3. Mixed Juice");
        System.out.println("Juice you want to order:");
        choice = sc.nextInt();

        Juice juice = new Juice();
        Sales ob1 = new Sales(sName, juice.getPrice());

        do {
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Please select the flavour:");
                        System.out.println("1. Citrus Juice\n2. Berry Juice\n3. Tropical Juice");
                        System.out.println("Flavour:");
                        flavour = sc.nextInt();
                        FruitJuice fruitJuice = new FruitJuice();
                        switch (flavour) {
                            case 1:
                                ingredients[0] = "Organges";
                                ingredients[1] = "Lemons";
                                ingredients[2] = "Grape fruit";
                                CitrusJuice citrusJuice = new CitrusJuice(399, ingredients, "Sweet and Tangy", "Summer", sID, sName);
                                citrusJuice.print();
                                break;
                            case 2:
                                ingredients[0] = "Blueberries";
                                ingredients[1] = "Raspberries";
                                ingredients[2] = "Strawberries";
                                BerryJuice berryJuice = new BerryJuice(599, ingredients, "Sweet and Sour", "Autumn", sID, sName);
                                berryJuice.print();
                                break;
                            case 3:
                                ingredients[0] = "Pineapple";
                                ingredients[1] = "Guava";
                                ingredients[2] = "Banana";
                                TropicalJuice tropicalJuice = new TropicalJuice(699, ingredients, "Sweet and Sour", "Summer", sID, sName);
                                tropicalJuice.print();
                                break;
                        }

                        System.out.println("Do you want to order something else? (y/n)");
                        ch = sc.next().charAt(0);
                    }while(ch == 'y' || ch == 'Y');
                    break;

                case 2:
                    do {
                        System.out.println("Please select the flavour:");
                        System.out.println("1. Leafy Green Juice\n2. Root Vegetable Juice\n3. Mixed Vegetable Juice");
                        System.out.println("Flavour:");
                        flavour = sc.nextInt();

                        switch (flavour) {
                            case 1:
                                ingredients[0] = "Kale";
                                ingredients[1] = "Spinach";
                                ingredients[2] = "Celery";
                                LeafyGreenJuice leafyGreenJuice = new LeafyGreenJuice(499, ingredients, "Bitter and Earthy", "Dr. Niro Endo", sID, sName);
                                leafyGreenJuice.print();
                                break;
                            case 2:
                                ingredients[0] = "Carrots";
                                ingredients[1] = "Beets";
                                ingredients[2] = "Rutabaga";
                                RootVegetableJuice rootVegetableJuice = new RootVegetableJuice(799, ingredients, "Sweet and Earthy", "Early civilizations of Mediterranean Europe, Asia, Africa and South America.", sID, sName);
                                rootVegetableJuice.print();
                                break;
                            case 3:
                                ingredients[0] = "Cabbage";
                                ingredients[1] = "Broccoli";
                                ingredients[2] = "Cucumbers";
                                MixedVegetableJuice mixedVegetableJuice = new MixedVegetableJuice(699, ingredients, "Sweet and Earthy", " Frank Constable", sID, sName);
                                mixedVegetableJuice.print();
                                break;
                        }
                        System.out.println("Do you want to order something else? (y/n)");
                        ch = sc.next().charAt(0);
                    }while(ch == 'y' || ch == 'Y');
                    break;

                case 3:
                    do {
                        System.out.println("Please select the flavour:");
                        System.out.println("1. Leafy Green Juice\n2. Root Vegetable Juice\n3. Mixed Vegetable Juice");
                        System.out.println("Flavour:");
                        flavour = sc.nextInt();

                        switch (flavour) {
                            case 1:
                                ingredients[0] = "Apple";
                                ingredients[1] = "Carrot";
                                ingredients[2] = "Cucumbers";
                                FruitAndVeggieJuice fruitAndVeggieJuice = new FruitAndVeggieJuice(899, ingredients, "Sweet and Tangy", sID, sName);
                                fruitAndVeggieJuice.print();
                                break;
                            case 2:
                                ingredients[0] = "Strawberries";
                                ingredients[1] = "Almond";
                                ingredients[2] = "Yogurt";
                                SmoothieJuice smoothieJuice = new SmoothieJuice(999, ingredients, "Sweet and Tart", sID, sName);
                                smoothieJuice.print();
                                break;
                        }
                        System.out.println("Do you want to order something else? (y/n)");
                        ch = sc.next().charAt(0);
                    }while(ch == 'y' || ch == 'Y');
                    break;
            }
            System.out.println("Do you want to order something else? (y/n)");
            ch = sc.next().charAt(0);

        }while(ch == 'y' || ch == 'Y');

        System.out.println(Sales.getNumFruitJuices());
        System.out.println(Sales.getNumVegetableJuice());
        System.out.println(Sales.getNumMixedJuices());
    }
}