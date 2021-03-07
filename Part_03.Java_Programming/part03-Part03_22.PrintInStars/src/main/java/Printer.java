
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = array.length;
        
        for (int i = 0; i < index; i++){
            
            int arraySize = array[i];
            for (int j = 0; j < arraySize; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

}
