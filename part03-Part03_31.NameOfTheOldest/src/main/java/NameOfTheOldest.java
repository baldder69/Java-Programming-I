
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestAge = 0;
        String nameOldest = "";

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(",");
                int index = pieces.length;
                for (int i = 1; i < index; i += 2) {
                    int values = Integer.valueOf(pieces[i]);
                    if (greatestAge < values) {
                        greatestAge = values;
                        nameOldest = pieces[i - 1];
                    }
                }

            }
        }
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
