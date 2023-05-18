package ru.netology.kmarusik;

public class Main {

    public static void main(String[] args) {
        int account = 100;
        int payment = 1100;
        int bonus = 100;
        int threshold = 1000;

        if (payment > threshold) {
            int calculatedBonus = payment / bonus;
            System.out.println("present: " + calculatedBonus);
            account = account + payment + calculatedBonus;
        } else {
            account = account + payment;
        }

        System.out.println(account);
    }
}
