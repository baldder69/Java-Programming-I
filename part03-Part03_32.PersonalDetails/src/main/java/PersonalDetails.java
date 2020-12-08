
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumAll = 0;
        double averageBirth = 0;
        String longestName = "";
        int averageIndex = 0;
        
        while (true){
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")){
                break;
            } else {
                String[] pieces = input.split(",");
                int index = pieces.length;
                //This index adds the value of the length each time it loops
                averageIndex += index;
                for (int i = 1; i < index; i+=2){
                    sumAll += Integer.valueOf(pieces[i]);
                    averageBirth = sumAll/(averageIndex/2);
                    String nameValues = String.valueOf(pieces[i-1]);
                    if (longestName.length() < nameValues.length()){ 
                        longestName = nameValues;
                    }
                }
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + averageBirth);
    }
}
