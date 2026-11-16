package lesson20;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 22;
        array[9] = 98;
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }


        int[] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);

        values[2] = 100;
        System.out.println(values[2]);
    }
}
