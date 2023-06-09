abstract class Animals {
    abstract void cats();
    abstract void dogs();

}

class Cats extends Animals {
    public void cats() {
        System.out.println("Cats meow");
    }

    public void dogs() {
        System.out.println("Dogs bark");
    }
}

class Dogs extends Animals {

    public void cats() {
        System.out.println("Cats meow");
    }
    public void dogs() {
        System.out.println("Dogs bark");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats();
        cat.dogs();
        dog.cats();
        dog.dogs();
    }
}
