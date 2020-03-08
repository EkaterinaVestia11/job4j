package ru.job4j.tracker;

public class CreateAction implements UserAction{

    @Override
    public String name( ) {
       return  "=== Create a new Item ==== ";
        }

   @Override
    public boolean execute ( Input input,Tracker tracker ){
        //System.out.print ("Enter name: ");
        String name=input.askStr ("Enter name: ");
        Item item=new Item(name ,4) ;
        tracker.add (item);
        return true;
    }
}
