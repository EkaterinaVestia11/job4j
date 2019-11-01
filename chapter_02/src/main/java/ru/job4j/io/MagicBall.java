package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String questionFirst = input.nextLine();
        System.out.println(questionFirst + " Слишком заумно:), введите, пожалуйста, закрытый вопрос)");
        String questionSecond = input.nextLine();
        System.out.println(" Выберите шары под номерами: ");
        System.out.println(" 0 ");
        System.out.println(" 1 ");
        System.out.println(" 2 ");
        System.out.println(" 3");
        System.out.println(" Ваш выбор: ");
        String questionThird = input.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(" Ответ на ваш вопрос: ");
        if ( answer == 1 ) {
            System.out.println("Нет");
        } else if ( answer == 0 ) {
            System.out.println("Да");
        } else { System.out.println("Может быть");
        }
    }
}
