
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        int count = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                list.add(row);
            }

        } catch (Exception e) {
            System.out.println("Error: ");
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());


        for (String numbers : list) {
            int intNumbers = Integer.valueOf(numbers);
            if (lowerBound <= intNumbers && upperBound >= intNumbers) {
                count++;
            }

        }
        
        System.out.println("Numbers: " + count);
        
        



    }

}
