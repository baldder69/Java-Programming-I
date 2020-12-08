
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int indexOfSmallest(int[] array) {
        int minValue = array[0];
        int indexSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int minValue = table[startIndex];
        int indexSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (minValue > table[i]) {
                minValue = table[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstIndex = array[index2];
        array[index2] = array[index1];
        array[index1] = firstIndex;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int indexSmallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, indexSmallest, i);
        }
        
    }

}
