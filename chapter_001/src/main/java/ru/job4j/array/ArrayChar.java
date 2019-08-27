package ru.job4j.array;

import java.sql.Array;

/**
 * Обертка над строкой.
 */
public class ArrayChar{
    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith (String word,String prefix){
        boolean result=true;
        char[] pref=prefix.toCharArray();
        char[] wrd=word.toCharArray();
        for(int i=0; i<pref.length; i++) {
            if ( pref[ i ] != wrd[ i ] )// проверить. что массив data имеет первые элементы одинаковые с value
                return false;
        }

        return result;
    }
}


/**result = word.startsWith(String.valueOf(pref));
        ;//( !Array.sort(word,prefix) ){
        return false;// проверить. что массив data имеет первые элементы одинаковые с value
        }*/