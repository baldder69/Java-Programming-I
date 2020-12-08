
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestAge = 0;
        
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
                    }   
                }
            }
        }
        System.out.println("Age of the oldest: " + greatestAge);

    }
}
