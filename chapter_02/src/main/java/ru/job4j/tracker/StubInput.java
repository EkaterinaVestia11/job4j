package ru.job4j.tracker;

public class StubInput extends Input{

     public StubInput (String[] strings){
    }

  //  @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
