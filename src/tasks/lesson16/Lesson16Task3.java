package tasks.lesson16;

/**
 * 3. В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых
 */

public class Lesson16Task3 {

    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);
    }

    public static double sum(double sourceSum) {
        double result = sourceSum;

        for (int year = 1626 + 1; year < 2020; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println("year: " + year + " - result: " + result);
        }

        return result;
    }

}
