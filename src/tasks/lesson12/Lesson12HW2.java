package tasks.lesson12;

public class Lesson12HW2 {

    public static void main(String[] args) {
        run(24.4, 10.1, '+');
    }

    public static void run(double a, double b, char c) {
        switch (c) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("Error");
        }
    }
}
