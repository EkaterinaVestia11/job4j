package ru.job4j.loop;

public class CheckPrimeNumber{
    public boolean check (int finish){
        boolean prime=false;
        for(int i=2; i <= finish; i++) {
            if(i % 2 == 0 |i % 3 == 0 ) continue;
            for(int k=2; k <= i; k++) {
                if (k % i == 0)
                    prime=true;
                 else{prime=false;}

            }
        }return prime;
    }
}


