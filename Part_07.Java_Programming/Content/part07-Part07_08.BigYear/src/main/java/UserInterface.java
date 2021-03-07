
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        
        ArrayList<Bird> birds = new ArrayList<>();
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String birdLatin = scanner.nextLine();
                birds.add(new Bird(birdName, birdLatin));

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                for (Bird bird : birds){
                    if (bird.getBirdName().equals(birdName)){
                        bird.observationsBird(birdName);
                    }
                }

            } else if (command.equals("All")) {
                for (Bird bird : birds){
                    System.out.println(bird);
                }
                
            } else if (command.equals("One")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                for (Bird bird : birds){
                    if (bird.getBirdName().equals(birdName)){
                        System.out.println(bird);
                    }
                }   
            } else if (command.equals("Quit")){
                break;
            }

        }
    }

}
