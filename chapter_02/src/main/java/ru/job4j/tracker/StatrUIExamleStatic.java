package ru.job4j.tracker;

public class StatrUIExamleStatic {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void findAlItem (Input input,Tracker tracker){
        System.out.println("=== Get a list of items ====");
        System.out.print("Select name: ");
        Item[] all=tracker.findAll();
        for(Item item : all) {
            System.out.println(item);
        }
    }
    public static void replaceItem ( Input input,Tracker tracker ){
            System.out.println("=== Change item ====");
            System.out.print("Enter name: ");
            String id = input.askStr("");
            String name = input.askStr("");
            Item item=new Item(id,name);
            if ( tracker.replace(id,item) ){
                System.out.println("Item was update");
            } else {
                System.out.println("Item not found");
            }
        }
    public static void deleteItem ( Input input,Tracker tracker ){
        System.out.println("=== Delete item ====");
        System.out.print("Enter name : ");
        String id = input.askStr("");
        String name = input.askStr("");
        if ( tracker.delete(id)) {
            System.out.println("Item was delete");
        } else { System.out.println("Item not found");
        }
    }
    public static void findByNameItem ( Input input,Tracker tracker ){
        System.out.println("=== Search by id ====");
        System.out.print("Enter id: ");
        String id = input.askStr("");
        Item findById = tracker.findById(id);
        if ( findById != null){
            System.out.println(id);
        } else { System.out.println("Item not found");
        }
    }
    public static void findByIdItem ( Input input,Tracker tracker ){
        System.out.println("=== Search by key ====");
        System.out.print("Enter key: ");
        String key = input.askStr("");
        Item[] name = tracker.findByName(key) ;
        for(Item item : name) {
            System.out.println(item);
        }
    }

    public void init(Input input, Tracker tracker){
        boolean run=true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select=input.askInt("");
            if ( select == 0 ){
                StartUI.createItem(input,tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input,tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input,tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input,tracker);
            } else if (select == 4) {
                StartUI.findByNameItem (input,tracker);
            } else if (select == 5) {
                StartUI.findByIdItem(input,tracker);
            } else if ( select == 6 ){
                run=false;
            }
        }
    }

    private void showMenu() {
    }
}
