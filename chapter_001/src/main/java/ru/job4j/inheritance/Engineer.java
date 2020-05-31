package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String attentive; //внимательный
    private String accuracy; //аккуратный

    public Engineer(String attentive, String accuracy) {
        this.attentive = attentive;
        this.accuracy = accuracy;
    }
    public String getAttentive() {
        return this.attentive;
    }

    public String getAccuracy() {
        return this.accuracy;
    }

    public Engineer() {

    }
}
