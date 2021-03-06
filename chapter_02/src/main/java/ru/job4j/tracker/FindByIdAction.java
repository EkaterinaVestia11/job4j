package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name() {
        return "=== Search by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id:");
        Item item = (Item) tracker.findById(id);
        if (item != null) {
            System.out.println(String.format("Item id:%s, Item name:%s", item.getId(), item.getName()));
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
