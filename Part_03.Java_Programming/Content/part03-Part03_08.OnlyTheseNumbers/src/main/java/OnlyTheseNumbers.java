
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else {
                numbers.add(number);
            }
        }
        System.out.print("From where? ");
        int firstValue = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?");
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        for (int i = firstValue; i <= secondValue ; i++){
            int valuesOutput = numbers.get(i);
            System.out.println(valuesOutput);
        }
    }
}
