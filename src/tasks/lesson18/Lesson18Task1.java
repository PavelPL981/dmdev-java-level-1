package tasks.lesson18;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа
 */

public class Lesson18Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input value: ");
        int number = input.nextInt();
        System.out.println("Sum digits: " + getSumDigits(number));
    }

    public static int getSumDigits(int value) {
        int result = 0;
        int current = value;

        while (current != 0) {
            result += current % 10;
            current /= 10;
        }
        return result;
    }
}
