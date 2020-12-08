
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GradeStatistics grades = new GradeStatistics();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(grades, scanner);
        
        ui.start();
        
    }
}
