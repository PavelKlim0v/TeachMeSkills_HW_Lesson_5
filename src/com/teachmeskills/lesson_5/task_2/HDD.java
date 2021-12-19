package com.teachmeskills.lesson_5.task_2;

public class HDD {

    String nameHDD;
    int volumeHDD;
    String typeHDD;

    public HDD() {
        this.nameHDD = "HMIYHDD002";
        this.volumeHDD = 1000;
        this.typeHDD = "Inner(type)";
    }

    public HDD(String name, int volume, String type) {
        this.nameHDD = name;
        this.volumeHDD = volume;
        this.typeHDD = type;
    }

    public void fullInformationHDD() {     // метод для вывода "название, объем, тип"
        HDD hdd = new HDD();
        System.out.println(nameHDD);
        System.out.println(volumeHDD);
        System.out.println(typeHDD);
    }
}
