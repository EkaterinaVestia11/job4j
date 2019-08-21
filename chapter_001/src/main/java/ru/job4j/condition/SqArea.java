package ru.job4j.condition;

public class SqArea{
        public static double square(int p,int k) {
            double s = 2;
            double i = Math.sqrt(s / k);
            double square = (p / 2) - i;
            return square;
        }

        public static void main(String[] args) {
            double result1 = square(8, 5);
            System.out.println(" p = 8, k = 5, s = 2, real = " + result1);
        }
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

