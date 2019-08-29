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
    public String answer(String question) {
        if ("Привет, Бот.".equals(question)) {
           System.out.println("Привет,умник)."); // заменить ... на правильный ответ rsl = "ответ по заданию".
            return "Привет,умник";
        } else if ("Пока".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            return "До скорой встречи";
        }
        return "Это ставит меня в тупик. Задайте другой вопрос.";
    }
}


