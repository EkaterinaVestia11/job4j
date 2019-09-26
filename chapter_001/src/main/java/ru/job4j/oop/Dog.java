package ru.job4j.oop;

public class Dog {

    public void bark(){
        System.out.println("Gav gav gav");
    }
    public void bark1(){
        System.out.println("Tyaf tyaf tyaf");
    }
    public void bark2() {
        System.out.println("Rrrrrrr");
    }

    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
        polkan.bark();
        sharik.bark1();
        zhychka.bark2();
    }
}
