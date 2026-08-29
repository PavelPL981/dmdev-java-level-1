package tasks.lesson12;

public class Lesson12HW1 {

    public static void main(String[] args) {
        clockQuarter(35);
    }

    public static void clockQuarter(int minute){
        if (minute >= 0 && minute <= 15) {
            System.out.println("Quarter 1");
        } else if (minute > 15 && minute <= 30) {
            System.out.println("Quarter 2");
        } else if (minute > 30 && minute <= 45) {
            System.out.println("Quarter 3");
        } else if (minute > 45 && minute <= 60) {
            System.out.println("Quarter 4");
        } else {
            System.out.println("Invalid minute");
        }
    }
}
