package com.teachmeskills.lesson_5.task_2;

public class RAM {

    String nameRAM;
    int volumeRAM;

    public RAM() {
        this.nameRAM = "DDR4";
        this.volumeRAM = 16;
    }

    public RAM(String name, int volume) {
        this.nameRAM = name;
        this.volumeRAM = volume;
    }

    public void fullInformationRAM() {     // метод для вывода "название и объем"
        RAM ram = new RAM();
        System.out.println(nameRAM);
        System.out.println(volumeRAM);
    }
}
