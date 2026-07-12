package lesson3;

public class BooleanExample {

    public static void main(String[] args) {
        int value = 10;
        boolean test = value > 0;

        System.out.println(test);
        System.out.println(!test + "\n");

        int value1 = 0;
        int value2 = 10;
        boolean result1 = value1 != 0;
        boolean result2 = value2 > 0;

        System.out.println(result1 && result2);
        System.out.println(result1 || result2);
    }
}
