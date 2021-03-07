
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(" ");
                int index = pieces.length;
                for (int i = 0; i < index; i++) {
                    String values = pieces[i];
                    if (values.contains("av")){
                        System.out.println(values);
                    }
                }
                
            }
        }

    }
}
