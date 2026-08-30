package lesson15;

public class ForExample {

    public static void main(String[] args) {
        forExample();
    }

    private static void forExample() {
        for (int i = 10; i > 0; i--) {
            if (i == 6) {
                continue;
            }
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
