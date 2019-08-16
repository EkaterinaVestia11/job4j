package ru.job4j.loop;

public class Mortgage{
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int x=0;
        int y=0;

       while (x <= y){
           y =(int) (amount + amount*(percent/100));
           x = (monthly*12);
           final boolean b=year == x;
           year++;
       }
      return year;
    }
}


// year =(int) ((int) ((amount*(percent*0.01) + amount)/monthly)*0.082);*/