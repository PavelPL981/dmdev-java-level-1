package tasks.lesson5;

public class Task3 {

    public static void main(String[] args) {
        int rub = 112;
        if ((rub % 10 == 1) && (rub % 100 != 11)) {
            System.out.println(rub + "рубль");
        } else if ((rub % 10 == 2 || rub % 10 == 3 || rub % 10 == 4)
                && !(rub % 100 == 12 || rub % 100 == 13 || rub % 100 == 14)) {
            System.out.println(rub + " рубля");
        } else {
            System.out.println(rub + " рублей");
        }
    }
}
