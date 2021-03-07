
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int value = Integer.valueOf(scanner.nextLine());
        int totalValue = 0;
        for (int i = 1; i <= value; i++){
            if (totalValue == 0){
                totalValue = 1;
            }else {
                totalValue *= i;
            }
        }
        System.out.println("Factorial " + totalValue);
    }
}
