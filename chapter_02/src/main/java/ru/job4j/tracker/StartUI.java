package ru.job4j.tracker;

public class StartUI {
    public static void createItem ( Input input,Tracker tracker ){
    }
    public static void findAllItem ( Input input,Tracker tracker ){
    }
    public static void replaceItem ( Input input,Tracker tracker ){
    }
    public static void deleteItem ( Input input,Tracker tracker ){
    }
    public static void findByNameItem ( Input input,Tracker tracker ){
    }
    public static void findByIdItem ( Input input,Tracker tracker ){
    }

    public void init( Input input,Tracker tracker,UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions =new UserAction[]{ new CreateAction() };
        new StartUI().init(input, tracker, actions);
    }
}

