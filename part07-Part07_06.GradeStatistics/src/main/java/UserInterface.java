
import java.util.Scanner;

public class UserInterface {

    private GradeStatistics grades;
    private Scanner scanner;

    public UserInterface(GradeStatistics grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            Double grade = scanner.nextDouble();

            if (grade == -1) {
                break;
            }
            
            this.grades.add(grade);
            this.grades.average();
            this.grades.passingGradesAverage();
            this.grades.passPercentage();

        }
        System.out.println(grades);
    }
}
