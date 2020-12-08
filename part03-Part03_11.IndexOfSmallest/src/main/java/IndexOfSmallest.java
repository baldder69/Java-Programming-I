
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }else {
                list.add(input);    
            }
        }
        
        int index = list.size();
        int smallest = list.get(0);
        
        for (int i = 0; i < index; i++){
            int getValue = list.get(i);
            if (smallest > getValue){
                smallest = getValue;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < index; i++){
            int getValue = list.get(i);
            if (getValue == smallest){
                System.out.println("Found at index: " + i);
            }
        }


        
    }
}
