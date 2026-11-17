package lesson20;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printArray(values2);

        int[][] values3 = new int[3][];
        values3[0] = new int[5];
        values3[1] = new int[2];
        values3[2] = new int[1];

        printArray(values3);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] ints = array[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
