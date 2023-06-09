import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class Task3 {


    public int[] sortArrays(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arrOfIntegers = new int[5];

        arrOfIntegers[0] = 15;
        arrOfIntegers[1] = 5;
        arrOfIntegers[2] = 10;
        arrOfIntegers[3] = 786;
        arrOfIntegers[4] = 110;

        for (int i = 0; i < arrOfIntegers.length; i++) {
            System.out.println(""+arrOfIntegers[i]);
        }

        Task3 task3 = new Task3();
        task3.sortArrays(arrOfIntegers);
        for (int i = 0; i < arrOfIntegers.length; i++) {
            System.out.println(""+arrOfIntegers[i]);
        }
    }
}
