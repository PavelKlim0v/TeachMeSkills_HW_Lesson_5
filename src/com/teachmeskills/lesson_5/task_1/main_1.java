package com.teachmeskills.lesson_5.task_1;

/**
 *  Задание 1. (Обязательное задание)
 *    Создать класс CreditCard c полями номер счета, текущая сумма на счете.
 * 	  Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * 	  Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * 	  Добавьте метод, который выводит текущую информацию о карточке.
 * 	  Напишите программу, которая создает три объекта класса CreditCard у которых заданны номер счета и начальная сумма.
 * 	  Тестовый сценарий для проверки:
 * 	  1)Положите деньги на первые две карточки и снимите с третьей.
 * 	  2)Выведите на экран текущее состояние всех трех карточек.
 */

public class main_1 {

    public static void main(String[] args) {
        System.out.print("Текущая информация о счете: " + CreditCard.amountOnAccount + "руб.\n");
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.accrualAmountToCard(CreditCard.enterAmount);              // зачислять сумму на первую карту
        card2.accrualAmountToCard(CreditCard.enterAmount);              // зачислять сумму на вторую карту
        card3.withdrawAmountFromCard(CreditCard.enterAmount);           // снять сумму с третьей карты

        // текущее состояние всех трех карт
        card1.informationAboutCard();               // получить "состояние" карты
        card2.informationAboutCard();
        card3.informationAboutCard();
    }
}
