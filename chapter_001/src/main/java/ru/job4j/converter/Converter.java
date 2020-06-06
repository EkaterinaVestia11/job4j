package ru.job4j.converter;

/**
 * Class Класс для конвертации валюты
 * @author Екатерина
 * @since 06.06.2020
 * @version 1
 */
public class Converter {
    /**
     * Метод для конвертация рублей в евро
     * @param value ruble
     * @return euro
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Метод для конвертация рублей в доллары
     * @param value ruble
     * @return dollar
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Метод для конвертация евро в рубли
     * @param value euro
     * @return ruble
     */
    public static int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Метод для конвертация долларов в рубли
     * @param value  dollar
     * @return ruble
     */
    public static int dollarToRuble(int value) {
        return value * 60;
    }

    /**
     * Main. Вывод на консоль вариантов обмена
     * @param args-args
     */
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int ruble = euroToRuble(5);
        int rubles = dollarToRuble(24);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 dollares are " + dollar + " dollar.");
        System.out.println("5 euros are " + ruble + " ruble.");
        System.out.println("24 dollares are " + rubles + " ruble.");
    }
}
