package lesson10;

public class Task1 {

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        }
        return secondValue;
    }

    public static void main(String[] args) {
        System.out.println(getMax(10, 15));
    }
}
