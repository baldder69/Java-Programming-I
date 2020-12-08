
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            } else {
                numbers.add(luku);
            }

        }
        int index = numbers.size();
        
        for (int i = 0; i < index; i++){
            int size = numbers.get(i);
            System.out.println(size);
        }

    }
}
