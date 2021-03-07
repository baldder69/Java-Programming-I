
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int size = list.size();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                list.add(input);    
                size = list.size();      
            }
        }
            System.out.println("In total: " + size);
    }
}
