package ru.job4j.condition;

public class Max{
    public int max (int left,int right){
        int result = left;
        int max = left > right ? left : right;
        return result;
    }

    public int max (int left,int right,int top) {
        int tmp = max(left, right);
        return max(top, tmp);
    }

    public int max (int left,int right,int top, int bottom) {
        return max(bottom, max(left, right, top));
    }
}

