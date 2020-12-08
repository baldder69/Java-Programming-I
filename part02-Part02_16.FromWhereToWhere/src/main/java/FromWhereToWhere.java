
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        for (int i = secondValue; i <= value; i++){
            System.out.println(i);
        }
    }
}
