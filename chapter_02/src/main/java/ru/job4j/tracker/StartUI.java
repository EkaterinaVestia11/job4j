package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner,Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Get a list of items ====");
                System.out.print("Select name: ");
                String name = scanner.nextLine();
                Item[] all = tracker.findAll();
                for(Item item : all) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Change item ====");
                System.out.print("Enter  id: ");
                String name = scanner.nextLine();
                String id = scanner.nextLine();
                Item item = new Item(name);
                Boolean replace;
                if ( tracker.replace(id,item) ) replace=true;
                else replace=false;
                item.setId(id);
                item.setName();
                   System.out.println(name);
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter name : ");
                String name = scanner.nextLine();
                String id = scanner.nextLine();
                Item item = new Item();
                Boolean delete;
                if ( tracker.delete(id) ) delete=true;
                else delete=false;
                item.setId(id);
                    System.out.println(id);
            } else if (select == 4) {
                System.out.println("=== Search by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item findById = tracker.findById(id);
                System.out.println(id);

            } else if (select == 5) {
                System.out.println("=== Search by key ====");
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                Item[] name = tracker.findByName(key) ;
                for(Item item : name) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

