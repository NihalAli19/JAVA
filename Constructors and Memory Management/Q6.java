import java.util.Scanner;
class Car {
    String name, color;
    float priceNew, odometer;

    Car(String name, String color, float priceNew, float odometer) {

        this.name = name;
        this.color = color;
        this.priceNew = priceNew;
        this.odometer = odometer;
    }
    float getPriceAfterUse(float priceNew, float odometer) {
        float usedPrice;
        usedPrice = priceNew * (1 - (odometer / 600000));
        return usedPrice;
    }
    double UpdateMileage(float odometer) {
        double UpdatedOdometer = 0;
        UpdatedOdometer += odometer;
        return UpdatedOdometer + 1542;
    }

    void output() {

        System.out.println("Car name is: " + name);
        System.out.println("Car Color is: " + color);
        System.out.println("Car's showroom price was: " + priceNew);
        System.out.println("Car's new mileage was: " + odometer);

    }
}

public class Q6 {

    public static void main(String[] args) {


        String name, color;
        float priceNew, odometer;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car name:");
        name = sc.nextLine();

        System.out.println("Enter color of the car:");
        color = sc.nextLine();

        System.out.println("Enter The Showroom price of the car:");
        priceNew = sc.nextFloat();

        System.out.println("Enter the distance travelled by the car:");
        odometer = sc.nextFloat();

        Car car = new Car(name, color, priceNew, odometer);

        car.output();
        System.out.println("Used Price is: " + car.getPriceAfterUse(priceNew, odometer));
        System.out.println("Updated Mileage is: " + car.UpdateMileage(odometer));


    }
}
