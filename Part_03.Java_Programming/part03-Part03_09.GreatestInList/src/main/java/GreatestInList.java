
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }else {
                list.add(input);
            }
        }
        int index = list.size();
        int greatest = list.get(0);
        
        for (int i = 0; i < index; i++){
            int valueOutput = list.get(i);
            if (greatest < valueOutput){
                greatest = valueOutput;
            }
        }
        
        
        System.out.print("The greatest number: " + greatest);
        
        // implement finding the greatest number in the list here
    }
}
