package ru.job4j.tracker;

public class CreateAction extends UserAction{
    @Override
    public boolean execute(Object input,Tracker tracker) {
        return false;
    }

    @Override
    public boolean execute(Input input,Tracker tracker) {
        return false;
    }

    @Override
    String name() {
        return null;
    }
}
