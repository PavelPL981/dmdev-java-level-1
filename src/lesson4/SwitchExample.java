package lesson4;

public class SwitchExample {

    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                break;
            case 3:
                System.out.println("value = 3");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
