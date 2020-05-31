package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String write;
    private String protection;

    public String getWrite() {
        return write;
    }

    public String getProtection() {
        return protection;
    }

    public Programmer automates(Programmer production) {
        return production;
    }

}
