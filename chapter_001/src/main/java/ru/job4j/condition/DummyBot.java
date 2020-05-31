package ru.job4j.condition;
/**
 * @author Ekaterina Kalashnikova(Kalasnikovakaterina477@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
           System.out.println("Привет, умник)."); // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        }
        else if ("Пока".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            System.out.println("До скорой встречи."); // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}


