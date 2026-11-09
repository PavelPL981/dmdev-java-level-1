package tasks.lesson19;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
 */

public class Lesson19Task2 {

    public static void main(String[] args) {
        int result = reverse(4508);
        System.out.println(result);
    }

    public static int reverse(int value) {
        int result = 0;

        while (value != 0) {
            int temp = value % 10;
            result = result * 10 + temp;
            value /= 10;
        }

        return result;
    }
}
