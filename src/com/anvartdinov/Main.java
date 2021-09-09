package com.anvartdinov;

public class Main {

    public static void main(String[] args) {
        int bonusThreshold = 1000;
        int rublesForOneBonusRubles = 100;
        int bonusRubles = 0;

        int balance = 100; // Меняем здесь стартовый баланс
        int transfer = 1100; // Меняем здесь сумму трансфера
        System.out.println("Баланс счета клиента: " + balance + "р.");
        System.out.println("Пришел трансфер на сумму : " + transfer + "р.");

        if (transfer > bonusThreshold) {
            bonusRubles = transfer / rublesForOneBonusRubles;
        }
        balance += transfer + bonusRubles;
        System.out.println("Бонусных рублей на счет: " + bonusRubles + "р.");
        System.out.println("Итоговый баланс: " + balance + "р.");
    }
}
