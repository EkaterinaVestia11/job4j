package ru.job4j.condition;

public class MultiMax{
    public int max (int first, int second, int third){
        int result = first;
        if ((second > first) && (second > third)){
            return second;
        } else if ((first > second) && (third > first))
            return third;
        else if ((first > second) && (first > third)) {
        }
        return result;
    }
}



