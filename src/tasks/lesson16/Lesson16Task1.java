package tasks.lesson16;

/**
 * 1. Написать программу, высчитывающую факториал введенного целого числа
 */

public class Lesson16Task1 {

    public static void main(String[] args) {
        int value = 5;
        int result = calculateFactorial(value);
        int result2 = calculateFactorialWhile(value);
        System.out.println(result);
        System.out.println(result2);
    }

    public static int calculateFactorial(int number) {
        if (number <= 0) {
            return 0;
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static int calculateFactorialWhile(int number) {
        int result = 1;
        int count = 1;

        while (count <= number) {
            result *= count;
            count++;
        }

        return result;
    }
}
