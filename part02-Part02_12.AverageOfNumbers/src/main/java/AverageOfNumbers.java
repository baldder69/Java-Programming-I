
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalNumbers = 0;
        double totalSum = 0;
        double averageNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number != 0) {
                totalSum += number;
                totalNumbers += 1;
                averageNumbers = totalSum / totalNumbers;
                continue;
            }

        }
        System.out.println("Average of the numbers: " + averageNumbers);
    }   
}