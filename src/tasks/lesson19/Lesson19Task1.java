package tasks.lesson19;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Lesson19Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = Integer.parseInt(scanner.nextLine());

        int evenDigitsCount = countEvenDigits(number);
        int oddDigitsCount = countOddDigits(number);

        System.out.println("Even digits count: " + evenDigitsCount);
        System.out.println("Odd digits count: " + oddDigitsCount);
    }

    public static int countEvenDigits(int value) {
        int result = 0;

        do {
            int temp = value % 10;
            if (temp % 2 == 0) {
                result++;
            }
            value /= 10;
        } while (value != 0);

        return result;
    }

    public static int countOddDigits(int value) {
        int result = 0;

        do {
            int temp = value % 10;
            if (temp % 2 != 0) {
                result++;
            }
            value /= 10;
        } while (value != 0);

        return result;
    }
}
