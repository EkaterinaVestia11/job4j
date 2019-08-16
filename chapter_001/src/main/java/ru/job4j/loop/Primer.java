package ru.job4j.loop;

public class Primer{
    public int calc (int finish){
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
    }
}
