
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }else {
                list.add(input);
            }
        }
        
        int sumAll = 0;
        
        for (int sum : list){
            sumAll += sum;
        }

        System.out.println("Sum: " + sumAll);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
