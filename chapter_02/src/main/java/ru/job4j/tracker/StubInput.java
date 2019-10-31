package ru.job4j.tracker;

public class StubInput extends UserAction{
    private boolean call = false;

    public StubInput (String[] strings){
    }

    public StubInput ( ){

    }

    @Override
    public boolean execute (Object input,Tracker tracker){
        return false;
    }

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute (Input input,Tracker tracker) {
        call = true;
        return false;
    }

    public Object isCall() {
        return call;
    }
    
    public int askInt (String s){
        return 0;
    }
   
}
