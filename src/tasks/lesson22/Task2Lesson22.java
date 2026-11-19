package tasks.lesson22;

/**
 * 2. Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */

public class Task2Lesson22 {

    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        boolean isContinue = true;
        int number = 0;
        int counter = 0;
        int[] values = new int[100];
        while (isContinue) {
            number++;
            if (number % 13 == 0 && number % 17 == 0) {
                values[counter] = number;
                System.out.println(counter + " - " + values[counter]);
                counter++;
                if (counter == 100) {
                    isContinue = false;
                }
            }
        }
    }
}
