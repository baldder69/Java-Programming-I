
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sumValues = 0;
        int sumNumbers = 0;
        double averageNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            double value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (value != -1) {
                sumValues += value;
                sumNumbers += 1;
                averageNumbers = ((double)(sumValues) / (double)(sumNumbers));
                if (value % 2 == 0) {
                    evenNumbers += 1;
                } else {
                    oddNumbers += 1;
                }
            }
        }
        System.out.println("Sum:" + sumValues);
        System.out.println("Numbers: " + sumNumbers);
        System.out.println("Average:" + averageNumbers);
        System.out.println("Even:" + evenNumbers);
        System.out.println("Odd:" + oddNumbers);

    }
}
