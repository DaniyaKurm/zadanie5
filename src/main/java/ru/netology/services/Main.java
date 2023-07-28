package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int x = 1;
        while (x < 13) {
            System.out.println("Месяц" + x);
            x = x + 1;
        }
        for (int i = 1; i < 13; i++) {
            System.out.println(i);
        }

    }
}
