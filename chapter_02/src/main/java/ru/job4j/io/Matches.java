package ru.job4j.io;

import java.util.Scanner;

public class Matches{
   // private static Object get;

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Поиграем? У нас 11 спичек,"+
                " за один раз можно взять от 1 до 3 спичек, прсмотрим кто выиграет)");
        boolean turn=true;
        short matches=11; //общее количество спичек
        while (matches > 0) {
            System.out.print(turn ? "first" : "second");
             int size= Integer.parseInt(input.nextLine());
             if ( size <= 3 & size > 0) {
                matches =(short) (matches - size);
                 System.out.print(" осталось : " + matches );
                 System.out.print("  продолжим) \n");
             } else  if ( size == 0 ) {
                 System.out.print("Вы - победитель!!!");
            }
            turn=!turn;
        }
    }
}




