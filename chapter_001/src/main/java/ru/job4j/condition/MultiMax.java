package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = third;
        if ((first >= second) && (first >= third)) {
            return first;
        } else if ((second >= first) && (second >= third)) {
            return second;
        } else if (first >= second) {
            return third;
        }
        return result;
    }
}




