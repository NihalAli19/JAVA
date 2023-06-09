class Vehicle {
    private int speed, noOfWheels;
    private String colour;

    Vehicle() {

    }
    Vehicle (int speed, String colour, int noOfWheels) {
        this.speed = speed;
        this.colour = colour;
        this.noOfWheels = noOfWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColour() {
        return colour;
    }
    public int getWheels() {
        return noOfWheels;
    }
}

class MotorVehicle extends Vehicle {
    private String licenseplate;

    MotorVehicle() {
        super();
    }
    public void setlicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
    public String getlicenseplate() {
        return licenseplate;
    }
}

class Car extends MotorVehicle {
    private int noOfDoors;
    Car() {
        super();
    }
    public void setnoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    public int getnoOfDoors() {
        return noOfDoors;
    }

    public void display() {
        System.out.println("Vehicle speed: "+getSpeed());
        System.out.println("Vehicle colour: "+getColour());
        System.out.println("Number of wheels: "+getWheels());
        System.out.println("License Plate: "+getlicenseplate());
        System.out.println("Number of doors: "+getnoOfDoors());
    }
}
public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setSpeed(250);
        c1.setColour("Yellow");
        c1.setWheels(4);
        c1.setlicenseplate("WookiePlaysYouTube 4054");
        c1.setnoOfDoors(4);
        c1.display();
    }
}
