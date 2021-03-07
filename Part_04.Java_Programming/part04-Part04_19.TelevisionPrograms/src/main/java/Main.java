import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Name: ");
            String show = scanner.nextLine();
            if (show.equals("")){
                break;
            } else {
                System.out.println("Duration: ");
                int duration = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(show, duration));
            }
        }
        
        System.out.println("Program's maximum duration? ");
        int durationLength = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram shows : programs){
            if (shows.getDuration() <= durationLength){
                System.out.println(shows);
            }
        }

    }
}
