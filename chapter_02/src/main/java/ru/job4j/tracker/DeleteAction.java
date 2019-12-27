package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name( ) {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute ( Input input,Tracker tracker ){
       // System.out.print("Enter name : ");
        String id = input.askStr("Enter name : ");
        String name = input.askStr("Enter name : ");
        if ( tracker.delete(id)) {
            System.out.println("Item was delete");
        } else { System.out.println("Item not found");
        }
        return true;
    }
}
