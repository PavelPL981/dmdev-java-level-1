package tasks.lesson22;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class Task4Lesson22 {

    public static void main(String[] args) {
        int[] values = {5, 1, 2, 3, 10, 2, 3};
        int result = sum(values);
        System.out.println(result);
    }

    public static int sum(int[] values) {
        int sum = 0;

        int indexMin = indexOf(values, checkMin(values));
        int indexMax = indexOf(values, checkMax(values));

        for (int i = indexMin; i <= indexMax; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int checkMin(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int checkMax(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int indexOf(int[] values, int value) {
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                index = i;
                return index;
            }
        }
        return index;
    }
}
