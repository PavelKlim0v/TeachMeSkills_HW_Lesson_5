package com.teachmeskills.lesson_5.task_2;

public class Computer {

    int price;
    String model;
    int RAM;
    int HDD;

    public Computer() {
        this.price = 3000;
        this.model = "ASUS A7N8X-VM";
        enterPriceModel();
    }

    public Computer(int price, String model, int RAM, int HDD) {
        this.price = price;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
        informationComputer();
    }

    void enterPriceModel() {        // метод для вывода стоимость и модель
        System.out.println(price);
        System.out.println(model);
    }

    void informationComputer() {      // методы для вывода всех полей
        System.out.println(price);
        System.out.println(model);
        System.out.println(RAM);
        System.out.println(HDD);
    }

    void fullInformation() {        // методы для вывода полной информации
        RAM RAM = new RAM();
        HDD HDD = new HDD();
        RAM.fullInformationRAM();
        HDD.fullInformationHDD();
    }
}
