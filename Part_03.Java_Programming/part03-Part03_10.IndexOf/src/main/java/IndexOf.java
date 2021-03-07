
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else {
                list.add(input);
            }

        }

        System.out.print("Search for? ");
        int indexValue = Integer.valueOf(scanner.nextLine());
        int index = list.size();

        for (int i = 0; i < index; i++) {
            int getValue = list.get(i);
            if (getValue == indexValue) {
                System.out.println(getValue + " is at index " + i);
            } else {
                
            }
        }

    }
}
