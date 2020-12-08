
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number? ");
        int secondValue = Integer.valueOf(scanner.nextLine());
        int totalValue = 0;
        
        for (int i = firstValue; i <= secondValue; i++){
            totalValue += i;
            if (i % 3 == 0){
                
            }
        }
        System.out.println("The sum is " + totalValue);
    }   
}
