import java.util.Scanner;
import java.util.Random;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: \n"
                    + "1 - add a joke \n"
                    + "2 - draw a joke \n"
                    + "3 - list jokes \n"
                    + "X - stop");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String jokeAdded = scanner.nextLine();
                jokes.addJoke(jokeAdded);

            } else if (input.equals("2")) {
                System.out.println(jokes.drawJoke());

            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();

            } else if (input.equals("X")) {
                break;
            }

        }
    }

}
