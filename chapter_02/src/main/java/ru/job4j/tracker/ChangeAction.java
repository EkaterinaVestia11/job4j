package ru.job4j.tracker;

public class ChangeAction implements UserAction{

    @Override
    public String name( ) {
    return   "=== Change item ====";
    }

    @Override
    public boolean execute ( Input input,Tracker tracker ){
        System.out.print("Enter name: ");
        String id = input.askStr("");
        String name = input.askStr("");
        Item item=new Item(id,name);
        if ( tracker.replace(id,item) ){
            System.out.println("Item was update");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}