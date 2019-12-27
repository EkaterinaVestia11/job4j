package ru.job4j.tracker;

public class FindByItemAction implements UserAction {

    @Override
    public String name( ) {
        return "=== Search by key ====";
    }

    @Override
    public boolean execute ( Input input,Tracker tracker ){
        String key = input.askStr("Enter key:");
        Item[] name = tracker.findByName(key) ;
        for(Item item : name) {
           System.out.println(String.format("Item id:%s, Item name:%s", item.getId(), item.getName()));
        }
        return true;
    }
}
