import java.util.Scanner;

interface MessageService {
    abstract void send(String message, String recipient);
    abstract String receive();
}

class WhatsApp implements MessageService {

    String msg;

    @Override
    public void send(String message, String recipient) {
        System.out.println("Message sent to "+recipient+ "\nNihal Ali: "+message);
        msg = message;
    }

    @Override
    public String receive() {
        return  msg;
    }
}
public class Q5 {
    public static void main(String[] args) {

        String message, recipient;

        Scanner sc = new Scanner(System.in);

        WhatsApp chat = new WhatsApp();

        System.out.println("Enter recipient's name: ");
        recipient = sc.nextLine();
        System.out.println("Enter message: ");
        message = sc.nextLine();

        chat.send(message,recipient);
        System.out.println("Recieved message: "+chat.receive());
    }
}
