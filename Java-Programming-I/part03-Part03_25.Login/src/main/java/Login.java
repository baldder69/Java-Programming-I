
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enterUser = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String enterPassword = String.valueOf(scanner.nextLine());

        switch (enterUser) {
            case "alex":
                if (enterPassword.equals("sunshine")) {
                    System.out.println("You have successfully logged in!");
                } else {
                    System.out.println("Incorrect username or password!");
                }
                break;

            case "emma":
                if (enterPassword.equals("haskell")) {
                    System.out.println("You have successfully logged in!");
                } else {
                    System.out.println("Incorrect username or password!");
                }
                break;

            default:
                System.out.println("Incorrect username or password!");

        }

    }
}
