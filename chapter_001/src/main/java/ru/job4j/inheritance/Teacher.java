package ru.job4j.inheritance;

public class Teacher extends Profession {
    private String involved;
    private String patience;

    private Teacher(String involved, String patience) {
        this.involved = involved;
        this.patience = patience;
    }
    public String getInvolved() {
        return this.involved;
    }
    public String getPatience() {
        return this.patience;
    }

    public Teacher() {
        System.out.println("Нашим мозгам. За то, что всегда были с нами,\n" + "(хотя многие бы поспорили)");
    }
}
