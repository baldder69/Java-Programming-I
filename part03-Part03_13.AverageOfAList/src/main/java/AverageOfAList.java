
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        
        while (true){
            double input = Double.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            } else {
                list.add(input);
            }
        }
        
        double sumAll = 0;
        double count = 0;
        double averageAll = 0;
        for (double average : list){
            sumAll += average;
            count++;
            averageAll = (sumAll/count);
        }
        System.out.println(averageAll);

        
    }
}
