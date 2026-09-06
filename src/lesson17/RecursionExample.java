package lesson17;

/**
 * Написать программу, высчитывающую факториал числа (при помощи рекурсии)
 */

public class RecursionExample {

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }
}
