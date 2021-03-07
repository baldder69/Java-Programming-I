
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int value = Integer.valueOf(scanner.nextLine());
        int totalValue = 0;
        for (int i = 0; i <= value; i++){
            totalValue += i;
        }
        System.out.println("The sum is " + totalValue);
    }
}
