package ru.job4j.oop;

public class Predator extends Animal{
    public Predator ( ){
        System.out.println("Predator");
    }

    public Predator (String name){
        super(name);
    }

    public static void main (String[] args){
        Predator predator=new Predator();
    }
}
