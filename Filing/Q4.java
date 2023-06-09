import java.util.Scanner;

class GenericClass<T,V> {
    T username;
    V password;

    String name = "NihalAli4054";
    int pass = 4054;

    public GenericClass(T username, V password) {
        this.username = username;
        this.password = password;
    }

    public void check(T userName, V userPassword) {
        if ((userName.equals(name)) && (userPassword.equals(pass))) {
            System.out.println("Logged in successfully!");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {

        String username;
        int password;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        username = sc.next();
        System.out.println("Enter password:");
        password = sc.nextInt();

        GenericClass<String,Integer> genericClass = new GenericClass(username,password);

        genericClass.check(username,password);
    }
}
