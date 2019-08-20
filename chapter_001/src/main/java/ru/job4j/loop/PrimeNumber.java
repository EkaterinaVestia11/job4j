package ru.job4j.loop;

public class PrimeNumber{
    public int calc (int finish){
        int count=0;
        int a;
        int b;

        for(a=2; a <= finish; a++) //перебираем целые числа
        {
            for(b=2; b < a; b++)//перебираем делители
            {
                if (a % b == 0 && b < a) {
                    break;
                } else if (a % b == 0 && b  == a) {
                    count++;
                }
            }
        } return count;
    }
}





// if ( a % 2 == 0 || a % 3 == 0|| a == b) {










