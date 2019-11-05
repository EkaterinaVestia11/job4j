package ru.job4j.poly;

public interface Transport{
    String move ( );

    int passenger ();

    default <Amount> int fill (Amount fuel){
        int price=0;
        return price;
    }
}
