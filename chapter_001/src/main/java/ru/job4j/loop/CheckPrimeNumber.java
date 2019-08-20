package ru.job4j.loop;

public class CheckPrimeNumber{
    public boolean check (int finish){
        boolean prime=false;
        for(int i=2; i <= finish; i++) {
            for(int k=2; k <= i; k++) {
                if (k % i != 0) {
                    prime=true;

                }
            }
        }return prime;
    }
}

 /* public int calc (int finish){
    int count = 0;

     for ( int a = 2; a <= finish; a++ ) {
        for ( int b = (int)Math.sqrt( a ); b != 1; b-- ) {
            if ( a % b == 0 ) {
                continue;
            }
        }
        count++;
    }
        return count;
    }*/
