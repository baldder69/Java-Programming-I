
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstAmount = new Container();
        Container secondAmount = new Container();
        System.out.println("First: " + firstAmount);
        System.out.println("Second: " + secondAmount);

        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add")) {
                firstAmount.add(amount);
                System.out.println("First: " + firstAmount);
                System.out.println("Second: " + secondAmount);

            } else if (input.equals("move")) {
                if (firstAmount.contains() > 0 && amount <= firstAmount.contains()){
                    secondAmount.add(amount);
                } else if (amount > firstAmount.contains()){
                    secondAmount.add(firstAmount.contains());
                }
                firstAmount.remove(amount);
                System.out.println("First: " + firstAmount);
                System.out.println("Second: " + secondAmount);

            } else if (input.equals("remove")) {
                secondAmount.remove(amount);
                System.out.println("First: " + firstAmount);
                System.out.println("Second: " + secondAmount);

            }
        }
    }

}
