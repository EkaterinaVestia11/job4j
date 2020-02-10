package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS={ 10 ,5 ,2 ,1 };

    public int[] change(int money ,int price) {
        int[] rsl=new int[ 100 ];
        int size=0;
        int changes = money - price;
        if ( money == price ){
            changes=0;
        } else {
        for(int i=0; i < COINS.length; i++) {
            while(changes >= 0 && changes >= COINS[i]) {
                   changes = changes - COINS[ i];
                    rsl[ size++ ]=COINS[ i ];
                }
            }
        }
        return Arrays.copyOf(rsl ,size);
    }
}

