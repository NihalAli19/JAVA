import java.util.Scanner;

class User {
    private int[] userID;
    private String name;
    private int age;
    private double height;
    private String gender;
    private int shoeSize;

    // Default Constructor
    public User() {
        userID = new int[2];
        userID[0] = 12;
        userID[1] = 2034;
        name = "";
        age = 0;
        height = 0.0;
        gender = "";
        shoeSize = 0;
    }

    // Parameterized Constructor
    public User(int[] userID, String name, int age, double height, String gender, int shoeSize) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.shoeSize = shoeSize;
    }

    // Accessor Methods
    public int[] getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    // Mutator Methods
    public void setUserID(int[] userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    // Function to notify the user's demographic
    public String notifyDemographic() {
        if (age >= 0 && age <= 2) {
            return "infant";
        } else if (age >= 3 && age <= 5) {
            return "toddler";
        } else if (age >= 10 && age <= 12) {
            return "child";
        } else if (age >= 13 && age <= 19) {
            return "teenager";
        } else {
            return "adult";
        }
    }
}

class Shoe {
    private int size;
    private String width;
    private String style;
    private String brand;
    private String color;
    private String demographic;

    public Shoe() {
        size = 0;
        width = "";
        style = "";
        brand = "";
        color = "";
        demographic = "";
    }

    public Shoe(int size, String width, String style, String brand, String color, String demographic) {
        this.size = size;
        this.width = width;
        this.style = style;
        this.brand = brand;
        this.color = color;
        this.demographic = demographic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle() {
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getDemographic() {
        return demographic;
    }

    public void setDemographic() {
        this.demographic = demographic;
    }
}
public class A1_Q5_22K_4054 {
    public static void main(String[] args) {

    }
}
