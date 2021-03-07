
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessagingService ms = new MessagingService();

        while (true) {
            System.out.println("Insert sender: ");
            String sender = scanner.nextLine();
            if (sender.isEmpty()) {
                break;
            } else {
                System.out.println("Insert message: ");
                String message = scanner.nextLine();
                ms.add(new Message(sender, message));
            }

        }

        System.out.println(ms.getMessages());
    }
}
