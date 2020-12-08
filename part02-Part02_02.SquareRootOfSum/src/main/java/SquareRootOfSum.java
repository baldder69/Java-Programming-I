
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstValue = Integer.valueOf(scanner.nextLine());
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt(firstValue + secondValue);
        
        System.out.println(squareRoot);
    }
}
