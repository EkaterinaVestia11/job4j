package ru.job4j.tracker;

public class FindByItemAction implements UserAction {

    @Override
    public String name( ) {
        return "=== Search by key ====";
    }

    @Override
    public boolean execute ( Input input,Tracker tracker ){
        System.out.print("Enter key: ");
        String key = input.askStr("");
        Item[] name = tracker.findByName(key) ;
        for(Item item : name) {
            System.out.println(item);
        }
        return true;
    }
}
