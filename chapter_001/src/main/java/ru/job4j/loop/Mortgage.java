package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        do {
            amount = (int) (amount * (1 + percent / 100) - monthly * 12);
            year++;
        } while (amount > 0);
        return year;
    }
}



