
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int index = array.length;
        int sumAll = 0;
        for (int i = 0; i < index; i++){
            sumAll += array[i];
        }
        return sumAll;
    }
}
