package lesson3;

public class Lesson3Example {

    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 3;
        int sum = value1 + value2;
        double division = value1 / (double) value2;
        int res = value1 % value2;

        System.out.println(sum);
        System.out.println(division);
        System.out.println(res + "\n");

        int value = 5;
        value += 25;
        value++;
        value--;
        System.out.println(value);
    }
}
