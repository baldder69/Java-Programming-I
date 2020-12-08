
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = String.valueOf(scanner.nextLine());
            
            if (input.equals("")){
                break;
            } else {
                String[] pieces = input.split(" ");
                int index = pieces.length;
                System.out.println(pieces[0]);
            }
        }

    }
}
