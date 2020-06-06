package ru.job4j.array;

public class EndsWith1 {
    public static boolean endsWith1(char[] word, char[] post) {
        boolean result=true;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for(int i=0; i < post.length-1; i++) {
            if (post[ post.length-1-i ] != word[ word.length-1-i ]) { //с конца строки
                return false;
            }
        }
        return result;
    }
}
