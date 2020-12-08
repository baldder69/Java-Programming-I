
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        int firstAmount = 0;
        int secondAmount = 0;

        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("add")) {
                if (amount >= 0 && amount <= 100) {
                    firstAmount += amount;
                    if (firstAmount >= 100) {
                        firstAmount = 100;
                    }
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                } else if (amount > 100) {
                    firstAmount = 100;
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                } else {
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                }
            } else if (input.equals("move")) {
                if (amount >= 0 && amount <= firstAmount) {
                    firstAmount -= amount;
                    if (firstAmount <= 0) {
                        firstAmount = 0;
                    }
                    secondAmount += amount;
                    if (secondAmount >= 100) {
                    secondAmount = 100;
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                }
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                } else if (amount > firstAmount) {
                    secondAmount += firstAmount;
                    
                    firstAmount = 0;
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                } 

            } else if (input.equals("remove")) {
                if (amount >= 0 && amount <= secondAmount) {
                    secondAmount -= amount;
                    if (secondAmount <= 0) {
                        secondAmount = 0;
                    }
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                } else if (amount > secondAmount) {
                    secondAmount = 0;
                    System.out.println("First: " + firstAmount + "/100");
                    System.out.println("Second: " + secondAmount + "/100");
                }
            }
        }
    }
}
