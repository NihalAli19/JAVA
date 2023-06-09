class A {
    int num = 10;
    public void showcolour() {
        System.out.println("Red!");
    }
}
public class Q1 {
    public static void main(String[] args) {
        final int x = 10; // it is effectively final which means that the JAVA compiler automatically consider it as final. So no need to mention it as final.
        int y = 5;

        A a = new A() {
            interface interfaceTest {
                default void Hello() { // make it default or static to create methods with implementation in interfaces
                    System.out.println("Subscribe to WookiePlays");
                }
            }

            public void showcolour() {             // if class is an abstract class then we need to override the methods.
                System.out.println("Yellow!");
                greet();

            }
          public void greet() {
              System.out.println("Hello World!");
              System.out.println("" +x);
              System.out.println("" +y);
          }
        };
        a.num = 10;

    //    a.greet(); can't do this. Thus, we can call it using the above methods mentioned in class A.

        a.showcolour();
        A a1 = new A();
        a1.showcolour(); // used to call the original method of the class A.
    }
}
