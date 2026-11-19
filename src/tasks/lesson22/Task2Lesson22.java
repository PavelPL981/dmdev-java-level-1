package tasks.lesson22;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */

public class Task2Lesson22 {

    public static void main(String[] args) {
        fillArray();

        int[] values = new int[100];
        fillArray2(values);
        Task1Lesson22.printArray(values);
    }

    public static void fillArray() {
        boolean isContinue = true;
        int number = 0;
        int counter = 0;
        int[] values = new int[100];
        while (isContinue) {
            number++;
            if (number % 13 == 0 || number % 17 == 0) {
                values[counter] = number;
                System.out.println(counter + " - " + values[counter]);
                counter++;
                if (counter == 100) {
                    isContinue = false;
                }
            }
        }
    }

    public static void fillArray2(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
