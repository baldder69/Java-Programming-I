
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bird birds = new Bird();
        UserInterface ui = new UserInterface(scanner);
        
        ui.start();

    }

}
