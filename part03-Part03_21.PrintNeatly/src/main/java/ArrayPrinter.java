
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = array.length;
        
        for (int i = 0; i < index; i++){
            System.out.print(array[i]);
            int getValue = index - 1;
            if (i < getValue){
                System.out.print(", ");
            }
        }
    }
}
