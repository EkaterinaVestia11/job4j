package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String name( ) {
        return "=== Search by id ====";
    }

    @Override
    public boolean execute ( Input input,Tracker tracker ){
        System.out.print("Enter id: ");
        String id = input.askStr("");
        Item findById = tracker.findById(id);
        if ( findById != null){
            System.out.println(id);
        } else { System.out.println("Item not found");
        }
        return true;
    }
}
