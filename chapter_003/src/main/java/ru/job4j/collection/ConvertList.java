package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert( List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
                /// for-each
        for (int[] in: list) { //проходим по строкам
            for (int i: in) { //затем итератором по каждой строке
                rsl.add(i); //и складываем в один список
            }
        }
        return rsl;
    }
}
