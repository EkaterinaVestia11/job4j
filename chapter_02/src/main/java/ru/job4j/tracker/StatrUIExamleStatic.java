package ru.job4j.tracker;

public class StatrUIExamleStatic {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.add(item);
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
                StartUI.findAll(input,tracker);
            } else if (select == 2) {
                StartUI.replace(input,tracker);
            } else if (select == 3) {
                StartUI.delete(input,tracker);
            } else if (select == 4) {
                StartUI.findByName (input,tracker);
            } else if (select == 5) {
                StartUI.findById(input,tracker);
            } else if ( select == 6 ){
                run=false;
            }
        }
    }

    private void showMenu() {
    }
}
