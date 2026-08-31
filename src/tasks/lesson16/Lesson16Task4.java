package tasks.lesson16;

/**
 * 4. Написать программу, определяющую, является ли введенное число простым,
 * т.е. делится без остатка только на 1 и само на себя
 */

public class Lesson16Task4 {

    public static void main(String[] args) {
        boolean result = isSimpleNumber(7);
        System.out.println(result);
    }

    public static boolean isSimpleNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return  false;
            }
        }
        return true;
    }
}
