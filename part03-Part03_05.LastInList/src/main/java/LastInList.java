
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                list.add(input);
            }
        }
        int size = list.size() - 1;
        String last = list.get(size);
        System.out.println(last);
    }
}
