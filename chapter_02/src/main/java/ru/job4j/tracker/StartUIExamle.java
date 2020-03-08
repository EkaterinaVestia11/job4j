package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

public class StartUIExamle {
    public void init(Scanner scanner,Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select=Integer.valueOf(scanner.nextLine());
            List<Item> item=null;
            if ( select == 0 ){
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name=scanner.nextLine();

                tracker.add((Item) item);
            } else if ( select == 1 ){
                System.out.println("=== Get a list of items ====");
                System.out.print("Select name: ");
                Item[] all=tracker.findAll().toArray(new Item[ 0 ]);
                for(Item items : all) {
                    System.out.println(item);
                }
            } else if ( select == 2 ){
                System.out.println("=== Change item ====");
                System.out.print("Enter name: ");
                String name=scanner.nextLine();
                String id=scanner.nextLine();
                item=getItem(name ,id);
                if ( tracker.replace(id ,(Item) item) ){
                    System.out.println("Item was update");
                } else {
                    System.out.println("Item not found");
                }
            } else if ( select == 3 ){
                System.out.println("=== Delete item ====");
                System.out.print("Enter name : ");
                String name=scanner.nextLine();
                String id=scanner.nextLine();
                if ( tracker.delete(id) ){
                    System.out.println("Item was delete");
                } else {
                    System.out.println("Item not found");
                }
            } else if ( select == 4 ){
                System.out.println("=== Search by id ====");
                System.out.print("Enter id: ");
                String id=scanner.nextLine();
                List<Item> findById=tracker.findById(id);
                if ( findById != null ){
                    System.out.println(id);
                } else {
                    System.out.println("Item not found");
                }
            } else if ( select == 5 ){
                System.out.println("=== Search by key ====");
                System.out.print("Enter key: ");
                String key=scanner.nextLine();
                Item[] name=tracker.findByName(key).toArray(new Item[ 0 ]);
                for(Item items : name) {
                    System.out.println(item);
                }
            } else if ( select == 6 ){
                run=false;
            }
        }
    }

    private List<Item> getItem( String name ,String id ) {
        return null;
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
        new StartUIExamle().init(scanner, tracker);
    }

}
