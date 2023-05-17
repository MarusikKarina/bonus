package ru.netology.kmarusik;

public class Main {

    public static void main(String[] args) {
        int счет = 100;
        int пополнение = 1100;
        int подарокЗаКаждые = 100;
        int минимальнаяСуммаДляПолученияБонуса = 1000;

        if (пополнение > минимальнаяСуммаДляПолученияБонуса) {
            int подарок = пополнение / подарокЗаКаждые;
            System.out.println("подарок: " + подарок);
            счет = счет + пополнение + подарок;
        } else {
            счет = счет + пополнение;
        }

        System.out.println(счет);
    }
}
