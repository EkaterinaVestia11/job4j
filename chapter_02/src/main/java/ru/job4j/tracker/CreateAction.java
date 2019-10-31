package ru.job4j.tracker;

public class CreateAction implements UserAction{

    @Override
    public boolean execute (Input input,Tracker tracker) {
        return true;
    }

    @Override
    public String name ( ) {
        return null;
    }
}
