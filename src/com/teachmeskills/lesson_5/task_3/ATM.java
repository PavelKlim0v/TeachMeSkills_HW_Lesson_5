package com.teachmeskills.lesson_5.task_3;

public class ATM {

    int[] banknote20;
    int[] banknote50;
    int[] banknote100;

    public ATM(int banknote20Count, int banknote50Count, int banknote100Count) {
        this.banknote20 = new int[banknote20Count];
        this.banknote50 = new int[banknote50Count];
        this.banknote100 = new int[banknote100Count];
    }

    public boolean withdrawCash(int amountToWithdraw) {
        boolean performOperation = false;
        // если ввести отрицательное значение или меньше минимальной суммы
        if (amountToWithdraw < 20) {
            System.out.println("Операция не выполнена!");
            return performOperation;

        } else if (amountToWithdraw >= 20) {
            int totalAmount = (20 * banknote20.length) + (50 * banknote50.length) + (100 * banknote100.length);

            int count100ToWithdraw = -1;
            int count50ToWithdraw = -1;
            int count20ToWithdraw = -1;

            int balanceAfter100 = -1;
            int balanceAfter50 = -1;
            int balanceAfter20 = -1;
            // если в банкомате недостаточно средств
            if (amountToWithdraw > totalAmount) {
                System.out.println("Недостаточно денег в банкомате!");
                return performOperation;
            } else {

                if (banknote100.length > 0) {
                    // расчитываем остаток после выдачи по 100              <----------
                    balanceAfter100 = amountToWithdraw % 100;
                    // расчитываем сколько 100 выдавать
                    count100ToWithdraw = amountToWithdraw / 100;

                    // выдаем 100
                    if (count100ToWithdraw > 0) {
                        if (count100ToWithdraw <= banknote100.length) {
                            banknote100 = new int[banknote100.length - count100ToWithdraw];
                        } else {
                            int diff100 = count100ToWithdraw - banknote100.length;
                            count100ToWithdraw = banknote100.length;
                            banknote100 = new int[0];
                            balanceAfter100 = balanceAfter100 + diff100 * 100;
                        }
                    }
                }
                // рассчитываем остаток после выдачи по 50                  <----------
                balanceAfter50 = balanceAfter100 % 50;
                // рассчитываем сколько 50 выдавать
                count50ToWithdraw = balanceAfter100 / 50;

                // выдаем 50
                if (count50ToWithdraw > 0) {
                    if (count50ToWithdraw <= banknote50.length) {
                        banknote50 = new int[banknote50.length - count50ToWithdraw];
                    } else {
                        int diff50 = count50ToWithdraw - banknote50.length;
                        count50ToWithdraw = banknote50.length;
                        banknote100 = new int[0];
                        balanceAfter50 = balanceAfter50 + diff50 * 50;
                    }
                }
                // рассчитываем остаток после выдачи по 20                  <----------
                balanceAfter20 = balanceAfter50 % 20;
                // рассчитываем сколько 20 выдавать
                count20ToWithdraw = balanceAfter50 / 20;

                // выдаем 20
                if (count20ToWithdraw > 0) {
                    if (count20ToWithdraw <= banknote20.length) {
                        banknote20 = new int[banknote20.length - count20ToWithdraw];
                    } else {
                        int diff20 = count20ToWithdraw - banknote20.length;
                        count20ToWithdraw = banknote20.length;
                        banknote20 = new int[0];
                        balanceAfter20 = balanceAfter20 + diff20 * 20;
                    }
                }

                System.out.println("Запрошена сумма = " + amountToWithdraw);
                System.out.print("Выдано купюр номиналом 100 = " + count100ToWithdraw + " , купюр номиналом 50 = ");
                System.out.println(count50ToWithdraw + " , купюр номиналом 20 = " + count20ToWithdraw);

                performOperation = true;
                if (balanceAfter20 == 0) {
                    System.out.println("Операция выполнена успешно.");
                } else {
                    System.out.println("Операция выполнена успешно.");
                    System.out.println("Остаток от желаемой суммы: " + balanceAfter20);
                }
            }
        }
        return performOperation;
    }

    // метод для получения текущиго баланса банкомата
    public void getATMInfo() {
        int currentBalance = (20 * banknote20.length) + (50 * banknote50.length) + (100 * banknote100.length);
        System.out.println("Текущий баланс банкомата = " + currentBalance);
        System.out.println("Купюр номиналом 20 = " + banknote20.length);
        System.out.println("Купюр номиналом 50 = " + banknote50.length);
        System.out.println("Купюр номиналом 100 = " + banknote100.length);
    }

    // метод для добавления денег в банкомат
    public void addBanknote(int banknote20Count, int banknote50Count, int banknote100Count) {
        int currentBalance = (20 * banknote20Count) + (50 * banknote50Count) + (100 * banknote100Count);
        this.banknote20 = new int[this.banknote20.length + banknote20Count];
        this.banknote50 = new int[this.banknote50.length + banknote50Count];
        this.banknote100 = new int[this.banknote100.length + banknote100Count];
        System.out.println("Добавление денежных средств в банкомат = " + currentBalance);
        System.out.println("Добавлено номиналом 20 = " + banknote20Count + " купюр");
        System.out.println("Добавлено номиналом 50 = " + banknote50Count + " купюр");
        System.out.println("Добавлено номиналом 100 = " + banknote100Count + " купюр");
    }
}
