package ru.job4j.tracker;

public class Input extends StubInput{
    public Input (String[] strings){
        super(strings);
    }

    public Input ( ){
        super();
    }

    public int askInt (String s){
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        return 0;
    }
}
