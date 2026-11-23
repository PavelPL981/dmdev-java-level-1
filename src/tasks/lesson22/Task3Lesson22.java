package tasks.lesson22;

/**
 * 3. Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 *    2-х двумерных массивов.
 */

public class Task3Lesson22 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isEqualsArrays = equalsArrays(array1, array2);
        System.out.println(isEqualsArrays);

        int[][] values1 = {
                {1, 2, 3},
                {5, 2, 8, 9},
                {9, 10},
        };
        int[][] values2 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        System.out.println(equalsArrays(values1, values2));
    }

    public static boolean equalsArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsArrays(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length) {
                return false;
            }
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
