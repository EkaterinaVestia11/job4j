package ru.job4j.tracker;

public abstract class UserAction {

    boolean execute (Object input,Tracker tracker){
        return true;
    }

    boolean execute (Input input,Tracker tracker){
        return true;
    }

    String name ( ){
        return null;
    }
}
