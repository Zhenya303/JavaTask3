
public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 100;
        int refill = 1500;


        if (refill > 1000) {
            int a = refill / 100 * 101;
            int sum = balance + a;
            System.out.println("Баланс вашего счета " + sum);


        } else {
            int sum = balance + refill;
            System.out.println("Баланс вашего счета " + sum);
        }


    }
}