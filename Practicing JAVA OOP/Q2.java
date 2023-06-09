class StaticClassExample {
    int x = 50;
    static class A {
        StaticClassExample staticClassExample = new StaticClassExample();
        public void display() {
            System.out.println(staticClassExample.x); // accessed via object of the Outer class as we cannot access it directly without making it static.
        }
    }
}
public class Q2 {
    public static void main(String[] args) {

    }
}
