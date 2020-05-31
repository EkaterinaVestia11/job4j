package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
       return  left > right ? left : right;
    }

    public int max(int left, int right, int top) {
        int tmp = max(left, right);
        return max(top, tmp);
    }

    public int max(int left, int right, int top, int bottom) {
        return max(bottom, max(left, right, top));
    }
}

