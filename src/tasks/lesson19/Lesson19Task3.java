package tasks.lesson19;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Lesson19Task3 {

    public static double salary = 600;
    public static double spend = 300;
    public static double investMoney = 0;
    public static double percentOfBroker = 0.1;
    public static double percentOfRent = 0.02;
    public static double sumMoney = 0;

    public static void main(String[] args) {
        double result = calculateMoney(38);
        System.out.println(result);
    }

    public static double calculateMoney(int months) {
        int count = 1;
        while (count <= months) {
            if (count % 6 == 0) {
                salary += 400;
            }
            addSalary();
            spendMoney();
            transferMoneyToBroker();
            rent();
            count++;
        }
        return sumMoney;
    }

    public static void addSalary() {
        sumMoney += salary;
    }

    public static void spendMoney() {
        sumMoney -= spend ;
    }

    public static void transferMoneyToBroker() {
        investMoney += salary * percentOfBroker;
    }

    public static void rent() {
        sumMoney += (investMoney * percentOfRent);
    }
}
