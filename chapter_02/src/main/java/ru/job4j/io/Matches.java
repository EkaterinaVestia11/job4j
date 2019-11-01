package ru.job4j.io;

import java.util.Scanner;

public class Matches{
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Поиграем? У нас 11 спичек,"+
                " за один раз можно взять от 1 до 3 спичек, прсмотрим кто выиграет)");
        boolean run=true;
        while (run) {
            System.out.print("Делаем ход: \n");
            System.out.println("1 спичка");
            System.out.println("2 спички");
            System.out.println("3 спички");
            System.out.print("Делайте ваш выбор: ");
            int select=Integer.valueOf(input.nextLine());
            int n = 11; //общее количество спичек
            int m = 3; //максимальное взятие за ход
            int x = 0; //взятие текущее
            int[] array = new int[3];

            if( n - m >= 0) {
                x = m; //
            } else { x = m - n;
            }
            for(int i = 0; i <= m; i++) {
                if (i >= 0 || i <= 0) {
                    System.out.print("Напоминание) от 1 до 3 ");
                    System.out.print("Повторите выбор: ");
                }else { int y = n - x; //остаток после взятия пользователем
                }
            }
            if ( select == 0 )  {
                if (x > 0 ) {
                   continue;
                } else if ( x == 0) {
                    System.out.print("Подравления с победой))) вы- победитель!!! ");
                } else select++;
            }
        }
    }
}



