class YouTube {
    public void read() {
        System.out.println("This is YouTube.");
    }
}
public class Anonymous_Class_Practice_1 {
    public static void main(String[] args) {

        YouTube youtube = new YouTube() {
            public void read() {
                System.out.println("Subscribe to WookiePlays on YouTube.");
            }
        };

        youtube.read();
    }
}
