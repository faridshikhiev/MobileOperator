//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для начального счёта и суммы пополнения
        double initialBalance = 100; // Начальный счёт в рублях
        double topUpAmount = 1100; // Сумма пополнения в рублях

        // Проверяем, превысила ли сумма пополнения порог 1000 рублей
        if (topUpAmount > 1000) {
            // Рассчитываем сумму бонуса
            double bonus = Math.floor(topUpAmount / 100); // Количество полных сотен минус первые 10 сотен
            // Увеличиваем начальный счёт на сумму пополнения и бонус
            double totalBalance = initialBalance + topUpAmount + bonus;
            // Выводим итоговый счёт и количество бонусных рублей
            System.out.println("Итоговый счёт: " + totalBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + bonus + " рублей");
        } else {
            // Если сумма пополнения не превысила порог, просто добавляем ее к начальному счету
            double totalBalance = initialBalance + topUpAmount;
            // Выводим итоговый счет без бонусов
            System.out.println("Итоговый счёт: " + totalBalance + " рублей");
            System.out.println("Количество бонусных рублей: 0 рублей");
        }

    }
}