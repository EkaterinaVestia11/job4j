package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "Vertex";
        String str = "Неизвестное слово: " + eng;
        return str;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String str = bot.engToRus();
        System.out.println("Bot says " + str);
    }
}


