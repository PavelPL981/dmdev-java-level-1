package tasks.lesson5;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1917));
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
