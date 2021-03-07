
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String enterString = String.valueOf(scanner.nextLine());
            if (enterString.equals("")) {
                break;
            } else {
                String[] pieces = enterString.split(" ");
                int index = pieces.length;
                for (int i = 0; i < index; i++) {
                    System.out.println(pieces[i]);
                }
            }
        }

    }

}
