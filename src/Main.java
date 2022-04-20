public class Main {

    public static void main(String[] args) {

        int balance = 100;               // баланс счета до пополнения
        int minReplenishment = 1000;       //  мин. сумма пополнения для начисления бонусов
        int bonusPrice = 100;            // цена бонуса от суммы пополнения
        int replenishment = 900;         // сумма пополнения

        int bonus = replenishment / bonusPrice;
        if (replenishment > minReplenishment) {
            System.out.println(replenishment / bonusPrice + " начисленно бонусных рублей");
        } else {
            bonus = 0;
        }

        System.out.println(balance + replenishment + bonus + " баланс счета");  //вывод результата
    }
}
