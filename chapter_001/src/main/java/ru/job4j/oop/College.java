package ru.job4j.oop;

public class College {
    public  static  void main(String[] args) {
     Freshman freshman = new Freshman();
     Studying st = freshman;
     Object obj = freshman;
     Object worker = new Studying();
        System.out.println(new Freshman());
        System.out.println(new Studying());
        System.out.println(new Object());
    }
}
