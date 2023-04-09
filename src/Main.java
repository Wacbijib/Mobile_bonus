public class Main {
    public static void main(String[] args) {

        int mobileBalance = 100;
        int replenishmentAmount = 1900;
        int bonusRubles = replenishmentAmount / 100 * 1;

        if (replenishmentAmount < 1000) {
            bonusRubles = 0;
        }

        int afterReplenishment = replenishmentAmount + bonusRubles + mobileBalance;

        System.out.println("Баланс счета составляет: " + afterReplenishment);
    }
}

// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.