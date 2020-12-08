
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCube = 0;
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            } else{
                int cubeInt = Integer.valueOf(input);
                numberCube = cubeInt * cubeInt * cubeInt;
                System.out.println(numberCube);
            }
        }

    }
}
