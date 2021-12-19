package com.teachmeskills.lesson_5.task_1;

import java.util.Scanner;

public class CreditCard {

    String accountNumber = "Номер счета: №12345";      // номер счета
    static int amountOnAccount = 500;                 // текущая сумма на счете
    static int enterAmount;                          // контейнер для вводимой суммы
    Scanner scan = new Scanner(System.in);

    void accrualAmountToCard(int amount) {            // зачислять сумму на карту
        System.out.print("Введите сумму зачисления: ");
        amount = scan.nextInt();
        amountOnAccount += amount;
        System.out.print("Сумма зачислена на ваш счет.\n");
    }

    void withdrawAmountFromCard(int amount) {          // снять с карты сумму
        System.out.print("Введите сумму снятия: ");
        amount = scan.nextInt();
        amountOnAccount -= amount;
        System.out.print("Сумма списана с вашего счета.\n");
    }

    void informationAboutCard() {                   // выводит текущую информацию о карте
        System.out.println("Текущая информация о карте: ");
        System.out.print(accountNumber + ", " + "Сумма на счете" + " " + amountOnAccount + "руб.\n");
    }
}
