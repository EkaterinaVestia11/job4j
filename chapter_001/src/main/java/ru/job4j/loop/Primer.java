package ru.job4j.loop;

public class Primer {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (int) ((amount + amount * (percent / 100)) - (monthly * 12));
        }
        year++;
        return year;
    }
}




