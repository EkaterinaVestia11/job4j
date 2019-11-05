package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String move() {
        return null;
    }

    @Override
    public int passenger() {
        return 0;
    }

    @Override
    public <Amount> int fill(Amount fuel) {
        return 0;
    }
}
